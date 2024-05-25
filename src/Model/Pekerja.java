package Model;

public class Pekerja {
    private Integer idPekerja;
    private String namaPekerja;

    public Pekerja(Integer idPekerja, String namaPekerja) {
        this.idPekerja = idPekerja;
        this.namaPekerja = namaPekerja;
    }

    public Pekerja() {

    }
    
    public String getNamaPekerja() {
        return namaPekerja;
    }

    public void setNamaPekerja(String namaPekerja) {
        this.namaPekerja = namaPekerja;
    }
    
    public Integer getIdPekerja() {
        return idPekerja;
    }

    public void setIdPekerja(Integer idPekerja) {
        this.idPekerja = idPekerja;
    }
}

