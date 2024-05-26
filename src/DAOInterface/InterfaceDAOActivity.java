/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOInterface;

import Model.Aktivitas;
import Model.Partisipan;
import Model.Pekerja;
import java.util.List;

/**
 *
 * @author A409JB
 */
public interface InterfaceDAOActivity {
    List<Partisipan> getAllPartisipan();
    List<Partisipan> searchPartisipan(String namaPekerja);
    void activity(Aktivitas activity);
    List<Aktivitas>getAllAktivitas();
}
