import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal extends JFrame {

    private JTextField campoTitulo, campoAutor, campoIsbn, campoGenero, campoAnio, campoCopias;

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

        add(panelFormulario, BorderLayout.NORTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        new VentanaPrincipal();
    }
}