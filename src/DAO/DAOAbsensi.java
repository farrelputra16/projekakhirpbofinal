/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DAOInterface.InterfaceDAOAbsensi;
import Helper.KoneksiDB;
import Model.Absensi;
import Model.Aktivitas;
import Model.Partisipan;
import Model.Pekerja;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;

/**
 *
 * @author A409JB
 */
public class DAOAbsensi implements InterfaceDAOAbsensi {
    Connection c;
    
    String read_1 = """
               SELECT p.nama_pekerja
               FROM activity_participants ap
               JOIN pekerja p ON ap.id_pekerja = p.id_pekerja
               JOIN activity a ON ap.id_activity = a.id_activity
               WHERE ap.id_activity = ?,
               ORDER BY nama_pekerja asc;""";
    String read_2 = "SELECT * FROM activity where id_pekerja=?";
    String Insert = "INSERT INTO absensi (id_absen, id_pekerja, id_activity) values (?,?,?);";
    String readAktv = "SELECT * FROM activity;";       

    public DAOAbsensi(){
        c = KoneksiDB.getConnection();
    }
    
    @Override
    public List<Partisipan> getAllPartisipan(int id_activity) {
        List<Partisipan> listPrts = null;
        try{
            listPrts = new ArrayList<Partisipan>();
            Statement st = c.createStatement(1, id_activity);
            ResultSet rs = st.executeQuery(read_1);
            while (rs.next()){
                Partisipan b = new Partisipan();
                b.setnamaPekerja(rs.getString("nama_pekerja"));
                listPrts.add(b);
            }
        } catch (SQLException ex){
            System.out.println("ERROR!"+ex);
        }
        return listPrts;
    }

    @Override
    public Pekerja getPekerjaById(int id_pekerja) {
        PreparedStatement statement = null;
        try {
            statement = c.prepareStatement(read_2);
            statement.setInt(1, id_pekerja);
            statement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean addAbsensi(Absensi absensi) {
         boolean result = true;
        PreparedStatement statement = null;
        try
        {
            statement = c.prepareStatement(Insert);
            statement.setInt(1, absensi.getid_pekerja());
            statement.setInt (2, absensi.getiid_activity());
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
    
    @Override
    public List<Aktivitas> getAllAktivitas() {
       SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
       List<Aktivitas> listAktv = null;
       try{
            listAktv = new ArrayList<>();
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery(readAktv);
            while (rs.next()){
                Aktivitas b = new Aktivitas();
                b.setid_activity(rs.getInt("id_activity"));
                b.setnama_aktivitas(rs.getString("nama_activity"));
                b.setjam_mulai(sdf.format(rs.getTime("jam_mulai")));
                b.setjam_selesai(sdf.format(rs.getTime("jam_selesai")));
                listAktv.add(b);
            }
        } catch (SQLException ex){
            System.out.println("ERROR!"+ex);
        }
        return listAktv;
    }

}
    

