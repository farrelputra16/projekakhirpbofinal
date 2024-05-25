package DAO;

import DAOInterface.InterfaceDAOPekerja;
import Helper.KoneksiDB;
import Model.Pekerja;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DAOPekerja implements InterfaceDAOPekerja {
    Connection c;
    String read = "select * from pekerja;";
    String strSearch = "select * from pekerja where nama_pekerja like ?;";
    String strInsert = "insert into pekerja (id_pekerja, nama_pekerja) values (?,?);";

    public DAOPekerja() {
        c = KoneksiDB.getConnection();
    }

    @Override
    public List<Pekerja> getAllPekerja() {
       List<Pekerja> listPkr = null;
        try{
            listPkr = new ArrayList<Pekerja>();
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery(read);
            while (rs.next()){
                Pekerja b = new Pekerja();
                b.setNamaPekerja(rs.getString("nama_pekerja"));
                b.setIdPekerja(rs.getInt("id_pekerja"));
                listPkr.add(b);
            }
        } catch (SQLException ex){
            System.out.println("ERROR!"+ex);
        }
        return listPkr;
    }
    
      @Override
      public List<Pekerja> searchPekerja(String namaPekerja) {
        List<Pekerja> listPkr = null;
        try{
            listPkr = new ArrayList<Pekerja>();
            PreparedStatement st = c.prepareStatement (strSearch); 
            st.setString(1, "%"+namaPekerja+"%");
            ResultSet rs = st.executeQuery(); 
            while(rs.next()){
                Pekerja pkr = new Pekerja (); 
                pkr.setIdPekerja(rs.getInt("id_pekerja"));
                pkr.setNamaPekerja(rs.getString("nama_pekerja")); 
                listPkr.add(pkr);
            }
            
            } catch (SQLException ex){
            System.out.println("ERROR!"+ex);
            }
        return listPkr;
    }
}
