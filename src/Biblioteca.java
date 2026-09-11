import java.util.ArrayList;
import java.util.HashMap;

public class Biblioteca {

    private ArrayList<Libro> listaLibros;
    private HashMap<String, ArrayList<Libro>> indicePorAutor;

    public Biblioteca() {
        this.listaLibros = new ArrayList<>();
        this.indicePorAutor = new HashMap<>();
    }


    public boolean existeIsbn(String isbn) {
        for (Libro libro : listaLibros) {
            if (libro.getIsbn().equalsIgnoreCase(isbn)) {
                return true;
            }
        }
        return false;
    }

    public boolean agregarLibro(Libro libro) {
        if (existeIsbn(libro.getIsbn())) {
            return false;
        }

        listaLibros.add(libro);


        String autor = libro.getAutor();
        if (!indicePorAutor.containsKey(autor)) {
            indicePorAutor.put(autor, new ArrayList<>());
        }
        indicePorAutor.get(autor).add(libro);

        return true;
    }

    public ArrayList<Libro> obtenerTodos() {
        return this.listaLibros;
    }

    public ArrayList<Libro> filtrarPorAutor(String autor) {
        if (autor == null || autor.trim().isEmpty()) {
            return obtenerTodos();
        }

        return indicePorAutor.getOrDefault(autor, new ArrayList<>());
    }


    public boolean eliminarLibro(String isbn) {
        Libro libroAEliminar = null;


        for (Libro l : listaLibros) {
            if (l.getIsbn().equalsIgnoreCase(isbn)) {
                libroAEliminar = l;
                break;
            }
        }

        if (libroAEliminar != null) {
            listaLibros.remove(libroAEliminar);


            String autor = libroAEliminar.getAutor();
            if (indicePorAutor.containsKey(autor)) {
                indicePorAutor.get(autor).remove(libroAEliminar);
              
                if (indicePorAutor.get(autor).isEmpty()) {
                    indicePorAutor.remove(autor);
                }
            }
            return true;
        }

        return false;
    }
}

