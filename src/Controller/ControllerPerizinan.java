/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.DAOPerizinan;
import DAOInterface.InterfaceDAOPerizinan;
import Model.Aktivitas;
import Model.Partisipan;
import Model.Perizinan;
import Model.TabelAktivitas;
import Model.TabelPartisipan;
import View.PerizinanPekerja;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author A409JB
 */
public class ControllerPerizinan {

    PerizinanPekerja PerizinanP;
    InterfaceDAOPerizinan IDAOPerizinan;
    List<Aktivitas> listAktv;
    List<Partisipan> listPrts;
    TabelPartisipan tblPrts;
    
    public ControllerPerizinan(PerizinanPekerja PerizinanP) {
        this.PerizinanP = PerizinanP;
        this.IDAOPerizinan = new DAOPerizinan();
    }
    
    public void IsiTabelAktv(){
        listAktv = IDAOPerizinan.getAllAktivitas();
        TabelAktivitas tblAktv = new TabelAktivitas(listAktv);
        PerizinanP.gettabelAktivitasPekerja().setModel(tblAktv);
    }    
    
    public void IsiTabelPartisipan(int id_activity){
       listPrts = IDAOPerizinan.getAllPartisipan(id_activity);
       TabelPartisipan tblPrts = new TabelPartisipan(listPrts);
       PerizinanP.gettabelListPartisipan().setModel(tblPrts);
    }
    
    public void Perizinan(String idActivity, String idPekerja) {
    boolean success = IDAOPerizinan.addPerizinan(idActivity, idPekerja);
    if (success) {
        JOptionPane.showMessageDialog(PerizinanP, "Perizinan berhasil!");
    } else {
        JOptionPane.showMessageDialog(PerizinanP, "Perizinan gagal!");
    }
}

}
