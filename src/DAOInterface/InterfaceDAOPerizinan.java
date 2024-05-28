/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOInterface;

import Model.Perizinan;
import Model.Aktivitas;
import Model.Partisipan;
import Model.Pekerja;
import java.util.List;

/**
 *
 * @author A409JB
 */
public interface InterfaceDAOPerizinan {
    List<Aktivitas> getAllAktivitas();
    List<Partisipan> getAllPartisipan(int id_activity);
    Pekerja getPekerjaById(int id_pekerja);
    boolean addPerizinan(String id_activity, String id_pekerja);
    
}
