/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package auliayf.app.controllers;

import auliayf.app.models.PelangganModel;
import auliayf.core.Database;
import auliayf.core.Utils;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author windows 7
 */
public class PelangganController implements Database.Controller<PelangganModel> {

    @Override
    public List<PelangganModel> getAllObjects() {
        List<PelangganModel> models = new ArrayList<>();
        Statement state = null;
        ResultSet rs = null;

        try {
            state = Database.getInstance().createStatement();
            rs = state.executeQuery("SELECT * FROM Pelanggan");

            while (rs.next()) {
                PelangganModel model = new PelangganModel(
                        rs.getString("KdPelanggan"),
                        rs.getString("NamaPelanggan"),
                        rs.getString("JenisKelamin"),
                        rs.getString("AlamatPelanggan"),
                        rs.getString("NoHP"));

                models.add(model);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Utils.showLog(JOptionPane.ERROR_MESSAGE, "Error while collecting data", ex.getMessage());
        } finally {
            try {
                Database.clearInstance();
                if (state != null) {
                    state.close();
                }
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException ex) {
                Utils.showLog(JOptionPane.ERROR_MESSAGE, "Error while closing connection", ex.getMessage());
            }
        }

        return models;
    }

    @Override
    public PelangganModel getObject(String query) {
        PelangganModel model = null;
        Statement state = null;
        ResultSet rs = null;

        try {
            state = Database.getInstance().createStatement();
            rs = state.executeQuery(query);

            while (rs.next()) {
                model = new PelangganModel(
                        rs.getString("KdPelanggan"),
                        rs.getString("NamaPelanggan"),
                        rs.getString("JenisKelamin"),
                        rs.getString("AlamatPelanggan"),
                        rs.getString("NoHP"));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Utils.showLog(JOptionPane.ERROR_MESSAGE, "Error while collecting data", ex.getMessage());
        } finally {
            try {
                Database.clearInstance();
                if (state != null) {
                    state.close();
                }
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException ex) {
                Utils.showLog(JOptionPane.ERROR_MESSAGE, "Error while closing connection", ex.getMessage());
            }
        }

        return model;
    }

    @Override
    public int insert(PelangganModel object) {
        final String insertQuery = "INSERT INTO Pelanggan VALUES (?, ?, ?, ?, ?)";
        int result = 0;
        PreparedStatement state = null;

        try {
            state = Database.getInstance().prepareStatement(insertQuery);

            state.setObject(1, object.getKdPelanggan());
            state.setObject(2, object.getNamaPelanggan());
            state.setObject(3, object.getJenisKelamin());
            state.setObject(4, object.getAlamatPelanggan());
            state.setObject(5, object.getNoHP());

            result = state.executeUpdate();

        } catch (ClassNotFoundException | SQLException ex) {
            Utils.showLog(JOptionPane.ERROR_MESSAGE, "Error while inserting data", ex.getMessage());
        } finally {
            try {
                Database.clearInstance();
                if (state != null) {
                    state.close();
                }
            } catch (SQLException ex) {
                Utils.showLog(JOptionPane.ERROR_MESSAGE, "Error while closing connection", ex.getMessage());
            }
        }

        return result;
    }
}
