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
public class TabelPartisipan extends AbstractTableModel{

    List<Partisipan> listPrts;
    public TabelPartisipan(List<Partisipan> listPrts){
        this.listPrts = listPrts;
    }
    
    @Override
    public int getRowCount() {
        return this.listPrts.size();
    }

    @Override
    public int getColumnCount() {
        return 1;
    }
    
    @Override
    public String getColumnName(int column){
        switch(column){
            case 0:
                return "Nama Pekerja";
            default:
                return null;
        }
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return listPrts.get(rowIndex).getnamaPekerja();
            default:
                return null;
        }
    }
}
