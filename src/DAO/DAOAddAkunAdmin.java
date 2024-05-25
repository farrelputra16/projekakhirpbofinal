/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Helper.KoneksiDB;
import Model.Admin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import DAOInterface.InterfaceDAOTambahAkunAdmin;

/**
 *
 * @author A409JB
 */
public class DAOAddAkunAdmin implements InterfaceDAOTambahAkunAdmin{
    Connection c;
    String strInsert = "insert into admin (id_admin, nama, password) values (?,?,?);";

    public DAOAddAkunAdmin() {
        c = KoneksiDB.getConnection();
    }
    
    @Override
    public boolean insert(Admin adm){
        boolean result = true;
        PreparedStatement statement = null;
        try
        {
            statement = c.prepareStatement(strInsert);
            statement.setInt(1, adm.getid_admin());
            statement.setString (2, adm.getnama());
            statement.setString (3, adm.getpassword());
            statement.execute();
            
        }catch(SQLException e)
        {
            System.out.println("gagal input");
            result = false;
        }
        finally
        {
            try {
                statement.close();
            } catch (SQLException ex) {
                System.out.println("gagal input");
                result = false;
            }
        }
        return result;
    }
}
