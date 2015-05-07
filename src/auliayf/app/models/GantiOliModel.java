/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package auliayf.app.models;

/**
 *
 * @author windows 7
 */
public class GantiOliModel {

    private String KdTransaksi;
    private String TanggalTransaksi;
    private String KdKaryawan;
    private String KdPelanggan;
    private String KdOli;

    public GantiOliModel(String kode, String tanggal, String karyawan, String pelanggan, String oli) {
        this.KdTransaksi = kode;
        this.TanggalTransaksi = tanggal;
        this.KdKaryawan = karyawan;
        this.KdPelanggan = pelanggan;
        this.KdOli = oli;
    }
    
    public void setKdTransaksi(String kode) {
        this.KdTransaksi = kode;
    }
    public void setTanggalTransaksi(String tanggal) {
        this.TanggalTransaksi = tanggal;
    }
    public void setKdKaryawan(String karyawan) {
        this.KdKaryawan = karyawan;
    }
    public void setKdPelanggan(String pelanggan) {
        this.KdPelanggan = pelanggan;
    }
    public void setKdOli(String oli) {
        this.KdOli = oli;
    }
    public String getKdTransaksi() {
        return this.KdTransaksi;
    }
    public String getTanggalTransaksi() {
        return this.TanggalTransaksi;
    }
    public String getKdKaryawan() {
        return this.KdKaryawan;
    }
    public String getKdPelanggan() {
        return this.KdPelanggan;
    }
    public String getKdOli() {
        return this.KdOli;
    }
    @Override
    public String toString(){
        return this.KdTransaksi;
    }
}
