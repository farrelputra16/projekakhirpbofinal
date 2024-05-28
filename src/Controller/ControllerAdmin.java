package Controller;


import View.LoginPage_admin;
import View.dashboardAdmin;
import DAO.DAOAdmin;
import DAOInterface.InterfaceDAOAdmin;
import Model.Admin;
import Model.TabelAdmin;
import View.Accounts;
import java.util.List;
import javax.swing.JOptionPane;

public class ControllerAdmin {
   
    LoginPage_admin adminLogin;
    InterfaceDAOAdmin ImpDAOAdmin;
    List<Admin> listAdm;
    Accounts Akuns;

    public ControllerAdmin(LoginPage_admin adminLogin) {
        this.adminLogin = adminLogin;
        this.ImpDAOAdmin = new DAOAdmin();
    }
    
    public ControllerAdmin(Accounts Akuns) {
        this.Akuns = Akuns;
        this.ImpDAOAdmin = new DAOAdmin();
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
    
    public void isiTabel(){
       listAdm = ImpDAOAdmin.getAllAdmin();
       TabelAdmin tblAdm = new TabelAdmin(listAdm);
       Akuns.getTabelAdmin().setModel(tblAdm);
    }
}
