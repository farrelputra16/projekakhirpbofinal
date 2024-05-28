package DAO;

import DAOInterface.InterfaceDAOAdmin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Connector.KoneksiDB;
import Model.Admin;
import Model.Aktivitas;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

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

    @Override
    public List<Admin> getAllAdmin() {
    List<Admin> listAdm = null;
    String readAdmin = "SELECT * FROM admin";
       try{
            listAdm = new ArrayList<Admin>();
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery(readAdmin);
            while (rs.next()){
                Admin b = new Admin();
                b.setnama(rs.getString("nama"));
                listAdm.add(b);
            }
        } catch (SQLException ex){
            System.out.println("ERROR!"+ex);
        }
        return listAdm;    }
}
