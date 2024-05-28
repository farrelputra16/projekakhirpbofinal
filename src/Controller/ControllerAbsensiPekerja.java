/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.DAOAbsensi;
import DAOInterface.InterfaceDAOAbsensi;
import Model.Aktivitas;
import Model.Partisipan;
import Model.Absensi;
import Model.TabelAktivitas;
import Model.TabelPartisipan;
import View.dashboardPekerja;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author A409JB
 */
public class ControllerAbsensiPekerja {

    dashboardPekerja dashP;
    InterfaceDAOAbsensi IDAOAbsen;
    List<Aktivitas> listAktv;
    List<Partisipan> listPrts;
    TabelPartisipan tblPrts;
    
    public ControllerAbsensiPekerja(dashboardPekerja dashP) {
        this.dashP = dashP;
        this.IDAOAbsen = new DAOAbsensi();
    }
    
    public void IsiTabelAktv(){
        listAktv = IDAOAbsen.getAllAktivitas();
        TabelAktivitas tblAktv = new TabelAktivitas(listAktv);
        dashP.getTabelAktivitasPekerja().setModel(tblAktv);
    }    
    
    public void IsiTabelPartisipan(int id_activity){
       listPrts = IDAOAbsen.getAllPartisipan(id_activity);
       TabelPartisipan tblPrts = new TabelPartisipan(listPrts);
       dashP.getTabelListPartisipan().setModel(tblPrts);
    }
    
    public void Absen(String idActivity, String idPekerja) {
    boolean success = IDAOAbsen.addAbsensi(idActivity, idPekerja);
    if (success) {
        JOptionPane.showMessageDialog(dashP, "Absensi berhasil!");
    } else {
        JOptionPane.showMessageDialog(dashP, "Absensi gagal!");
    }
}

}
