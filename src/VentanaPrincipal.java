import javax.swing.*;
import java.awt.*;
public class VentanaPrincipal extends JFrame{

    public VentanaPrincipal() {
        setTitle("Sistema de gestion de biblioteca");
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setVisible(true);
    }

    public static void main(String[] args){
        new VentanaPrincipal();
    }
}

