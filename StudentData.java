import java.util.ArrayList;
import java.io.*;

public class StudentData {

    static ArrayList<String> names =
        new ArrayList<>();

    static ArrayList<String> ages =
        new ArrayList<>();

    static ArrayList<String> fathers =
        new ArrayList<>();

    static ArrayList<String> mothers =
        new ArrayList<>();

    static ArrayList<String> dobs =
        new ArrayList<>();

    static ArrayList<String> phones =
        new ArrayList<>();

    static ArrayList<String> emails =
        new ArrayList<>();

    static ArrayList<String> ranks =
        new ArrayList<>();

    static ArrayList<String> achievements =
        new ArrayList<>();

    static ArrayList<String> photos =
        new ArrayList<>();

    // LOAD DATA
    static {

        loadData();
    }

    // SAVE DATA METHOD
    public static void saveData() {

        try {

            PrintWriter writer =
                new PrintWriter(
                    new FileWriter(
                        "students.txt"
                    )
                );

            for(int i=0;
                i<names.size();
                i++) {

                writer.println(
                    names.get(i)
                    + ","
                    + ages.get(i)
                    + ","
                    + fathers.get(i)
                    + ","
                    + mothers.get(i)
                    + ","
                    + dobs.get(i)
                    + ","
                    + phones.get(i)
                    + ","
                    + emails.get(i)
                    + ","
                    + ranks.get(i)
                    + ","
                    + achievements.get(i)
                    + ","
                    + photos.get(i)
                );
            }

            writer.close();

        } catch(Exception e) {

            e.printStackTrace();
        }
    }

    // LOAD DATA METHOD
    public static void loadData() {

        try {

            File file =
                new File("students.txt");

            if(!file.exists()) {

                return;
            }

            BufferedReader reader =
                new BufferedReader(
                    new FileReader(file)
                );

            String line;

            while((line =
                reader.readLine()) != null) {

                String[] data =
                    line.split(",");

                names.add(data[0]);

                ages.add(data[1]);

                fathers.add(data[2]);

                mothers.add(data[3]);

                dobs.add(data[4]);

                phones.add(data[5]);

                emails.add(data[6]);

                ranks.add(data[7]);

                achievements.add(data[8]);

                photos.add(data[9]);
            }

            reader.close();

        } catch(Exception e) {

            e.printStackTrace();
        }
    }
}