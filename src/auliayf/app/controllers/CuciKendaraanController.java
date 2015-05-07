/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package auliayf.app.controllers;

import auliayf.app.models.CuciKendaraanModel;
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
public class CuciKendaraanController implements Database.Controller<CuciKendaraanModel> {

    @Override
    public List<CuciKendaraanModel> getAllObjects() {
        List<CuciKendaraanModel> models = new ArrayList<>();
        Statement state = null;
        ResultSet rs = null;

        try {
            state = Database.getInstance().createStatement();
            rs = state.executeQuery("SELECT  * FROM CuciKendaraan");

            while (rs.next()) {
                CuciKendaraanModel model = new CuciKendaraanModel(
                        rs.getString("KdCuci"),
                        rs.getString("PlatNomor"),
                        rs.getString("TanggalCuci"),
                        rs.getString("KdKaryawan"),
                        rs.getString("KdPelanggan"),
                        rs.getString("Harga"));

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
    public CuciKendaraanModel getObject(String query) {
        CuciKendaraanModel model = null;
        Statement state = null;
        ResultSet rs = null;

        try {
            state = Database.getInstance().createStatement();
            rs = state.executeQuery(query);

            while (rs.next()) {
                model = new CuciKendaraanModel(
                        rs.getString("KdCuci"),
                        rs.getString("PlatNomor"),
                        rs.getString("TanggalCuci"),
                        rs.getString("KdKaryawan"),
                        rs.getString("KdPelanggan"),
                        rs.getString("Harga"));
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
    public int insert(CuciKendaraanModel object) {
        final String insertQuery = "INSERT INTO CuciKendaraan VALUES (?, ?, ?, ?, ?, ?)";
        int result = 0;
        PreparedStatement state = null;

        try {
            state = Database.getInstance().prepareStatement(insertQuery);

            state.setObject(1, object.getKdCuci());
            state.setObject(2, object.getPlatNomor());
            state.setObject(3, object.getTanggalCuci());
            state.setObject(4, object.getKdKaryawan());
            state.setObject(5, object.getKdPelanggan());
            state.setObject(6, object.getHarga());

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
