import javax.swing.*;
import java.awt.*;

public class PatientPage extends JFrame{
    private JPanel patientpage;
    private JLabel welcomeLb;

    public PatientPage(){
        setContentPane(patientpage);
        setVisible(true);
        setTitle("welcome");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,600);

    }
}
