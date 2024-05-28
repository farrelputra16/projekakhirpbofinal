/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOInterface;

import Model.Absensi;
import Model.Aktivitas;
import Model.Partisipan;
import Model.Pekerja;
import java.util.List;

/**
 *
 * @author A409JB
 */
public interface InterfaceDAOAbsensi {
    List<Aktivitas> getAllAktivitas();
    List<Partisipan> getAllPartisipan(int id_activity);
    Pekerja getPekerjaById(int id_pekerja);
    boolean addAbsensi(Absensi absensi);
    
}
