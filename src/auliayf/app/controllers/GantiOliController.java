/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package auliayf.app.controllers;

import auliayf.app.models.GantiOliModel;
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
public class GantiOliController implements Database.Controller<GantiOliModel> {

    @Override
    public List<GantiOliModel> getAllObjects() {
        List<GantiOliModel> models = new ArrayList<>();
        Statement state = null;
        ResultSet rs = null;

        try {
            state = Database.getInstance().createStatement();
            rs = state.executeQuery("SELECT  * FROM GantiOli");

            while (rs.next()) {
                GantiOliModel model = new GantiOliModel(
                        rs.getString("KdTransaksi"),
                        rs.getString("TanggalTransaksi"),
                        rs.getString("KdKaryawan"),
                        rs.getString("KdPelanggan"),
                        rs.getString("KdOli"));

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
    public GantiOliModel getObject(String query) {
        GantiOliModel model = null;
        Statement state = null;
        ResultSet rs = null;

        try {
            state = Database.getInstance().createStatement();
            rs = state.executeQuery(query);

            while (rs.next()) {
                model = new GantiOliModel(
                        rs.getString("KdTransaksi"),
                        rs.getString("TanggalTransaksi"),
                        rs.getString("KdKaryawan"),
                        rs.getString("KdPelanggan"),
                        rs.getString("KdOli"));
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
    public int insert(GantiOliModel object) {
        final String insertQuery = "INSERT INTO GantiOli VALUES (?, ?, ?, ?, ?)";
        int result = 0;
        PreparedStatement state = null;

        try {
            state = Database.getInstance().prepareStatement(insertQuery);

            state.setObject(1, object.getKdTransaksi());
            state.setObject(2, object.getTanggalTransaksi());
            state.setObject(3, object.getKdKaryawan());
            state.setObject(4, object.getKdPelanggan());
            state.setObject(5, object.getKdOli());

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
