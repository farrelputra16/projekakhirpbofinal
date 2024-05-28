/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.DAOActivity;
import DAOInterface.InterfaceDAOActivity;
import Model.Aktivitas;
import Model.Partisipan;
import Model.TabelAktivitas;
import Model.TabelPartisipan;
import View.AktivitasAwal;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;

/**
 *
 * @author A409JB
 */
public class ControllerAktivitasAwal {
    AktivitasAwal AktivitasA;
    InterfaceDAOActivity ImpDAOAktivitas;
    List<Partisipan> listPrts;
    List<Aktivitas> ListAktv;
    private int activityId;

    public ControllerAktivitasAwal(AktivitasAwal AktivitasA){
        this.AktivitasA = AktivitasA;
        this.ImpDAOAktivitas = new DAOActivity();
        this.activityId = activityId;
    }
    public void IsiTabel(){
        ListAktv = ImpDAOAktivitas.getAllAktivitas();
        TabelAktivitas tblAktv = new TabelAktivitas(ListAktv);
        AktivitasA.getTabelAktivitasPekerja().setModel(tblAktv);
    } 
}

