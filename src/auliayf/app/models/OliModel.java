/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package auliayf.app.models;

/**
 *
 * @author windows 7
 */
public class OliModel {

    private String KdOli;
    private String TipeOli;
    private String UkuranOli;
    private String HargaOli;

    public OliModel(String kode, String tipe, String ukuran, String harga) {
        this.KdOli = kode;
        this.TipeOli = tipe;
        this.UkuranOli = ukuran;
        this.HargaOli = harga;
    }

    public void setKdOli(String kode) {
        this.KdOli = kode;
    }

    public void setTipeOli(String tipe) {
        this.TipeOli = tipe;
    }

    public void setUkuranOli(String ukuran) {
        this.UkuranOli = ukuran;
    }

    public void setHargaOli(String harga) {
        this.HargaOli = harga;
    }

    public String getKdOli() {
        return this.KdOli;
    }

    public String getTipeOli() {
        return this.TipeOli;
    }

    public String getUkuranOli() {
        return this.UkuranOli;
    }

    public String getHargaOli() {
        return this.HargaOli;
    }

    @Override
    public String toString() {
        return this.KdOli;
    }
}
