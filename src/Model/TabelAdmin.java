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
public class TabelAdmin extends AbstractTableModel{
    List<Admin> listAdm;
    public TabelAdmin(List<Admin> listAdm){
        this.listAdm = listAdm;
    }
    
    @Override
    public int getRowCount() {
        return this.listAdm.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }
    
    @Override
    public String getColumnName(int column){
        switch(column){
            case 0:
                return "List Admin";
            default:
                return null;
        }
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return listAdm.get(rowIndex).getnama();
            default:
                return null;
        }
    }
}
