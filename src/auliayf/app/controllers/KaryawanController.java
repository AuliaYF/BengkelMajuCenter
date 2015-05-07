/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package auliayf.app.controllers;

import auliayf.app.models.KaryawanModel;
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
public class KaryawanController implements Database.Controller<KaryawanModel> {

    @Override
    public List<KaryawanModel> getAllObjects() {
        List<KaryawanModel> models = new ArrayList<>();
        Statement state = null;
        ResultSet rs = null;

        try {
            state = Database.getInstance().createStatement();
            rs = state.executeQuery("SELECT * FROM Karyawan");

            while (rs.next()) {
                KaryawanModel model = new KaryawanModel(
                        rs.getString("KdKaryawan"),
                        rs.getString("NamaKaryawan"),
                        rs.getString("AlamatKaryawan"),
                        rs.getString("NoHpKaryawan"),
                        rs.getString("KdJenisKaryawan"));

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
    public KaryawanModel getObject(String query) {
        KaryawanModel model = null;
        Statement state = null;
        ResultSet rs = null;

        try {
            state = Database.getInstance().createStatement();
            rs = state.executeQuery(query);

            while (rs.next()) {
                model = new KaryawanModel(
                        rs.getString("KdKaryawan"),
                        rs.getString("NamaKaryawan"),
                        rs.getString("AlamatKaryawan"),
                        rs.getString("NoHpKaryawan"),
                        rs.getString("KdJenisKaryawan"));
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
    public int insert(KaryawanModel object) {
        final String insertQuery = "INSERT INTO Karyawan VALUES (?, ?, ?, ?, ?)";
        int result = 0;
        PreparedStatement state = null;

        try {
            state = Database.getInstance().prepareStatement(insertQuery);

            state.setObject(1, object.getKdKaryawan());
            state.setObject(2, object.getNamaKaryawan());
            state.setObject(3, object.getAlamatKaryawan());
            state.setObject(4, object.getNoHpKaryawan());
            state.setObject(5, object.getKdJenisKaryawan());

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
