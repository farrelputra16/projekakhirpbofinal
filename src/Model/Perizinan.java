/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author A409JB
 */
public class Perizinan {
    private Integer id_izin;
    private Integer id_pekerja;
    private Integer id_activity;
    public Integer getid_izin() {
        return id_izin;
    }

    /**
     * @param id_izin the id to set
     */
    public void setid_absen(Integer id_izin) {
        this.id_izin = id_izin;
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
