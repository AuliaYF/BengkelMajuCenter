/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package auliayf.app.models;

/**
 *
 * @author windows 7
 */
public class JadwalKerjaModel {

    private String KdJadwal;
    private String KdKaryawan;
    private String Hari;
    private String Shift;

    public JadwalKerjaModel(String kode, String karyawan, String hari, String shift) {
        this.KdJadwal = kode;
        this.KdKaryawan = karyawan;
        this.Hari = hari;
        this.Shift = shift;
    }

    public void setKdJadwal(String kode) {
        this.KdJadwal = kode;
    }

    public void setKdKaryawan(String karyawan) {
        this.KdKaryawan = karyawan;
    }

    public void setHari(String hari) {
        this.Hari = hari;
    }

    public void setShift(String shift) {
        this.Shift = shift;
    }

    public String getKdJadwal() {
        return this.KdJadwal;
    }

    public String getKdKaryawan() {
        return this.KdKaryawan;
    }

    public String getHari() {
        return this.Hari;
    }

    public String getShift() {
        return this.Shift;
    }

    @Override
    public String toString() {
        return this.KdJadwal;
    }
}
