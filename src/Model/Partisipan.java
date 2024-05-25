/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author A409JB
 */
public class Partisipan {
    private Integer id_partisipan;
    private String namaPekerja;
    private String namaActivity;

     public Integer getid_partisipan() {
        return id_partisipan;
    }

    /**
     * @param id_partisipan the id to set
     */
    public void setid_partisipan(Integer id_partisipan) {
        this.id_partisipan = id_partisipan;
    }
    
    public String getnamaPekerja() {
        return namaPekerja;
    }

    /**
     * @param namaPekerja the id to set
     */
    public void setnamaPekerja(String namaPekerja) {
        this.namaPekerja = namaPekerja;
    }
    
    public String getnamaActivity() {
        return namaActivity;
    }

    /**
     * @param namaActivity the id to set
     */
    public void setnamaActivity(String namaActivity) {
        this.namaActivity = namaActivity;
    }
}
