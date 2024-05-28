/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DAOInterface.InterfaceDAOActivity;
import Helper.KoneksiDB;
import Model.Aktivitas;
import Model.Partisipan;
import Model.Pekerja;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author A409JB
 */
public class DAOActivity implements InterfaceDAOActivity {
    Connection c;
    String read1 = """
               SELECT p.nama_pekerja
               FROM activity_participants ap
               JOIN pekerja p ON ap.id_pekerja = p.id_pekerja
               JOIN activity a ON ap.id_activity = a.id_activity
               WHERE ap.id_activity = ?,
               ORDER BY nama_pekerja asc;"""; //ubah lagi bila sudah ada aktivitas
    String read2 = "SELECT nama_activity, jam_mulai, jam_selesai FROM activity WHERE id_activity = ?";
    String Search = "SELECT * FROM activity_participants ap1 JOIN pekerja p ON ap1.id_pekerja = p.id_pekerja JOIN activity_participants ap2 ON ap2.id_partisipan = ap1.id_partisipan WHERE p.nama_pekerja = ?";
    String readAktv = "SELECT * FROM activity;";       
    
    public DAOActivity(){
        c = KoneksiDB.getConnection();
    }
    
    
    @Override
    public List<Partisipan> getAllPartisipan() {
        List<Partisipan> listPrts = null;
        try{
            listPrts = new ArrayList<Partisipan>();
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery(read1);
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
    public void activity(Aktivitas activity) {
    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        try{
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery(read2);
            if (rs.next()) {
                activity.setnama_aktivitas(rs.getString("nama_activity"));
                activity.setjam_mulai(sdf.format(rs.getTime("jam_mulai")));
                activity.setjam_selesai(sdf.format(rs.getTime("jam_selesai")));
            }
        } catch (SQLException ex) {
            System.out.println("ERROR! "+ex);
        }
    }

    @Override
    public List<Partisipan> searchPartisipan(String namaPekerja) {
        List<Partisipan> listPrts = null;
        try{
            listPrts = new ArrayList<>();
            PreparedStatement st = c.prepareStatement(Search); 
            st.setString(1, "%"+namaPekerja+"%");
            ResultSet rs = st.executeQuery(); 
            while(rs.next()){
                Partisipan prts = new Partisipan (); 
                prts.setnamaPekerja(rs.getString("nama_pekerja")); 
                listPrts.add(prts);
            }
            } catch (SQLException ex){
            System.out.println("ERROR!"+ex);
            }
        return listPrts;
    }

    @Override
    public List<Aktivitas> getAllAktivitas() {
       List<Aktivitas> listAktv = null;
       try{
            listAktv = new ArrayList<Aktivitas>();
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery(readAktv);
            while (rs.next()){
                Aktivitas b = new Aktivitas();
                b.setid_activity(rs.getInt("id_activity"));
                b.setnama_aktivitas(rs.getString("nama_aktivitas"));
                b.setjam_mulai(rs.getString("jam_mulai"));
                b.setjam_selesai(rs.getString("jam_selesai"));
                listAktv.add(b);
            }
        } catch (SQLException ex){
            System.out.println("ERROR!"+ex);
        }
        return listAktv;
    }
}
