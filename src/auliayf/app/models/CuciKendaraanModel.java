/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package auliayf.app.models;

/**
 *
 * @author windows 7
 */
public class CuciKendaraanModel {

    private String KdCuci;
    private String PlatNomor;
    private String TanggalCuci;
    private String KdKaryawan;
    private String KdPelanggan;
    private String Harga;

    public CuciKendaraanModel(String kode, String platNomor, String tanggal, String karyawan, String pelanggan, String harga) {
        this.KdCuci = kode;
        this.PlatNomor = platNomor;
        this.TanggalCuci = tanggal;
        this.KdKaryawan = karyawan;
        this.KdPelanggan = pelanggan;
        this.Harga = harga;
    }

    public void setKdCuci(String kode) {
        this.KdCuci = kode;
    }

    public void setPlatNomor(String platNomor) {
        this.PlatNomor = platNomor;
    }

    public void setTanggalCuci(String tanggal) {
        this.TanggalCuci = tanggal;
    }

    public void setKdKaryawan(String karyawan) {
        this.KdKaryawan = karyawan;
    }

    public void setKdPelanggan(String pelanggan) {
        this.KdPelanggan = pelanggan;
    }

    public void setHarga(String harga) {
        this.Harga = harga;
    }

    public String getKdCuci() {
        return this.KdCuci;
    }

    public String getPlatNomor() {
        return this.PlatNomor;
    }

    public String getTanggalCuci() {
        return this.TanggalCuci;
    }

    public String getKdKaryawan() {
        return this.KdKaryawan;
    }

    public String getKdPelanggan() {
        return this.KdPelanggan;
    }

    public String getHarga() {
        return this.Harga;
    }

    @Override
    public String toString() {
        return this.KdCuci;
    }
}
