/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package auliayf.app.controllers;

import auliayf.app.models.OliModel;
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
public class OliController implements Database.Controller<OliModel> {

    @Override
    public List<OliModel> getAllObjects() {
        List<OliModel> models = new ArrayList<>();
        Statement state = null;
        ResultSet rs = null;

        try {
            state = Database.getInstance().createStatement();
            rs = state.executeQuery("SELECT  * FROM Oli");

            while (rs.next()) {
                OliModel model = new OliModel(
                        rs.getString("KdOli"),
                        rs.getString("TipeOli"),
                        rs.getString("UkuranOli"),
                        rs.getString("HargaOli"));

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
    public OliModel getObject(String query) {
        OliModel model = null;
        Statement state = null;
        ResultSet rs = null;

        try {
            state = Database.getInstance().createStatement();
            rs = state.executeQuery(query);

            while (rs.next()) {
                model = new OliModel(
                        rs.getString("KdOli"),
                        rs.getString("TipeOli"),
                        rs.getString("UkuranOli"),
                        rs.getString("HargaOli"));
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
    public int insert(OliModel object) {
        final String insertQuery = "INSERT INTO Oli VALUES (?, ?, ?, ?)";
        int result = 0;
        PreparedStatement state = null;

        try {
            state = Database.getInstance().prepareStatement(insertQuery);

            state.setObject(1, object.getKdOli());
            state.setObject(2, object.getTipeOli());
            state.setObject(3, object.getUkuranOli());
            state.setObject(4, object.getHargaOli());

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
