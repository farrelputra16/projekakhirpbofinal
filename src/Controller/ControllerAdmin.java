package Controller;

import View.AddAkunAdmin;
import View.LoginPage_admin;
import View.dashboardAdmin;
import DAO.DAOAddAkunAdmin;
import DAO.DAOAdmin;
import DAOInterface.InterfaceDAOAdmin;
import Model.Admin;
import javax.swing.JOptionPane;
import DAOInterface.InterfaceDAOTambahAkunAdmin;

public class ControllerAdmin {
    AddAkunAdmin AddAkunAdm;
    LoginPage_admin adminLogin;
    InterfaceDAOAdmin ImpDAOAdmin;
    private InterfaceDAOTambahAkunAdmin IDAOTambahAkunAdm;

    public ControllerAdmin(LoginPage_admin adminLogin) {
        this.adminLogin = adminLogin;
        this.ImpDAOAdmin = new DAOAdmin();
    }
    
    public ControllerAdmin(AddAkunAdmin AddAkunAdm) {
        this.AddAkunAdm = AddAkunAdm;
        this.IDAOTambahAkunAdm = (InterfaceDAOTambahAkunAdmin) new DAOAddAkunAdmin();
    }

    public void login() {
        String id = adminLogin.gettxtIdAdmin().getText();
        String password = adminLogin.gettxtPassAdmin().getText();
        boolean isValid = ImpDAOAdmin.login(id, password);
        if(isValid) {
            // Redirect to dashboard or another view
            new dashboardAdmin().setVisible(true);
            adminLogin.dispose();
        }
    }
         public void insert(){
        Admin adm = new Admin();
        adm.setid_admin(Integer.valueOf(AddAkunAdm.gettxtIdAdmin().getText()));
        adm.setnama(AddAkunAdm.gettxtNamaAdmin().getText());
        adm.setpassword(AddAkunAdm.gettxtPwAdmin().getText());
        boolean rslt = IDAOTambahAkunAdm.insert(adm);
        if (rslt)
            JOptionPane.showMessageDialog(null, " INPUT SUKSES! ");
        else
            JOptionPane.showMessageDialog(null, " INPUT GAGAL / DATA DUPLIKAT ");
    }
}
