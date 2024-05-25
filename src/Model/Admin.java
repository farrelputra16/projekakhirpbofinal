/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author A409JB
 */
public class Admin {
    private Integer id_admin;
    private String nama;
    private String password;
    
    public Integer getid_admin() {
        return id_admin;
    }

    /**
     * @param id_admin the id to set
     */
    public void setid_admin(Integer id_admin) {
        this.id_admin = id_admin;
    }

    /**
     * @return the Nama
     */
    public String getnama() {
        return nama;
    }

    /**
     * @param nama the Nama to set
     */
    public void setnama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the Nim
     */
    public String getpassword() {
        return password;
    }

    /**
     * @param password the Nim to set
     */
    public void setpassword(String password) {
        this.password = password;
    }
}
