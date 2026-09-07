import java.util.ArrayList;
import java.util.HashMap;
public class Biblioteca {

    private ArrayList<libro> listaLibros;
    private HashMap<String, ArrayList<Libro>> indicePorAutor;
}
public Biblioteca() {
    this.listaLibros = new ArrayList<>();
    this.indicePorAutor = new HashMap<>();
}


