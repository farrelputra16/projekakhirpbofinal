/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author A409JB
 */
public class Absensi {
    private Integer id_absen;
    private Integer id_pekerja;
    private Integer id_activity;
    
    public Integer getid_absen() {
        return id_absen;
    }

    /**
     * @param id_absen the id to set
     */
    public void setid_absen(Integer id_absen) {
        this.id_absen = id_absen;
    }
    
    public Integer getid_pekerja() {
        return id_pekerja;
    }

    /**
     * @param id_pekerja the id to set
     */
    public void setid_pekerja(Integer id_pekerja) {
        this.id_pekerja = id_pekerja;
    }
    
    public Integer getid_activity() {
        return id_activity;
    }

    /**
     * @param id_activity the id to set
     */
    public void setid_activity(Integer id_activity) {
        this.id_activity = id_activity;
    }
}
