/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package auliayf.app.controllers;

import auliayf.app.models.PenjualanDetailModel;
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
public class PenjualanDetailController implements Database.Controller<PenjualanDetailModel> {

    @Override
    public List<PenjualanDetailModel> getAllObjects() {
        List<PenjualanDetailModel> models = new ArrayList<>();
        Statement state = null;
        ResultSet rs = null;

        try {
            state = Database.getInstance().createStatement();
            rs = state.executeQuery("SELECT  * FROM PenjualanDetail");

            while (rs.next()) {
                PenjualanDetailModel model = new PenjualanDetailModel(
                        rs.getInt("id"),
                        rs.getString("KdPenjualan"),
                        rs.getString("KdOnderdil"),
                        rs.getInt("Qty"));

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
    public PenjualanDetailModel getObject(String query) {
        PenjualanDetailModel model = null;
        Statement state = null;
        ResultSet rs = null;

        try {
            state = Database.getInstance().createStatement();
            rs = state.executeQuery(query);

            while (rs.next()) {
                model = new PenjualanDetailModel(
                        rs.getInt("id"),
                        rs.getString("KdPenjualan"),
                        rs.getString("KdOnderdil"),
                        rs.getInt("Qty"));
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
    public int insert(PenjualanDetailModel object) {
        final String insertQuery = "INSERT INTO PenjualanDetail VALUES (null, ?, ?, ?)";
        int result = 0;
        PreparedStatement state = null;

        try {
            state = Database.getInstance().prepareStatement(insertQuery);

            state.setObject(1, object.getKdPenjualan());
            state.setObject(2, object.getKdOnderdil());
            state.setObject(3, object.getQty());

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
