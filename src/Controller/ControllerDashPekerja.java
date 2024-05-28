/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.DAOAbsensi;
import DAOInterface.InterfaceDAOAbsensi;
import Model.Aktivitas;
import Model.Partisipan;
import Model.TabelAktivitas;
import Model.TabelPartisipan;
import View.dashboardPekerja;
import java.util.List;

/**
 *
 * @author A409JB
 */
public class ControllerDashPekerja {

    dashboardPekerja dashP;
    InterfaceDAOAbsensi IDAOAbsen;
    List<Aktivitas> listAktv;
    List<Partisipan> listPrts;

    public ControllerDashPekerja(dashboardPekerja dashP) {
        this.dashP = dashP;
        this.IDAOAbsen = new DAOAbsensi();
    }
    
    public void IsiTabelAktv(){
    listAktv = IDAOAbsen.getAllAktivitas();
    TabelAktivitas tblAktv = new TabelAktivitas(listAktv);
    dashP.getTabelAktivitasPekerja().setModel(tblAktv);
    }    
    
    public void handleActivitySelection(int idActivity) {
       
    }
}
