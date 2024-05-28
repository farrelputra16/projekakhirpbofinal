package Controller;

import DAO.DAOPerizinan;
import DAOInterface.InterfaceDAOPerizinan;
import Model.Aktivitas;
import Model.Partisipan;
import Model.Perizinan;
import Model.TabelAktivitas;
import Model.TabelPartisipan;
import View.PerizinanPekerja;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JOptionPane;

public class ControllerPerizinan {

    PerizinanPekerja PerizinanP;
    InterfaceDAOPerizinan IDAOPerizinan;
    List<Aktivitas> listAktv;
    List<Partisipan> listPrts;
    TabelPartisipan tblPrts;

    public ControllerPerizinan(PerizinanPekerja PerizinanP) {
        this.PerizinanP = PerizinanP;
        this.IDAOPerizinan = new DAOPerizinan();
        initController();
    }

    private void initController() {
        PerizinanP.gettabelAktivitasPekerja().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                IsiTabelPartisipan(getSelectedActivityId());
            }
        });

        PerizinanP.gettabelListPartisipan().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int workerId = getSelectedWorkerId();
                // You can now use workerId for further processing
            }
        });
    }

    public void IsiTabelAktv() {
        listAktv = IDAOPerizinan.getAllAktivitas();
        TabelAktivitas tblAktv = new TabelAktivitas(listAktv);
        PerizinanP.gettabelAktivitasPekerja().setModel(tblAktv);
    }

    public void IsiTabelPartisipan(int id_activity) {
        listPrts = IDAOPerizinan.getAllPartisipan(id_activity);
        TabelPartisipan tblPrts = new TabelPartisipan(listPrts);
        PerizinanP.gettabelListPartisipan().setModel(tblPrts);
    }

    public int getSelectedActivityId() {
        int selectedRow = PerizinanP.gettabelAktivitasPekerja().getSelectedRow();
        if (selectedRow != -1) {
            return (int) PerizinanP.gettabelAktivitasPekerja().getValueAt(selectedRow, 0);
        }
        return -1;
    }

    public int getSelectedWorkerId() {
        int selectedRow = PerizinanP.gettabelListPartisipan().getSelectedRow();
        if (selectedRow != -1) {
            return (int) PerizinanP.gettabelListPartisipan().getValueAt(selectedRow, 0);
        }
        return -1;
    }

    public void Perizinan() {
        Perizinan p = new Perizinan();
        int selectedActivityId = getSelectedActivityId();
        int selectedWorkerId = getSelectedWorkerId();
        if (selectedActivityId != -1 && selectedWorkerId != -1) {
            p.setid_activity(selectedActivityId);
            p.setid_pekerja(selectedWorkerId);
            p.setdeskripsi(PerizinanP.gettxtDeskripsi().getText());
            boolean success = IDAOPerizinan.addPerizinan(p);
            if (success) {
                JOptionPane.showMessageDialog(PerizinanP, "Perizinan berhasil!");
            } else {
                JOptionPane.showMessageDialog(PerizinanP, "Perizinan gagal!");
            }
        } else {
            JOptionPane.showMessageDialog(PerizinanP, "Pilih aktivitas dan pekerja terlebih dahulu!");
        }
    }
}
