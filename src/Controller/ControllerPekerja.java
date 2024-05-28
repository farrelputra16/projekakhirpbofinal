package Controller;

import DAO.DAOLoginPekerja;
import DAO.DAOPekerja;
import DAOInterface.InterfaceDAOLoginPekerja;
import DAOInterface.InterfaceDAOPekerja;
import Model.Pekerja;
import View.LoginPage_pekerja;
import View.dashboardAdmin;
import javax.swing.JOptionPane;
import DAOInterface.InterfaceDAOTambahAkunPekerja;
import View.dashboardPekerja;

public class ControllerPekerja {
    LoginPage_pekerja pekerjaLogin;
    dashboardAdmin dashA;
    InterfaceDAOPekerja IDAOPekerja;
    InterfaceDAOLoginPekerja ImpDAOPekerja;
    InterfaceDAOTambahAkunPekerja IDAOTambahAkunPkr;

    public ControllerPekerja(LoginPage_pekerja pekerjaLogin) {
        this.pekerjaLogin = pekerjaLogin;
        this.ImpDAOPekerja = new DAOLoginPekerja();
    }
    
    public ControllerPekerja(dashboardAdmin dashA) {
        this.dashA = dashA;
        this.IDAOPekerja = new DAOPekerja();
    }

    public void login() {
        String id = pekerjaLogin.gettxtIdPekerja().getText();
        String nama = pekerjaLogin.gettxtNamaPekerja().getText();
        boolean isValid = ImpDAOPekerja.login(id, nama);
        if(isValid) {
            // Redirect to dashboard or another view
            new dashboardPekerja().setVisible(true);
            pekerjaLogin.dispose();
        }
    }
    
     public void insert(){
        Pekerja pkr = new Pekerja();
        pkr.setIdPekerja(Integer.valueOf(dashA.gettxtIdPekerja().getText()));
        pkr.setNamaPekerja(dashA.gettxtNamaPekerja().getText());
        boolean rslt = IDAOPekerja.insertPekerja(pkr);
        if (rslt)
            JOptionPane.showMessageDialog(null, " INPUT SUKSES! ");
        else
            JOptionPane.showMessageDialog(null, " INPUT GAGAL / DATA DUPLIKAT ");
    }
    
    public void update(){
        Pekerja pkr = new Pekerja();
        pkr.setNamaPekerja(dashA.gettxtNamaPekerja().getText());
        pkr.setIdPekerja(Integer.parseInt(dashA.gettxtIdPekerja().getText()));
        IDAOPekerja.updatePekerja(pkr);
        JOptionPane.showMessageDialog(null, "UPDATE SUKSES!");
    }
    
    public void delete(){
        Pekerja pkr = new Pekerja();
        IDAOPekerja.deletePekerja(Integer.parseInt(dashA.gettxtIdPekerja().getText()));
        JOptionPane.showMessageDialog(null, "HAPUS DATA SUKSES!");
    }
    
    public void reset(){
        if(!dashA.gettxtIdPekerja().isEnabled())
             dashA.gettxtIdPekerja().setEnabled(true);
        dashA.gettxtIdPekerja().setText("");
        dashA.gettxtNamaPekerja().setText("");
    }
}
