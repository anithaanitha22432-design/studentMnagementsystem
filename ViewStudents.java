import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;

public class ViewStudents {

    public ViewStudents() {

        JFrame frame =
            new JFrame("View Students");

        frame.setSize(1200,700);

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
            new JLabel("VIEW STUDENTS");

        title.setBounds(430,20,400,40);

        title.setForeground(Color.WHITE);

        title.setFont(
            new Font("Arial",Font.BOLD,32)
        );

        background.add(title);

        String[] columns = {

            "Photo",
            "Name",
            "Age",
            "Father",
            "Mother",
            "DOB",
            "Phone",
            "Email",
            "Rank",
            "Achievement"
        };

        Object[][] data =
            new Object[
                StudentData.names.size()
            ][10];

        for(int i=0;
            i<StudentData.names.size();
            i++) {

            ImageIcon icon =
                new ImageIcon(
                    StudentData.photos.get(i)
                );

            Image image =
                icon.getImage()
                .getScaledInstance(
                    60,
                    60,
                    Image.SCALE_SMOOTH
                );

            data[i][0] =
                new ImageIcon(image);

            data[i][1] =
                StudentData.names.get(i);

            data[i][2] =
                StudentData.ages.get(i);

            data[i][3] =
                StudentData.fathers.get(i);

            data[i][4] =
                StudentData.mothers.get(i);

            data[i][5] =
                StudentData.dobs.get(i);

            data[i][6] =
                StudentData.phones.get(i);

            data[i][7] =
                StudentData.emails.get(i);

            data[i][8] =
                StudentData.ranks.get(i);

            data[i][9] =
                StudentData.achievements.get(i);
        }

        JTable table =
            new JTable(data, columns) {

            public Class getColumnClass(
                int column
            ) {

                if(column == 0) {

                    return Icon.class;
                }

                return String.class;
            }
        };

        table.setRowHeight(70);

        table.setFont(
            new Font("Arial",Font.PLAIN,14)
        );

        JTableHeader header =
            table.getTableHeader();

        header.setFont(
            new Font("Arial",Font.BOLD,16)
        );

        JScrollPane pane =
            new JScrollPane(table);

        pane.setBounds(20,100,1140,500);

        background.add(pane);

        frame.setVisible(true);
    }
}
