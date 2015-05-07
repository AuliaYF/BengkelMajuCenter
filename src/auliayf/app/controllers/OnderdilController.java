/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package auliayf.app.controllers;

import auliayf.app.models.OnderdilModel;
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
public class OnderdilController implements Database.Controller<OnderdilModel> {

    @Override
    public List<OnderdilModel> getAllObjects() {
        List<OnderdilModel> models = new ArrayList<>();
        Statement state = null;
        ResultSet rs = null;

        try {
            state = Database.getInstance().createStatement();
            rs = state.executeQuery("SELECT  * FROM Onderdil");

            while (rs.next()) {
                OnderdilModel model = new OnderdilModel(
                        rs.getString("KdOnderdil"),
                        rs.getString("NamaOnderdil"),
                        rs.getString("MerkOnderdil"),
                        rs.getString("HargaOnderdil"),
                        rs.getString("TipeOnderdil"));

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
    public OnderdilModel getObject(String query) {
        OnderdilModel model = null;
        Statement state = null;
        ResultSet rs = null;

        try {
            state = Database.getInstance().createStatement();
            rs = state.executeQuery(query);

            while (rs.next()) {
                model = new OnderdilModel(
                        rs.getString("KdOnderdil"),
                        rs.getString("NamaOnderdil"),
                        rs.getString("MerkOnderdil"),
                        rs.getString("HargaOnderdil"),
                        rs.getString("TipeOnderdil"));
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
    public int insert(OnderdilModel object) {
        final String insertQuery = "INSERT INTO Onderdil VALUES (?, ?, ?, ?, ?)";
        int result = 0;
        PreparedStatement state = null;

        try {
            state = Database.getInstance().prepareStatement(insertQuery);

            state.setObject(1, object.getKdOnderdil());
            state.setObject(2, object.getNamaOnderdil());
            state.setObject(3, object.getMerkOnderdil());
            state.setObject(4, object.getHargaOnderdil());
            state.setObject(5, object.getTipeOnderdil());

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
