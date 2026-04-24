import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CompteurMots {
    public static void main(String[] args) {
        int total = 0;

        try {
            File file = new File("TestExercice3.txt");
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                String line = sc.nextLine().trim();
                if (!line.isEmpty()) {
                    String[] words = line.split("\\s+");
                    total += words.length;
                }
            }

            sc.close();
            System.out.println(total);

        } catch (FileNotFoundException e) {
            System.out.println("Erreur");
        }
    }
}