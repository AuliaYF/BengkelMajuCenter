/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package auliayf.app.models;

/**
 *
 * @author windows 7
 */
public class DetailServiceModel {

    private int Id;
    private String KdService;
    private String KdKaryawan;
    private String Harga;
    private String Diskon;

    public DetailServiceModel(int id, String kode, String karyawan, String harga, String diskon) {
        this.Id = id;
        this.KdService = kode;
        this.KdKaryawan = karyawan;
        this.Harga = harga;
        this.Diskon = diskon;
    }

    public void setId(int id) {
        this.Id = id;
    }

    public void setKdService(String kode) {
        this.KdService = kode;
    }

    public void setKdKaryawan(String karyawan) {
        this.KdKaryawan = karyawan;
    }

    public void setHarga(String harga) {
        this.Harga = harga;
    }

    public void setDiskon(String diskon) {
        this.Diskon = diskon;
    }

    public int getId() {
        return this.Id;
    }

    public String getKdService() {
        return this.KdService;
    }

    public String getKdKaryawan() {
        return this.KdKaryawan;
    }

    public String getHarga() {
        return this.Harga;
    }

    public String getDiskon() {
        return this.Diskon;
    }

    @Override
    public String toString() {
        return String.valueOf(this.Id);
    }
}
