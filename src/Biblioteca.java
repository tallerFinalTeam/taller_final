import java.util.ArrayList;
import java.util.HashMap;

public class Biblioteca {

    private ArrayList<libro> listaLibros;
    private HashMap<String, ArrayList<libro>> indicePorAutor;

    public Biblioteca() {
        this.listaLibros = new ArrayList<>();
        this.indicePorAutor = new HashMap<>();
    }


    public boolean existeCodigo(int codigo) {
        for (libro libro : listaLibros) {
            if (libro.getCodigo() == codigo) {
                return true;
            }
        }
        return false;
    }

    public boolean agregarLibro(libro libro) {
        if (existeCodigo(libro.getCodigo())) {
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

    public ArrayList<libro> obtenerTodos() {

        return this.listaLibros;
    }


    public ArrayList<libro> filtrarPorAutor(String autor) {
        if (autor == null || autor.trim().isEmpty()) {
            return obtenerTodos();
        }

        return indicePorAutor.getOrDefault(autor, new ArrayList<>());
    }


    public boolean eliminarLibro(int codigo) {
        libro libroAEliminar = null;


        for (libro l : listaLibros) {
            if (l.getCodigo() == codigo ) {
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

