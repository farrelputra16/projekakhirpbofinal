package Controller;

import DAO.DAOAddAkunPekerja;
import DAO.DAOLoginPekerja;
import DAO.DAOPekerja;
import DAOInterface.InterfaceDAOLoginPekerja;
import DAOInterface.InterfaceDAOPekerja;
import Model.Pekerja;
import View.AddAkunPekerja;
import View.LoginPage_pekerja;
import View.dashboardAdmin;
import javax.swing.JOptionPane;
import DAOInterface.InterfaceDAOTambahAkunPekerja;

public class ControllerPekerja {
    LoginPage_pekerja pekerjaLogin;
    AddAkunPekerja AddAkunPkr;
    InterfaceDAOLoginPekerja ImpDAOPekerja;
    InterfaceDAOTambahAkunPekerja IDAOTambahAkunPkr;

    public ControllerPekerja(LoginPage_pekerja pekerjaLogin) {
        this.pekerjaLogin = pekerjaLogin;
        this.ImpDAOPekerja = (InterfaceDAOLoginPekerja) new DAOLoginPekerja();
    }
    
    public ControllerPekerja(AddAkunPekerja AddAkunPkr) {
        this.AddAkunPkr = AddAkunPkr;
        this.IDAOTambahAkunPkr = (InterfaceDAOTambahAkunPekerja) new DAOAddAkunPekerja();
    }

    public void login() {
        String id = pekerjaLogin.gettxtIdPekerja().getText();
        String nama = pekerjaLogin.gettxtNamaPekerja().getText();
        boolean isValid = ImpDAOPekerja.login(id, nama);
        if(isValid) {
            // Redirect to dashboard or another view
            new dashboardAdmin().setVisible(true);
            pekerjaLogin.dispose();
        }
    }
    
     public void insert(){
        Pekerja pkr = new Pekerja();
        pkr.setIdPekerja(Integer.parseInt(AddAkunPkr.gettxtIdPekerja().getText()));
        pkr.setNamaPekerja(AddAkunPkr.gettxtNamaPekerja().getText());
        boolean rslt = IDAOTambahAkunPkr.insert(pkr);
        if (rslt)
            JOptionPane.showMessageDialog(null, " INPUT SUKSES! ");
        else
            JOptionPane.showMessageDialog(null, " INPUT GAGAL / DATA DUPLIKAT ");
    }
     
    public void reset(){
        if(!AddAkunPkr.gettxtIdPekerja().isEnabled())
             AddAkunPkr.gettxtIdPekerja().setEnabled(true);
        AddAkunPkr.gettxtIdPekerja().setText("");
        AddAkunPkr.gettxtNamaPekerja().setText("");
    }
}
