public abstract class MaterialBibliografico {
    protected String titulo;
    protected String autor;
    protected int anoPublicacion;

    public MaterialBibliografico(String titulo, String autor, int anoPublicacion){
        this.titulo=titulo;
        this.autor=autor;
        this.anoPublicacion=anoPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacion() {
        return anoPublicacion;
    }

    public void setAnoPublicacion(int anoPublicacion) {
        this.anoPublicacion = anoPublicacion;
    }
    public abstract String mostrarInformacion();
}
