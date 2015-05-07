/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package auliayf.app.models;

/**
 *
 * @author windows 7
 */
public class JenisServiceModel {

    private String KdJenisService;
    private String JenisService;
    private String Keterangan;

    public JenisServiceModel(String kode, String jenis, String ket) {
        this.KdJenisService = kode;
        this.JenisService = jenis;
        this.Keterangan = ket;
    }

    public void setKdJenisService(String kode) {
        this.KdJenisService = kode;
    }

    public void setJenisService(String jenis) {
        this.JenisService = jenis;
    }

    public void setKeterangan(String Keterangan) {
        this.Keterangan = Keterangan;
    }

    public String getKdJenisService() {
        return this.KdJenisService;
    }

    public String getJenisService() {
        return this.JenisService;
    }

    public String getKeterangan() {
        return this.Keterangan;
    }

    @Override
    public String toString() {
        return this.JenisService;
    }
}
