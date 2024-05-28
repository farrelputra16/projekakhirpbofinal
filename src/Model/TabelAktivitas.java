/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author A409JB
 */
public class TabelAktivitas extends AbstractTableModel{

    List<Aktivitas> listAktv;
    public TabelAktivitas(List<Aktivitas> listAktv){
        this.listAktv = listAktv;
    }
    
    @Override
    public int getRowCount() {
        return this.listAktv.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }
    
    @Override
    public String getColumnName(int column){
        switch(column){
            case 0:
                return "N0.";
            case 1:
                return "Nama Aktivitas";
            case 2:
                return "Jam Mulai";
            case 3:
                return "Jam Selesai";
            default:
                return null;
        }
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return listAktv.get(rowIndex).getid_activity();
            case 1:
                return listAktv.get(rowIndex).getnama_aktivitas();
            case 2:
                 return listAktv.get(rowIndex).getjam_mulai();
            case 3:
                 return listAktv.get(rowIndex).getjam_selesai();
            default:
                return null;
        }
    }
}
