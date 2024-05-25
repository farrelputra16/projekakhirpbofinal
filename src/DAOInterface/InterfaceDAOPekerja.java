package DAOInterface;

import Model.Pekerja;
import java.util.List;

public interface InterfaceDAOPekerja {
    List<Pekerja> getAllPekerja();
    List<Pekerja> searchPekerja(String namaPekerja);
}
