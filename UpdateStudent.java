import javax.swing.*;
import java.awt.*;
import java.io.File;

public class UpdateStudent {

    String photoPath = "";

    int foundIndex = -1;

    public UpdateStudent() {

        JFrame frame =
            new JFrame("Update Student");

        frame.setSize(1200,750);

        frame.setDefaultCloseOperation(
            JFrame.DISPOSE_ON_CLOSE
        );

        // BACKGROUND
        ImageIcon bg =
            new ImageIcon("dashboard.jpg");

        Image bgimg =
            bg.getImage().getScaledInstance(
                1200,
                750,
                Image.SCALE_SMOOTH
            );

        JLabel background =
            new JLabel(new ImageIcon(bgimg));

        background.setLayout(null);

        frame.setContentPane(background);

        // TITLE
        JLabel title =
            new JLabel("UPDATE STUDENT");

        title.setBounds(400,20,500,40);

        title.setForeground(Color.WHITE);

        title.setFont(
            new Font("Arial",Font.BOLD,32)
        );

        background.add(title);

        // SEARCH LABEL
        JLabel searchLabel =
            new JLabel("Enter Student Name");

        searchLabel.setBounds(
            100,
            80,
            200,
            30
        );

        searchLabel.setForeground(
            Color.WHITE
        );

        background.add(searchLabel);

        // SEARCH FIELD
        JTextField searchField =
            new JTextField();

        searchField.setBounds(
            100,
            115,
            250,
            35
        );

        background.add(searchField);

        // SEARCH BUTTON
        JButton searchBtn =
            new JButton("SEARCH");

        searchBtn.setBounds(
            380,
            115,
            130,
            35
        );

        background.add(searchBtn);

        // AGE
        JLabel ageLabel =
            new JLabel("Age");

        ageLabel.setBounds(
            100,
            190,
            150,
            30
        );

        ageLabel.setForeground(
            Color.WHITE
        );

        background.add(ageLabel);

        JTextField ageField =
            new JTextField();

        ageField.setBounds(
            100,
            225,
            250,
            35
        );

        background.add(ageField);

        // FATHER
        JLabel fatherLabel =
            new JLabel("Father Name");

        fatherLabel.setBounds(
            100,
            280,
            150,
            30
        );

        fatherLabel.setForeground(
            Color.WHITE
        );

        background.add(fatherLabel);

        JTextField fatherField =
            new JTextField();

        fatherField.setBounds(
            100,
            315,
            250,
            35
        );

        background.add(fatherField);

        // MOTHER
        JLabel motherLabel =
            new JLabel("Mother Name");

        motherLabel.setBounds(
            100,
            370,
            150,
            30
        );

        motherLabel.setForeground(
            Color.WHITE
        );

        background.add(motherLabel);

        JTextField motherField =
            new JTextField();

        motherField.setBounds(
            100,
            405,
            250,
            35
        );

        background.add(motherField);

        // DOB
        JLabel dobLabel =
            new JLabel("DOB");

        dobLabel.setBounds(
            100,
            460,
            150,
            30
        );

        dobLabel.setForeground(
            Color.WHITE
        );

        background.add(dobLabel);

        JTextField dobField =
            new JTextField();

        dobField.setBounds(
            100,
            495,
            250,
            35
        );

        background.add(dobField);

        // PHONE
        JLabel phoneLabel =
            new JLabel("Phone");

        phoneLabel.setBounds(
            500,
            190,
            150,
            30
        );

        phoneLabel.setForeground(
            Color.WHITE
        );

        background.add(phoneLabel);

        JTextField phoneField =
            new JTextField();

        phoneField.setBounds(
            500,
            225,
            250,
            35
        );

        background.add(phoneField);

        // EMAIL
        JLabel emailLabel =
            new JLabel("Email");

        emailLabel.setBounds(
            500,
            280,
            150,
            30
        );

        emailLabel.setForeground(
            Color.WHITE
        );

        background.add(emailLabel);

        JTextField emailField =
            new JTextField();

        emailField.setBounds(
            500,
            315,
            250,
            35
        );

        background.add(emailField);

        // RANK
        JLabel rankLabel =
            new JLabel("Rank");

        rankLabel.setBounds(
            500,
            370,
            150,
            30
        );

        rankLabel.setForeground(
            Color.WHITE
        );

        background.add(rankLabel);

        JTextField rankField =
            new JTextField();

        rankField.setBounds(
            500,
            405,
            250,
            35
        );

        background.add(rankField);

        // ACHIEVEMENT
        JLabel achievementLabel =
            new JLabel("Achievement");

        achievementLabel.setBounds(
            500,
            460,
            150,
            30
        );

        achievementLabel.setForeground(
            Color.WHITE
        );

        background.add(achievementLabel);

        JTextField achievementField =
            new JTextField();

        achievementField.setBounds(
            500,
            495,
            250,
            35
        );

        background.add(achievementField);

        // PHOTO PREVIEW
        JLabel photoPreview =
            new JLabel();

        photoPreview.setBounds(
            900,
            220,
            180,
            180
        );

        photoPreview.setBorder(
            BorderFactory.createLineBorder(
                Color.WHITE,
                3
            )
        );

        background.add(photoPreview);

        // UPLOAD BUTTON
        JButton uploadBtn =
            new JButton("UPLOAD PHOTO");

        uploadBtn.setBounds(
            880,
            430,
            220,
            40
        );

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

        // SEARCH ACTION
        searchBtn.addActionListener(e -> {

            foundIndex = -1;

            String searchName =
                searchField.getText()
                .trim();

            for(int i=0;
                i<StudentData.names.size();
                i++) {

                String storedName =
                    StudentData.names
                    .get(i)
                    .trim();

                if(storedName.equalsIgnoreCase(
                    searchName
                )) {

                    foundIndex = i;

                    ageField.setText(
                        StudentData.ages.get(i)
                    );

                    fatherField.setText(
                        StudentData.fathers.get(i)
                    );

                    motherField.setText(
                        StudentData.mothers.get(i)
                    );

                    dobField.setText(
                        StudentData.dobs.get(i)
                    );

                    phoneField.setText(
                        StudentData.phones.get(i)
                    );

                    emailField.setText(
                        StudentData.emails.get(i)
                    );

                    rankField.setText(
                        StudentData.ranks.get(i)
                    );

                    achievementField.setText(
                        StudentData
                        .achievements.get(i)
                    );

                    photoPath =
                        StudentData.photos.get(i);

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

                    break;
                }
            }

            if(foundIndex == -1) {

                JOptionPane.showMessageDialog(
                    frame,
                    "Student Not Found"
                );
            }
        });

        // UPDATE BUTTON
        JButton updateBtn =
            new JButton("UPDATE STUDENT");

        updateBtn.setBounds(
            450,
            620,
            250,
            45
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

            if(foundIndex == -1) {

                JOptionPane.showMessageDialog(
                    frame,
                    "Search Student First"
                );

                return;
            }

            StudentData.ages.set(
                foundIndex,
                ageField.getText()
            );

            StudentData.fathers.set(
                foundIndex,
                fatherField.getText()
            );

            StudentData.mothers.set(
                foundIndex,
                motherField.getText()
            );

            StudentData.dobs.set(
                foundIndex,
                dobField.getText()
            );

            StudentData.phones.set(
                foundIndex,
                phoneField.getText()
            );

            StudentData.emails.set(
                foundIndex,
                emailField.getText()
            );

            StudentData.ranks.set(
                foundIndex,
                rankField.getText()
            );

            StudentData.achievements.set(
                foundIndex,
                achievementField.getText()
            );

            StudentData.photos.set(
                foundIndex,
                photoPath
            );

            StudentData.saveData();

            JOptionPane.showMessageDialog(
                frame,
                "Student Updated Successfully"
            );
        });

        frame.setVisible(true);
    }
}
