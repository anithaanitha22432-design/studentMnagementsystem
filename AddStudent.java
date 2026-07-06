import javax.swing.*;
import java.awt.*;
import java.io.File;

public class AddStudent {

    String photoPath = "";

    public AddStudent() {

        JFrame frame =
            new JFrame("Add Student");

        frame.setSize(1200,700);

        frame.setDefaultCloseOperation(
            JFrame.DISPOSE_ON_CLOSE
        );

        ImageIcon bg =
            new ImageIcon("dashboard.jpg");

        Image bgimg =
            bg.getImage().getScaledInstance(
                1200,
                700,
                Image.SCALE_SMOOTH
            );

        JLabel background =
            new JLabel(new ImageIcon(bgimg));

        background.setLayout(null);

        frame.setContentPane(background);

        JLabel title =
            new JLabel("ADD STUDENT");

        title.setBounds(450,20,400,40);

        title.setForeground(Color.WHITE);

        title.setFont(
            new Font("Arial",Font.BOLD,32)
        );

        background.add(title);

        // NAME
        JLabel nameLabel =
            new JLabel("Student Name");

        nameLabel.setBounds(80,100,150,30);

        nameLabel.setForeground(Color.WHITE);

        background.add(nameLabel);

        JTextField nameField =
            new JTextField();

        nameField.setBounds(80,130,250,35);

        background.add(nameField);

        // AGE
        JLabel ageLabel =
            new JLabel("Age");

        ageLabel.setBounds(80,180,150,30);

        ageLabel.setForeground(Color.WHITE);

        background.add(ageLabel);

        JTextField ageField =
            new JTextField();

        ageField.setBounds(80,210,250,35);

        background.add(ageField);

        // FATHER
        JLabel fatherLabel =
            new JLabel("Father Name");

        fatherLabel.setBounds(80,260,150,30);

        fatherLabel.setForeground(Color.WHITE);

        background.add(fatherLabel);

        JTextField fatherField =
            new JTextField();

        fatherField.setBounds(80,290,250,35);

        background.add(fatherField);

        // MOTHER
        JLabel motherLabel =
            new JLabel("Mother Name");

        motherLabel.setBounds(80,340,150,30);

        motherLabel.setForeground(Color.WHITE);

        background.add(motherLabel);

        JTextField motherField =
            new JTextField();

        motherField.setBounds(80,370,250,35);

        background.add(motherField);

        // DOB
        JLabel dobLabel =
            new JLabel("DOB");

        dobLabel.setBounds(80,420,150,30);

        dobLabel.setForeground(Color.WHITE);

        background.add(dobLabel);

        JTextField dobField =
            new JTextField();

        dobField.setBounds(80,450,250,35);

        background.add(dobField);

        // PHONE
        JLabel phoneLabel =
            new JLabel("Phone");

        phoneLabel.setBounds(450,100,150,30);

        phoneLabel.setForeground(Color.WHITE);

        background.add(phoneLabel);

        JTextField phoneField =
            new JTextField();

        phoneField.setBounds(450,130,250,35);

        background.add(phoneField);

        // EMAIL
        JLabel emailLabel =
            new JLabel("Email");

        emailLabel.setBounds(450,180,150,30);

        emailLabel.setForeground(Color.WHITE);

        background.add(emailLabel);

        JTextField emailField =
            new JTextField();

        emailField.setBounds(450,210,250,35);

        background.add(emailField);

        // RANK
        JLabel rankLabel =
            new JLabel("Rank");

        rankLabel.setBounds(450,260,150,30);

        rankLabel.setForeground(Color.WHITE);

        background.add(rankLabel);

        JTextField rankField =
            new JTextField();

        rankField.setBounds(450,290,250,35);

        background.add(rankField);

        // ACHIEVEMENT
        JLabel achievementLabel =
            new JLabel("Achievement");

        achievementLabel.setBounds(450,340,150,30);

        achievementLabel.setForeground(Color.WHITE);

        background.add(achievementLabel);

        JTextField achievementField =
            new JTextField();

        achievementField.setBounds(450,370,250,35);

        background.add(achievementField);

        // PHOTO PREVIEW
        JLabel photoPreview =
            new JLabel();

        photoPreview.setBounds(850,150,180,180);

        photoPreview.setBorder(
            BorderFactory.createLineBorder(
                Color.WHITE,
                3
            )
        );

        background.add(photoPreview);

        // UPLOAD PHOTO
        JButton uploadBtn =
            new JButton("UPLOAD PHOTO");

        uploadBtn.setBounds(840,360,200,40);

        background.add(uploadBtn);

        uploadBtn.addActionListener(e -> {

            JFileChooser chooser =
                new JFileChooser();

            int result =
                chooser.showOpenDialog(frame);

            if(result ==
                JFileChooser.APPROVE_OPTION) {

                File file =
                    chooser.getSelectedFile();

                photoPath =
                    file.getAbsolutePath();

                ImageIcon icon =
                    new ImageIcon(photoPath);

                Image img =
                    icon.getImage()
                    .getScaledInstance(
                        180,
                        180,
                        Image.SCALE_SMOOTH
                    );

                photoPreview.setIcon(
                    new ImageIcon(img)
                );
            }
        });

        // ADD BUTTON
        JButton addBtn =
            new JButton("ADD STUDENT");

        addBtn.setBounds(450,550,250,45);

        addBtn.setFont(
            new Font("Arial",Font.BOLD,18)
        );

        background.add(addBtn);

        addBtn.addActionListener(e -> {

            StudentData.names.add(
                nameField.getText()
            );

            StudentData.ages.add(
                ageField.getText()
            );

            StudentData.fathers.add(
                fatherField.getText()
            );

            StudentData.mothers.add(
                motherField.getText()
            );

            StudentData.dobs.add(
                dobField.getText()
            );

            StudentData.phones.add(
                phoneField.getText()
            );

            StudentData.emails.add(
                emailField.getText()
            );

            StudentData.ranks.add(
                rankField.getText()
            );

            StudentData.achievements.add(
                achievementField.getText()
            );

            StudentData.photos.add(
                photoPath
            );

            StudentData.saveData();

            JOptionPane.showMessageDialog(
                frame,
                "Student Added Successfully"
            );
        });

        frame.setVisible(true);
    }
}