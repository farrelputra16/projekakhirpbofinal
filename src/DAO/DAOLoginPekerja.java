package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Connector.KoneksiDB;
import Model.Pekerja;
import DAOInterface.InterfaceDAOLoginPekerja;

public class DAOLoginPekerja implements InterfaceDAOLoginPekerja {
    Connection c;

    public DAOLoginPekerja(){
        c = KoneksiDB.getConnection();
    }
    PreparedStatement pst = null;
    ResultSet rs = null;

    public boolean login(String id, String nama) {
        String sql = "SELECT * FROM pekerja WHERE id_pekerja = ? AND nama_pekerja = ?";
        try {
            pst = c.prepareStatement(sql);
            pst.setString(1, id);
            pst.setString(2, nama);
            rs = pst.executeQuery();
            if(rs.next()){
                JOptionPane.showMessageDialog(null, "LOGIN SUKSES");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "ID / PASSWORD SALAH", "AKSES DITOLAK", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }

}
