import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame {
    private JPanel LogIn;
    private JButton resigterbtn;
    private JButton loginbtn;

    public LoginForm(){
        setTitle("Log In");
        setContentPane(LogIn);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setSize(500,600);

        loginbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new TrueLogIn();
            }
        });
    }


}
