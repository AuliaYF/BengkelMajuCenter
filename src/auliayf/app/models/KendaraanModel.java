/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package auliayf.app.models;

/**
 *
 * @author windows 7
 */
public class KendaraanModel {

    private String PlatNomor;
    private String MerkKendaraan;
    private String KdJenisKendaraan;

    public KendaraanModel(String plat, String merk, String jenis) {
        this.PlatNomor = plat;
        this.MerkKendaraan = merk;
        this.KdJenisKendaraan = jenis;
    }

    public void setPlatNomor(String plat) {
        this.PlatNomor = plat;
    }

    public void setMerkKendaraan(String merk) {
        this.MerkKendaraan = merk;
    }

    public void setKdJenisKendaraan(String jenis) {
        this.KdJenisKendaraan = jenis;
    }

    public String getPlatNomor() {
        return this.PlatNomor;
    }

    public String getMerkKendaraan() {
        return this.MerkKendaraan;
    }

    public String getKdJenisKendaraan() {
        return this.KdJenisKendaraan;
    }

    @Override
    public String toString() {
        return this.PlatNomor;
    }
}
