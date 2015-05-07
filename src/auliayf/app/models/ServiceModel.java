/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package auliayf.app.models;

/**
 *
 * @author windows 7
 */
public class ServiceModel {

    private String KdService;
    private String TanggalService;
    private String KdKaryawan;
    private String KdPelanggan;

    public ServiceModel(String kode, String tanggal, String karyawan, String pelanggan) {
        this.KdKaryawan = kode;
        this.TanggalService = tanggal;
        this.KdKaryawan = karyawan;
        this.KdPelanggan = pelanggan;
    }

    public void setKdService(String kode) {
        this.KdService = kode;
    }

    public void setTanggalService(String tanggal) {
        this.TanggalService = tanggal;
    }

    public void setKdKaryawan(String karyawan) {
        this.KdKaryawan = karyawan;
    }

    public void setKdPelanggan(String pelanggan) {
        this.KdPelanggan = pelanggan;
    }

    public String getKdService() {
        return this.KdService;
    }

    public String getTanggalService() {
        return this.TanggalService;
    }

    public String getKdKaryawan() {
        return this.KdKaryawan;
    }

    public String getKdPelanggan() {
        return this.KdPelanggan;
    }

    @Override
    public String toString() {
        return this.KdService;
    }
}
