package DAO;

import DAOInterface.InterfaceDAOAdmin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Connector.KoneksiDB;
import Model.Admin;

public class DAOAdmin implements InterfaceDAOAdmin {
    Connection c;

    public DAOAdmin(){
        c = KoneksiDB.getConnection();
    }
    PreparedStatement pst = null;
    ResultSet rs = null;

    @Override
    public boolean login(String id, String password) {
        String validate = "SELECT * FROM admin WHERE id_admin = ? AND password = ?";
        try {
            pst = c.prepareStatement(validate);
            pst.setString(1, id);
            pst.setString(2, password);
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
