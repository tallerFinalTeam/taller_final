import javax.swing.*;
import java.awt.*;
import javax.swing.table.DefaultTableModel;

public class VentanaPrincipal extends JFrame {

    private JTextField campoTitulo, campoAutor, campoIsbn, campoGenero, campoAnio, campoCopias;
    private JTable tablaLibros;
    private DefaultTableModel modeloTabla;

    public VentanaPrincipal() {
        setTitle("Sistema de gestion de biblioteca");
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panelFormulario = new JPanel();
        panelFormulario.setLayout(new GridLayout(6, 2, 5, 5));

        panelFormulario.add(new JLabel("Título:"));
        campoTitulo = new JTextField();
        panelFormulario.add(campoTitulo);

        panelFormulario.add(new JLabel("Autor:"));
        campoAutor = new JTextField();
        panelFormulario.add(campoAutor);

        panelFormulario.add(new JLabel("ISBN/Código:"));
        campoIsbn = new JTextField();
        panelFormulario.add(campoIsbn);

        panelFormulario.add(new JLabel("Género:"));
        campoGenero = new JTextField();
        panelFormulario.add(campoGenero);

        panelFormulario.add(new JLabel("Año:"));
        campoAnio = new JTextField();
        panelFormulario.add(campoAnio);

        panelFormulario.add(new JLabel("Copias disponibles:"));
        campoCopias = new JTextField();
        panelFormulario.add(campoCopias);


        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new FlowLayout());

        JButton btnAgregar = new JButton("Agregar libro");
        JButton btnMostrarTodos = new JButton("Mostrar todos");
        JButton btnFiltrarAutor = new JButton("Filtrar por autor");
        JButton btnEliminar = new JButton("Eliminar libro");

        panelBotones.add(btnAgregar);
        panelBotones.add(btnMostrarTodos);
        panelBotones.add(btnFiltrarAutor);
        panelBotones.add(btnEliminar);


        String[] columnas = {"Título", "Autor", "ISBN", "Género", "Año", "Copias"};
        modeloTabla = new DefaultTableModel(columnas, 0);
        tablaLibros = new JTable(modeloTabla);

        JScrollPane scrollTabla = new JScrollPane(tablaLibros);
        add(scrollTabla, BorderLayout.CENTER);

        add(panelBotones, BorderLayout.SOUTH);

        add(panelFormulario, BorderLayout.NORTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        new VentanaPrincipal();
    }
}