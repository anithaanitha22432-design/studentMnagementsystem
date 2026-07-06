import javax.swing.*;
import java.awt.*;

public class SearchStudent {

    public SearchStudent() {

        JFrame frame =
            new JFrame("Search Student");

        frame.setSize(850,650);

        ImageIcon image =
            new ImageIcon("dashboard.jpg");

        Image img =
            image.getImage().getScaledInstance(
                850,
                650,
                Image.SCALE_SMOOTH
            );

        JLabel background =
            new JLabel(new ImageIcon(img));

        background.setLayout(null);

        frame.setContentPane(background);

        JLabel title =
            new JLabel("SEARCH STUDENT");

        title.setBounds(250,20,400,40);

        title.setForeground(Color.WHITE);

        title.setFont(
            new Font("Arial",Font.BOLD,30)
        );

        background.add(title);

        JLabel label =
            new JLabel("Enter Student Name");

        label.setBounds(250,100,250,30);

        label.setForeground(Color.WHITE);

        background.add(label);

        JTextField field =
            new JTextField();

        field.setBounds(250,140,250,40);

        background.add(field);

        JTextArea result =
            new JTextArea();

        JScrollPane pane =
            new JScrollPane(result);

        pane.setBounds(120,260,550,250);

        background.add(pane);

        JButton btn =
            new JButton("SEARCH");

        btn.setBounds(300,200,150,40);

        background.add(btn);

        btn.addActionListener(e -> {

            String name =
                field.getText();

            String output =
                "Student Not Found";

            for(int i=0;
                i<StudentData.names.size();
                i++) {

                if(StudentData.names
                    .get(i)
                    .equalsIgnoreCase(name)) {

                    output =

                        "Name : "
                        + StudentData.names.get(i)

                        + "\nAge : "
                        + StudentData.ages.get(i)

                        + "\nFather : "
                        + StudentData.fathers.get(i)

                        + "\nMother : "
                        + StudentData.mothers.get(i)

                        + "\nDOB : "
                        + StudentData.dobs.get(i)

                        + "\nPhone : "
                        + StudentData.phones.get(i)

                        + "\nEmail : "
                        + StudentData.emails.get(i)

                        + "\nRank : "
                        + StudentData.ranks.get(i)

                        + "\nAchievement : "
                        + StudentData.achievements.get(i);
                }
            }

            result.setText(output);
        });

        frame.setVisible(true);
    }
}