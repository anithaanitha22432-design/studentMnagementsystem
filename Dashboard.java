import javax.swing.*;
import java.awt.*;

public class Dashboard {

    public Dashboard() {

        JFrame frame = new JFrame("Dashboard");

        frame.setSize(1200,700);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // BACKGROUND IMAGE
        ImageIcon bg = new ImageIcon("dashboard.jpg");

        Image bgimg = bg.getImage().getScaledInstance(
            1200,
            700,
            Image.SCALE_SMOOTH
        );

        JLabel background = new JLabel(new ImageIcon(bgimg));

        background.setLayout(null);

        frame.setContentPane(background);

        // TITLE
        JLabel title = new JLabel(
            "STUDENT MANAGEMENT SYSTEM"
        );

        title.setBounds(250,30,800,50);

        title.setForeground(Color.WHITE);

        title.setFont(
            new Font(
                "Arial",
                Font.BOLD,
                35
            )
        );

        background.add(title);

        // ADD STUDENT BUTTON
        JButton addBtn =
            new JButton("Add Student");

        addBtn.setBounds(
            180,
            170,
            250,
            50
        );

        addBtn.setFont(
            new Font(
                "Arial",
                Font.BOLD,
                18
            )
        );

        background.add(addBtn);

        addBtn.addActionListener(e -> {

            new AddStudent();
        });

        // VIEW STUDENTS BUTTON
        JButton viewBtn =
            new JButton("View Students");

        viewBtn.setBounds(
            500,
            170,
            250,
            50
        );

        viewBtn.setFont(
            new Font(
                "Arial",
                Font.BOLD,
                18
            )
        );

        background.add(viewBtn);

        viewBtn.addActionListener(e -> {

            new ViewStudents();
        });

        // SEARCH STUDENT BUTTON
        JButton searchBtn =
            new JButton("Search Student");

        searchBtn.setBounds(
            820,
            170,
            250,
            50
        );

        searchBtn.setFont(
            new Font(
                "Arial",
                Font.BOLD,
                18
            )
        );

        background.add(searchBtn);

        searchBtn.addActionListener(e -> {

            new SearchStudent();
        });

        // UPDATE STUDENT BUTTON
        JButton updateBtn =
            new JButton("Update Student");

        updateBtn.setBounds(
            300,
            320,
            250,
            50
        );

        updateBtn.setFont(
            new Font(
                "Arial",
                Font.BOLD,
                18
            )
        );

        background.add(updateBtn);

        updateBtn.addActionListener(e -> {

            new UpdateStudent();
        });

        // DELETE STUDENT BUTTON
        JButton deleteBtn =
            new JButton("Delete Student");

        deleteBtn.setBounds(
            650,
            320,
            250,
            50
        );

        deleteBtn.setFont(
            new Font(
                "Arial",
                Font.BOLD,
                18
            )
        );

        background.add(deleteBtn);

        deleteBtn.addActionListener(e -> {

            new DeleteStudent();
        });

        // FOOTER
        JLabel footer =
            new JLabel(
                "AI & DS MINI PROJECT"
            );

        footer.setBounds(
            450,
            580,
            400,
            40
        );

        footer.setForeground(Color.WHITE);

        footer.setFont(
            new Font(
                "Arial",
                Font.BOLD,
                22
            )
        );

        background.add(footer);

        frame.setVisible(true);
    }
}