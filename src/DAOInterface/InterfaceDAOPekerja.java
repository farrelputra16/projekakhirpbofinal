package DAOInterface;

import Model.Pekerja;
import java.util.List;

public interface InterfaceDAOPekerja {
    List<Pekerja> getAllPekerja();
    List<Pekerja> searchPekerja(String namaPekerja);
    void updatePekerja(Pekerja b);
    void deletePekerja(int idPekerja);
    public boolean insertPekerja(Pekerja b);
}
