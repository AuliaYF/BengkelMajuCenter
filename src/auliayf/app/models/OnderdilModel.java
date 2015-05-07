/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package auliayf.app.models;

/**
 *
 * @author windows 7
 */
public class OnderdilModel {

    private String KdOnderdil;
    private String NamaOnderdil;
    private String MerkOnderdil;
    private String HargaOnderdil;
    private String TipeOnderdil;

    public OnderdilModel(String kode, String nama, String merk, String harga, String tipe) {
        this.KdOnderdil = kode;
        this.NamaOnderdil = nama;
        this.MerkOnderdil = merk;
        this.HargaOnderdil = harga;
        this.TipeOnderdil = tipe;
    }

    public void setKdOnderdil(String kode) {
        this.KdOnderdil = kode;
    }

    public void setNamaOnderdil(String nama) {
        this.NamaOnderdil = nama;
    }

    public void setMerkOnderdil(String merk) {
        this.MerkOnderdil = merk;
    }

    public void setHargaOnderdil(String harga) {
        this.HargaOnderdil = harga;
    }

    public void setTipeOnderdil(String tipe) {
        this.TipeOnderdil = tipe;
    }

    public String getKdOnderdil() {
        return this.KdOnderdil;
    }

    public String getNamaOnderdil() {
        return this.NamaOnderdil;
    }

    public String getMerkOnderdil() {
        return this.MerkOnderdil;
    }

    public String getHargaOnderdil() {
        return this.HargaOnderdil;
    }

    public String getTipeOnderdil() {
        return this.TipeOnderdil;
    }

    @Override
    public String toString() {
        return this.KdOnderdil;
    }
}
