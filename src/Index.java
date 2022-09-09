import java.util.Date;

public class Index {
    boolean hash;
    Integer tamanio;
    Date fecha;
    Documento Documento;
    public Index(){

    }

    public Index(boolean hash, Integer tamanio, Date fecha, Documento documento) {
        this.hash = hash;
        this.tamanio = tamanio;
        this.fecha = fecha;
        Documento = documento;
    }
}
