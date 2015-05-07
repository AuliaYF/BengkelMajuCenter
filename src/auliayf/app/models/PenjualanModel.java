/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package auliayf.app.models;

/**
 *
 * @author windows 7
 */
public class PenjualanModel {

    private String KdPenjualan;
    private String TanggalPenjualan;
    private String KdKaryawan;
    private String KdPelanggan;

    public PenjualanModel(String kode, String tanggal, String karyawan, String pelanggan) {
        this.KdPenjualan = kode;
        this.TanggalPenjualan = tanggal;
        this.KdKaryawan = karyawan;
        this.KdPelanggan = pelanggan;
    }

    public void setKdPenjualan(String kode) {
        this.KdPenjualan = kode;
    }

    public void setTanggalPenjualan(String tanggal) {
        this.TanggalPenjualan = tanggal;
    }

    public void setKdKaryawan(String karyawan) {
        this.KdKaryawan = karyawan;
    }

    public void setKdPelanggan(String pelanggan) {
        this.KdPelanggan = pelanggan;
    }

    public String getKdPenjualan() {
        return this.KdPenjualan;
    }

    public String getTanggalPenjualan() {
        return this.TanggalPenjualan;
    }

    public String getKdKaryawan() {
        return this.KdKaryawan;
    }

    public String getKdPelanggan() {
        return this.KdPelanggan;
    }

    @Override
    public String toString() {
        return this.KdPenjualan;
    }
}
