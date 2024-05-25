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
public class TabelPekerja extends AbstractTableModel{

    List<Pekerja> listPkr;
    public TabelPekerja(List<Pekerja> listPkr){
        this.listPkr = listPkr;
    }
    
    @Override
    public int getRowCount() {
        return this.listPkr.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }
    
    @Override
    public String getColumnName(int column){
        switch(column){
            case 0:
                return "Nama Pekerja";
            case 1:
                return "ID Pekerja";
            default:
                return null;
        }
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return listPkr.get(rowIndex).getNamaPekerja();
            case 1:
                return listPkr.get(rowIndex).getIdPekerja();
            default:
                return null;
        }
    }
}
