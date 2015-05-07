/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package auliayf.app.models;

/**
 *
 * @author windows 7
 */
public class JenisKendaraanModel {

    private String KdJenisKendaraan;
    private String JenisKendaraan;

    public JenisKendaraanModel(String kode, String jenis) {
        this.KdJenisKendaraan = kode;
        this.JenisKendaraan = jenis;
    }

    public void setKdJenisKendaraan(String kode) {
        this.KdJenisKendaraan = kode;
    }

    public void setJenisKendaraan(String jenis) {
        this.JenisKendaraan = jenis;
    }

    public String getKdJenisKendaraan() {
        return this.KdJenisKendaraan;
    }

    public String getJenisKendaraan() {
        return this.JenisKendaraan;
    }

    @Override
    public String toString() {
        return this.KdJenisKendaraan;
    }
}
