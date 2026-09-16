public class libro extends MaterialBibliografico {


    private String categoriaLibro;
    private int codigo;
    private int copiasDisponibles;

    public libro(String titulo, String autor, String categoriaLibro, int codigo, int anoPublicacion, int copiasDisponibles) {
        super(titulo, autor, anoPublicacion);
        this.codigo = codigo;
        this.categoriaLibro = categoriaLibro;
        this.copiasDisponibles = copiasDisponibles;
    }
    @Override
    public String mostrarInformacion() {
        return "Título: " + titulo +
                ", Autor: " + autor +
                ", Categoría: " + categoriaLibro +
                ", Código: " + codigo +
                ", Año: " + anoPublicacion +
                ", Copias disponibles: " + copiasDisponibles;
    }
    @Override
    public String toString(){
        return mostrarInformacion();
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

    public int getCopiasDisponibles() {
        return copiasDisponibles;
    }

    public void setCopiasDisponibles(int copiasDisponibles) {
        this.copiasDisponibles = copiasDisponibles;
    }






}
