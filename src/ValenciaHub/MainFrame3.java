package ValenciaHub;
//Alejandro Romero Lorenzo - 20509297J
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ValenciaHubBackEnd_Hub.*;

public class MainFrame3 extends JFrame{
    private JButton cerrarButton;
    private JTextArea DATOS;
    private JPanel mainPanel3;

    public MainFrame3(String aMostrar){
        setContentPane(mainPanel3);
        setTitle("Gestión de contenedores - Chequear en Aduanas");
        setSize(800,700);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setVisible(true);
        mainPanel3.setBorder(BorderFactory.createEmptyBorder(15,15,15,15));
        DATOS.setText(aMostrar);
        cerrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }
}
