/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package auliayf.app.models;

/**
 *
 * @author windows 7
 */
public class JenisKaryawanModel {

    private String KdJenisKaryawan;
    private String JenisKaryawan;

    public JenisKaryawanModel(String kode, String jenis) {
        this.KdJenisKaryawan = kode;
        this.JenisKaryawan = jenis;
    }

    public void setKdJenisKaryawan(String kode) {
        this.KdJenisKaryawan = kode;
    }

    public void setJenisKaryawan(String jenis) {
        this.JenisKaryawan = jenis;
    }

    public String getKdJenisKaryawan() {
        return this.KdJenisKaryawan;
    }

    public String getJenisKaryawan() {
        return this.JenisKaryawan;
    }

    @Override
    public String toString() {
        return this.JenisKaryawan;
    }
}
