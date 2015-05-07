/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package auliayf.app.models;

/**
 *
 * @author windows 7
 */
public class KaryawanModel {

    private String KdKaryawan;
    private String NamaKaryawan;
    private String AlamatKaryawan;
    private String NoHpKaryawan;
    private String KdJenisKaryawan;

    public KaryawanModel(String kode, String nama, String alamat, String noHp, String jenis) {
        this.KdKaryawan = kode;
        this.NamaKaryawan = nama;
        this.AlamatKaryawan = alamat;
        this.NoHpKaryawan = noHp;
        this.KdJenisKaryawan = jenis;
    }

    public void setKdKaryawan(String kode) {
        this.KdKaryawan = kode;
    }

    public void setNamaKaryawan(String nama) {
        this.NamaKaryawan = nama;
    }

    public void setAlamatKaryawan(String alamat) {
        this.AlamatKaryawan = alamat;
    }

    public void setNoHpKaryawan(String noHp) {
        this.NoHpKaryawan = noHp;
    }

    public void setKdJenisKaryawan(String jenis) {
        this.KdJenisKaryawan = jenis;
    }

    public String getKdKaryawan() {
        return this.KdKaryawan;
    }

    public String getNamaKaryawan() {
        return this.NamaKaryawan;
    }

    public String getAlamatKaryawan() {
        return this.AlamatKaryawan;
    }

    public String getNoHpKaryawan() {
        return this.NoHpKaryawan;
    }

    public String getKdJenisKaryawan() {
        return this.KdJenisKaryawan;
    }

    @Override
    public String toString() {
        return this.KdKaryawan;
    }
}
