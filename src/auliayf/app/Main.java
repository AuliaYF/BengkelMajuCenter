/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package auliayf.app;

import auliayf.app.controllers.*;

/**
 *
 * @author windows 7
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new CuciKendaraanController().getAllObjects();
        new DetailServiceController().getAllObjects();
        new GantiOliController().getAllObjects();
        new JadwalKerjaController().getAllObjects();
        new JenisKaryawanController().getAllObjects();
        new JenisKendaraanController().getAllObjects();
        new JenisServiceController().getAllObjects();
        new KaryawanController().getAllObjects();
        new KendaraanController().getAllObjects();
        new OliController().getAllObjects();
        new OnderdilController().getAllObjects();
        new PelangganController().getAllObjects();
        new PenjualanController().getAllObjects();
        new PenjualanDetailController().getAllObjects();
        new ServiceController().getAllObjects();
    }
}
