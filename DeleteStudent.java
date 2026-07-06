import javax.swing.*;
import java.awt.*;

public class DeleteStudent {

    public DeleteStudent() {

        JFrame frame =
            new JFrame("Delete Student");

        frame.setSize(700,450);

        ImageIcon image =
            new ImageIcon("dashboard.jpg");

        Image img =
            image.getImage().getScaledInstance(
                700,
                450,
                Image.SCALE_SMOOTH
            );

        JLabel background =
            new JLabel(new ImageIcon(img));

        background.setLayout(null);

        frame.setContentPane(background);

        JLabel title =
            new JLabel("DELETE STUDENT");

        title.setBounds(170,40,350,40);

        title.setForeground(Color.WHITE);

        title.setFont(
            new Font("Arial",Font.BOLD,30)
        );

        background.add(title);

        JLabel label =
            new JLabel("Enter Student Name");

        label.setBounds(180,150,250,30);

        label.setForeground(Color.WHITE);

        background.add(label);

        JTextField field =
            new JTextField();

        field.setBounds(180,190,250,40);

        background.add(field);

        JButton btn =
            new JButton("DELETE");

        btn.setBounds(240,280,140,40);

        background.add(btn);

        btn.addActionListener(e -> {

            String name =
                field.getText();

            boolean found = false;

            for(int i=0;
                i<StudentData.names.size();
                i++) {

                if(StudentData.names
                    .get(i)
                    .equalsIgnoreCase(name)) {

                    StudentData.names.remove(i);

                    StudentData.ages.remove(i);

                    StudentData.fathers.remove(i);

                    StudentData.mothers.remove(i);

                    StudentData.dobs.remove(i);

                    StudentData.phones.remove(i);

                    StudentData.emails.remove(i);

                    found = true;

                    break;
                }
            }

            if(found) {

                JOptionPane.showMessageDialog(
                    frame,
                    "Student Deleted"
                );

            } else {

                JOptionPane.showMessageDialog(
                    frame,
                    "Student Not Found"
                );
            }
        });

        frame.setVisible(true);
    }
}