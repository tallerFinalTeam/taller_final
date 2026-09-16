public class libro extends MaterialBibliografico {


    private String categoriaLibro;
    private int codigo;
    private int copiasDisponibles;

    public libro(String titulo, String autor, String categoriaLibro, int codigo, int anoPublicacion, int copiasDisponibles) {

        this.codigo = codigo;
        this.categoriaLibro = categoriaLibro;
        this.copiasDisponibles = copiasDisponibles;
    }
    @Override
    public String toString() {
        return "Título: " + titulo +
                ", Autor: " + autor +
                ", Categoría: " + categoriaLibro +
                ", Código: " + codigo +
                ", Año: " + anoPublicacion +
                ", Copias disponibles: " + copiasDisponibles;
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

    public String getCategoriaLibro() {
        return categoriaLibro;
    }

    public void setCategoriaLibro(String categoriaLibro) {
        this.categoriaLibro = categoriaLibro;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getAnoPublicacion() {
        return anoPublicacion;
    }

    public void setAnoPublicacion(int anoPublicacion) {
        this.anoPublicacion = anoPublicacion;
    }

    public int getCopiasDisponibles() {
        return copiasDisponibles;
    }

    public void setCopiasDisponibles(int copiasDisponibles) {
        this.copiasDisponibles = copiasDisponibles;
    }






}
