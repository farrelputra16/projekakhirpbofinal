/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.DAOActivity;
import DAO.DAOPekerja;
import DAOInterface.InterfaceDAOPekerja;
import Model.Pekerja;
import Model.TabelPartisipan;
import Model.TabelPekerja;
import View.TambahAktivitas;
import View.dashboardAdmin;
import java.util.List;
import DAOInterface.InterfaceDAOActivity;
import Model.Aktivitas;
import Model.Partisipan;
import java.util.Date;
import javax.swing.JSpinner;

/**
 *
 * @author A409JB
 */
public class ControllerTambahAktivitas {
    dashboardAdmin viewAdmin;
    InterfaceDAOPekerja IDAOPekerja;
    List<Pekerja> listPkr;
    List<Partisipan> listPrts;
    TambahAktivitas viewAddAktv;
    InterfaceDAOActivity IDAOActivity;
    
    public ControllerTambahAktivitas(TambahAktivitas viewAddAktv){
       this.viewAddAktv = viewAddAktv;
       this.IDAOActivity = IDAOActivity;
       IDAOActivity = new DAOActivity();
       IDAOPekerja = new DAOPekerja();   
    }
    
    public void isiTabelPekerja(){
       listPkr = IDAOPekerja.getAllPekerja();
       TabelPekerja tblPkr = new TabelPekerja(listPkr);
       viewAddAktv.gettabelPekerja().setModel(tblPkr);
    }
    
    public void isiField(int row){
        viewAddAktv.gettxtIdPekerja().setEnabled(false);
        viewAddAktv.gettxtNamaPekerja().setEnabled(false);
        viewAddAktv.gettxtIdPekerja().setText(listPkr.get(row).getIdPekerja().toString());
        viewAddAktv.gettxtNamaPekerja().setText(listPkr.get(row).getNamaPekerja());
    }
    
    public void isiTabelPartisipan(){
       listPrts = IDAOActivity.getAllPartisipan();
       TabelPartisipan tblPrts = new TabelPartisipan(listPrts);
       viewAddAktv.getTabelListPartisipan().setModel(tblPrts);
    }
     
    //public void read_da() {
        //Aktivitas aktivitas = new Aktivitas();
        //IDAOActivity.activity(aktivitas);
        //viewAddAktv.gettxtNamaAktivitas().setText(aktivitas.getnama_aktivitas());
       
        //viewAddAktv.gettxtJamMulai().setValue(new Date());
        //((JSpinner.DefaultEditor) viewAddAktv.gettxtJamMulai().getEditor()).getTextField().setText(aktivitas.getjam_mulai());

       // viewAddAktv.gettxtJamSelesai().setValue(new Date());
        //((JSpinner.DefaultEditor) viewAddAktv.gettxtJamSelesai().getEditor()).getTextField().setText(aktivitas.getjam_selesai());
   //}
}
