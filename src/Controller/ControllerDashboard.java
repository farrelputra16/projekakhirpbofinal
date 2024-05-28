package controller;

import DAO.DAOPekerja;
import DAOInterface.InterfaceDAOPekerja;
import Model.Pekerja;
import Model.TabelPekerja;

import View.dashboardAdmin;
import java.util.List;

public class ControllerDashboard {
    dashboardAdmin viewAdmin;
    InterfaceDAOPekerja IDAOPekerja;
    List<Pekerja> listPkr;

   public ControllerDashboard(dashboardAdmin viewAdmin){
       this.viewAdmin = viewAdmin;
       IDAOPekerja = new DAOPekerja();   
   }
    
   public void isiTabel(){
       listPkr = IDAOPekerja.getAllPekerja();
       TabelPekerja tblPkr = new TabelPekerja(listPkr);
       viewAdmin.getTabelPekerja().setModel(tblPkr);
   } 
   
   public void search(){
        listPkr = IDAOPekerja.searchPekerja(viewAdmin.getTxtCariPekerja().getText());
        TabelPekerja tabelPkr = new TabelPekerja (listPkr);
        viewAdmin.getTabelPekerja().setModel(tabelPkr);
   }
   
   public void isiField(int row){
        //viewAdmin.gettxtID().setEnabled(false);
        viewAdmin.gettxtIdPekerja().setText(listPkr.get(row).getIdPekerja().toString());
        viewAdmin.gettxtNamaPekerja().setText(listPkr.get(row).getNamaPekerja());
    }
   
}
