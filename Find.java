import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Find {
    public static void main(String[] args) {
        // Use this method to test your program
        for (int i = 1; i < args.length; i++) {
            System.out.println(getLinesWithWordForFile(args[i], args[0]));
        }
    }

    public static String[] getLinesWithWordForFile(String file, String word) {
        // Write the word searching method here, return all lines that contain the word.
        // Make sure you return the full line that contains the word and that you return
        // ALL lines that contain the word
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                if (line.contains(word)) {
                    lines.add(line);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + file);
            e.printStackTrace();
        }
        return lines.toArray(new String[0]);
    }
    }

