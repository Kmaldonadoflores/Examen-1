import java.util.List;

public class Registro {
    Integer numeroRegistro;
    List<Documento> documentos;
    public Registro(){

    }

    public Registro(Integer numeroRegistro, List<Documento> documentos) {
        this.numeroRegistro = numeroRegistro;
        this.documentos = documentos;
    }
}
