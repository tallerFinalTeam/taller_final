import javax.swing.*;
import java.awt.*;
import javax.swing.table.DefaultTableModel;

public class VentanaPrincipal extends JFrame {

    private Biblioteca biblioteca;

    private JTextField campoTitulo;
    private JTextField campoAutor;
    private JTextField campoIsbn;
    private JComboBox<String> comboGenero;
    private JTextField campoAnio;
    private JTextField campoCopias;

    private String[] generosDisponibles = {"Novela", "Ciencia", "Historia", "Infantil", "Tecnico"};

    private JTable tablaLibros;
    private DefaultTableModel modeloTabla;

    private JButton btnAgregar;
    private JButton btnMostrarTodos;
    private JButton btnFiltrarAutor;
    private JButton btnEliminar;

    public VentanaPrincipal(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;

        setTitle("Sistema de gestion de biblioteca");
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        crearFormulario();
        crearBotones();
        crearTabla();

        setVisible(true);
    }

    public void crearFormulario() {
        JPanel panelFormulario = new JPanel();
        panelFormulario.setLayout(new GridLayout(6, 2, 5, 5));

        campoTitulo = new JTextField();
        campoAutor = new JTextField();
        campoIsbn = new JTextField();
        comboGenero = new JComboBox<>(generosDisponibles);
        campoAnio = new JTextField();
        campoCopias = new JTextField();

        panelFormulario.add(new JLabel("Titulo:"));
        panelFormulario.add(campoTitulo);

        panelFormulario.add(new JLabel("Autor:"));
        panelFormulario.add(campoAutor);

        panelFormulario.add(new JLabel("ISBN/Codigo:"));
        panelFormulario.add(campoIsbn);

        panelFormulario.add(new JLabel("Genero:"));
        panelFormulario.add(comboGenero);

        panelFormulario.add(new JLabel("Año:"));
        panelFormulario.add(campoAnio);

        panelFormulario.add(new JLabel("Copias disponibles:"));
        panelFormulario.add(campoCopias);

        add(panelFormulario, BorderLayout.NORTH);
    }

    public void crearBotones() {
        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new FlowLayout());

        btnAgregar = new JButton("Agregar libro");
        btnMostrarTodos = new JButton("Mostrar todos");
        btnFiltrarAutor = new JButton("Filtrar por autor");
        btnEliminar = new JButton("Eliminar libro");

        panelBotones.add(btnAgregar);
        panelBotones.add(btnMostrarTodos);
        panelBotones.add(btnFiltrarAutor);
        panelBotones.add(btnEliminar);

        add(panelBotones, BorderLayout.SOUTH);

        btnAgregar.addActionListener(e -> agregarLibro());
        btnMostrarTodos.addActionListener(e -> mostrarTodos());
        btnFiltrarAutor.addActionListener(e -> filtrarPorAutor());
        btnEliminar.addActionListener(e -> eliminarLibro());
    }

    public void crearTabla() {
        String[] columnas = {"Titulo", "Autor", "ISBN", "Genero", "Año", "Copias"};
        modeloTabla = new DefaultTableModel(columnas, 0);
        tablaLibros = new JTable(modeloTabla);