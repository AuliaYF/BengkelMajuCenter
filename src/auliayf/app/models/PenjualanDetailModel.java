/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package auliayf.app.models;

/**
 *
 * @author windows 7
 */
public class PenjualanDetailModel {

    private int Id;
    private String KdPenjualan;
    private String KdOnderdil;
    private int Qty;

    public PenjualanDetailModel(int id, String kode, String onderdil, int qty) {
        this.Id = id;
        this.KdPenjualan = kode;
        this.KdOnderdil = onderdil;
        this.Qty = qty;
    }

    public void setId(int id) {
        this.Id = id;
    }

    public void setKdPenjualan(String kode) {
        this.KdPenjualan = kode;
    }

    public void setKdOnderdil(String onderdil) {
        this.KdOnderdil = onderdil;
    }

    public void setQty(int qty) {
        this.Qty = qty;
    }

    public int getId() {
        return this.Id;
    }

    public String getKdPenjualan() {
        return this.KdPenjualan;
    }

    public String getKdOnderdil() {
        return this.KdOnderdil;
    }

    public int getQty() {
        return this.Qty;
    }

    @Override
    public String toString() {
        return String.valueOf(this.Id);
    }
}
