package DAO;

import DAOInterface.InterfaceDAOAbsensi;
import Connector.KoneksiDB;
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
               WHERE ap.id_activity=?;""";
    String read_2 = "SELECT * FROM activity where id_pekerja=?";
    String Insert = "INSERT INTO absensi (id_activity, id_pekerja) VALUES (?, ?)";
    String readAktv = "SELECT * FROM activity;"; 
    String read_3 = "SELECT * FROM activity_participants WHERE id_pekerja=?;";

    public DAOAbsensi(){
        c = KoneksiDB.getConnection();
    }
    
    @Override
    public List<Partisipan> getAllPartisipan(int id_activity) {
        List<Partisipan> listPrts = new ArrayList<>();
        try {
            PreparedStatement ps = c.prepareStatement(read_1);
            ps.setInt(1, id_activity);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                Partisipan b = new Partisipan();
                b.setnamaPekerja(rs.getString("nama_pekerja"));
                listPrts.add(b);
            }
        } catch (SQLException ex){
            System.out.println("ERROR!" + ex);
        }
        return listPrts;
    }

    @Override
    public Pekerja getPekerjaById(int id_pekerja) {
        Pekerja pekerja = null;
        try {
            PreparedStatement statement = c.prepareStatement(read_2);
            statement.setInt(1, id_pekerja);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                pekerja = new Pekerja();
                // Set the pekerja properties here from ResultSet
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return pekerja;
    }

    @Override
    public boolean addAbsensi(String idActivity, String idPekerja) {

        try {
            PreparedStatement ps = c.prepareStatement(Insert);
            ps.setString(1, idActivity);
            ps.setString(2, idPekerja);
            int rowsInserted = ps.executeUpdate();
            return rowsInserted > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    @Override
    public List<Aktivitas> getAllAktivitas() {
       SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
       List<Aktivitas> listAktv = new ArrayList<>();
       try {
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
            System.out.println("ERROR!" + ex);
        }
        return listAktv;
    }
}
