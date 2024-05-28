/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Connector.KoneksiDB;
import Model.Pekerja;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import DAOInterface.InterfaceDAOTambahAkunPekerja;

/**
 *
 * @author A409JB
 */
public class DAOAddAkunPekerja implements InterfaceDAOTambahAkunPekerja{
    Connection c;
    String strInsert = "insert into pekerja (id_pekerja, nama_pekerja) values (?,?);";

    public DAOAddAkunPekerja() {
        c = KoneksiDB.getConnection();
    }
    
    @Override
    public boolean insert(Pekerja pkr){
        boolean result = true;
        PreparedStatement statement = null;
        try
        {
            statement = c.prepareStatement(strInsert);
            statement.setInt(1, pkr.getIdPekerja());
            statement.setString (2, pkr.getNamaPekerja());
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
