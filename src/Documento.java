public class Documento {
    String titulo;
    String url;
    Tema tema;
    Index index;
    Registro registro;
    public Documento(){

    }

    public Documento(String titulo, String url, Tema tema, Index index, Registro registro) {
        this.titulo = titulo;
        this.url = url;
        this.tema = tema;
        this.index = index;
        this.registro = registro;
    }
}
