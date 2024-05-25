/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author A409JB
 */
public class Aktivitas {
    private Integer id_activity;
    private String nama_aktivitas;
    private String jam_mulai;
    private String jam_selesai;
    
    public Integer getid_activity() {
        return id_activity;
    }

    /**
     * @param id_activity the id to set
     */
    public void setid_activity(Integer id_activity) {
        this.id_activity = id_activity;
    }
    
    public String getnama_aktivitas() {
        return nama_aktivitas;
    }

    /**
     * @param nama_aktivitas the id to set
     */
    public void setnama_aktivitas(String nama_aktivitas) {
        this.nama_aktivitas = nama_aktivitas;
    }
    
    public String getjam_mulai() {
        return jam_mulai;
    }

    /**
     * @param jam_mulai the id to set
     */
    public void setjam_mulai(String jam_mulai) {
        this.jam_mulai = jam_mulai;
    }
    
    public String getjam_selesai() {
        return jam_selesai;
    }

    /**
     * @param jam_selesai the id to set
     */
    public void setjam_selesai(String jam_selesai) {
        this.jam_selesai = jam_selesai;
    }
}
   