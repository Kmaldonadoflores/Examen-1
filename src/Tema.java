import java.util.List;

public class Tema {
    List<Documento> documentos;
    List<Tema> subTema;
    String nombreTema;
    public Tema(){

    }

    public Tema(List<Documento> documentos, List<Tema> subTema, String nombreTema) {
        this.documentos = documentos;
        this.subTema = subTema;
        this.nombreTema = nombreTema;
    }
}
