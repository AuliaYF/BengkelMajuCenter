/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package auliayf.app.controllers;

import auliayf.app.models.JenisKaryawanModel;
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
public class JenisKaryawanController implements Database.Controller<JenisKaryawanModel> {

    @Override
    public List<JenisKaryawanModel> getAllObjects() {
        List<JenisKaryawanModel> models = new ArrayList<>();
        Statement state = null;
        ResultSet rs = null;

        try {
            state = Database.getInstance().createStatement();
            rs = state.executeQuery("SELECT * FROM JenisKaryawan");

            while (rs.next()) {
                JenisKaryawanModel model = new JenisKaryawanModel(
                        rs.getString("KdJenisKaryawan"),
                        rs.getString("JenisKaryawan"));

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
    public JenisKaryawanModel getObject(String query) {
        JenisKaryawanModel model = null;
        Statement state = null;
        ResultSet rs = null;

        try {
            state = Database.getInstance().createStatement();
            rs = state.executeQuery(query);

            while (rs.next()) {
                model = new JenisKaryawanModel(
                        rs.getString("KdJenisKaryawan"),
                        rs.getString("JenisKaryawan"));
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
    public int insert(JenisKaryawanModel object) {
        final String insertQuery = "INSERT INTO JenisKaryawan VALUES (?, ?)";
        int result = 0;
        PreparedStatement state = null;

        try {
            state = Database.getInstance().prepareStatement(insertQuery);

            state.setObject(1, object.getKdJenisKaryawan());
            state.setObject(2, object.getJenisKaryawan());

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
