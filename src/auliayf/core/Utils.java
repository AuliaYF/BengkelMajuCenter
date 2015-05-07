/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package auliayf.core;

import javax.swing.JOptionPane;

/**
 *
 * @author windows 7
 */
public class Utils {

    public static void showLog(int type, String title, String message) {
        JOptionPane.showMessageDialog(null, message, title, type);
    }
}
