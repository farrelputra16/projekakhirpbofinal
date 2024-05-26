/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.DAOActivity;
import DAOInterface.InterfaceDAOActivity;
import Model.Aktivitas;
import Model.Partisipan;
import Model.TabelPartisipan;
import View.DetailAktivitas;
import View.AktivitasAwal;
import View.TambahAktivitas;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;

/**
 *
 * @author A409JB
 */
public class ControllerAktivitas {
    DetailAktivitas detailA;
    AktivitasAwal aktivitasA;
    TambahAktivitas AddAktv;
    InterfaceDAOActivity ImpDAOAktivitas;
    List<Partisipan> listPrts;
    
    public ControllerAktivitas(DetailAktivitas detailA){
        this.detailA = detailA;
        this.ImpDAOAktivitas = new DAOActivity();
    }
    
    public ControllerAktivitas(AktivitasAwal aktvitasA){
        this.aktivitasA = aktivitasA;
        this.ImpDAOAktivitas = new DAOActivity();   
    }
    
    public ControllerAktivitas(TambahAktivitas AddAktv){
        this.AddAktv = AddAktv;
        this.ImpDAOAktivitas = new DAOActivity();
    }
    
    public void isiTabelPartisipan(){
       listPrts = ImpDAOAktivitas.getAllPartisipan();
       TabelPartisipan tblPrts = new TabelPartisipan(listPrts);
       detailA.gettabelDafSenAktivitas().setModel(tblPrts);
   }
    
   public void read_da() {
    Aktivitas aktivitas = new Aktivitas();
    ImpDAOAktivitas.activity(aktivitas);
    detailA.gettxtNamaAktivitas().setText(aktivitas.getnama_aktivitas());
    detailA.gettxtJamMulai().setValue(new Date());
    ((JSpinner.DefaultEditor) detailA.gettxtJamMulai().getEditor()).getTextField().setText(aktivitas.getjam_mulai());

    detailA.gettxtJamSelesai().setValue(new Date());
    ((JSpinner.DefaultEditor) detailA.gettxtJamSelesai().getEditor()).getTextField().setText(aktivitas.getjam_selesai());
    
   }
   
   public void read_da2() {
    Aktivitas aktivitas = new Aktivitas();
    ImpDAOAktivitas.activity(aktivitas);
    aktivitasA.gettxtNamaAktivitas().setText(aktivitas.getnama_aktivitas());
    aktivitasA.gettxtJamMulai().setValue(new Date());
    ((JSpinner.DefaultEditor) aktivitasA.gettxtJamMulai().getEditor()).getTextField().setText(aktivitas.getjam_mulai());

    aktivitasA.gettxtJamSelesai().setValue(new Date());
    ((JSpinner.DefaultEditor) aktivitasA.gettxtJamSelesai().getEditor()).getTextField().setText(aktivitas.getjam_selesai());
    
   }

   public void search_partisipan(){
        listPrts = ImpDAOAktivitas.searchPartisipan(detailA.gettxtCariPekerja().getText());
        TabelPartisipan tblPrts = new TabelPartisipan (listPrts);
        detailA.gettabelDafSenAktivitas().setModel(tblPrts);
   }
}
