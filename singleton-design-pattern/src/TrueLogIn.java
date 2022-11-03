import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TrueLogIn extends JFrame{
    private JPanel logInForm;
    private JLabel usernameLb;
    private JTextField username;
    private JLabel pswdLb;
    private JTextField password;
    private JButton login;
    private JLabel test;
    private JTextField pswd;

    public TrueLogIn(){
        setContentPane(logInForm);
        setVisible(true);
        setTitle("Log In");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,600);



        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PatientsLogIn p;
                p = PatientsLogIn.getInstance();
                String one = username.getText();
                String two = pswd.getText();
                boolean flag;

                if(one.length()>0 && two.length()>0) {
                    flag = p.Log(one, two);
                    if (flag) {
                        setVisible(false);
                        new PatientPage();
                    } else {
                        System.out.println("wrong pass");
                    }
                }
            }
        });
    }
}
