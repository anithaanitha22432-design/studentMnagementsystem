import javax.swing.*;
import java.awt.*;

public class LoginPage {

    public static void main(String[] args) {

        JFrame frame =
            new JFrame("Login Page");

        frame.setSize(1000,600);

        frame.setDefaultCloseOperation(
            JFrame.EXIT_ON_CLOSE
        );

        ImageIcon icon =
            new ImageIcon("background.jpg");

        Image img =
            icon.getImage().getScaledInstance(
                1000,
                600,
                Image.SCALE_SMOOTH
            );

        JLabel background =
            new JLabel(new ImageIcon(img));

        background.setLayout(null);

        frame.setContentPane(background);

        JPanel panel =
            new JPanel();

        panel.setBounds(320,120,350,320);

        panel.setLayout(null);

        panel.setBackground(
            new Color(255,255,255,220)
        );

        background.add(panel);

        JLabel title =
            new JLabel("LOGIN");

        title.setBounds(110,20,200,40);

        title.setFont(
            new Font("Arial",Font.BOLD,30)
        );

        panel.add(title);

        JLabel user =
            new JLabel("Username");

        user.setBounds(40,90,120,30);

        panel.add(user);

        JTextField userField =
            new JTextField();

        userField.setBounds(40,125,250,40);

        panel.add(userField);

        JLabel pass =
            new JLabel("Password");

        pass.setBounds(40,180,120,30);

        panel.add(pass);

        JPasswordField passField =
            new JPasswordField();

        passField.setBounds(40,215,250,40);

        panel.add(passField);

        JButton loginBtn =
            new JButton("LOGIN");

        loginBtn.setBounds(100,270,150,40);

        panel.add(loginBtn);

        loginBtn.addActionListener(e -> {

            String username =
                userField.getText();

            String password =
                new String(
                    passField.getPassword()
                );

            if(username.equals("anitha")
                && password.equals("1234")) {

                JOptionPane.showMessageDialog(
                    frame,
                    "Login Successful"
                );

                frame.dispose();

                new Dashboard();

            } else {

                JOptionPane.showMessageDialog(
                    frame,
                    "Wrong Username or Password"
                );
            }
        });

        frame.setVisible(true);
    }
}