/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package auliayf.app.models;

/**
 *
 * @author windows 7
 */
public class PelangganModel {
    
    private String KdPelanggan;
    private String NamaPelanggan;
    private String JenisKelamin;
    private String AlamatPelanggan;
    private String NoHP;
    
    public PelangganModel(String kode, String nama, String jenisKelamin, String alamat, String noHp) {
        this.KdPelanggan = kode;
        this.NamaPelanggan = nama;
        this.JenisKelamin = jenisKelamin;
        this.AlamatPelanggan = alamat;
        this.NoHP = noHp;
    }
    
    public void setKdPelanggan(String kode) {
        this.KdPelanggan = kode;
    }
    
    public void setNamaPelanggan(String nama) {
        this.NamaPelanggan = nama;
    }
    
    public void setJenisKelamin(String jenisKelamin) {
        this.JenisKelamin = jenisKelamin;
    }
    
    public void setAlamatPelanggan(String alamat) {
        this.AlamatPelanggan = alamat;
    }
    
    public void setNoHP(String noHp) {
        this.NoHP = noHp;
    }
    
    public String getKdPelanggan() {
        return this.KdPelanggan;
    }

    public String getNamaPelanggan() {
        return this.NamaPelanggan;
    }

    public String getJenisKelamin() {
        return this.JenisKelamin;
    }
    
    public String getAlamatPelanggan() {
        return this.AlamatPelanggan;
    }
    
    public String getNoHP() {
        return this.NoHP;
    }
    
    @Override
    public String toString() {
        return this.KdPelanggan;
    }
}
