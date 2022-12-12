import java.io.*;
import java.util.Scanner;

public class FileCounter {

    // int for the number of letters
    private static int chars = 0;
    // int for the number of letters
    private static int words = 0;
    // int for the number of letters
    private static int lines = 0;

    public static void processFile(String fileName) {
        lines = 0;
        words = 0;
        chars = 0;
        try {
            Scanner msc = new Scanner(new File(fileName));
            while(msc.hasNextLine()){
                String line = msc.nextLine();
                lines++;
                chars += line.length();
                try (Scanner lineScanner = new Scanner(line)) {
                    while (lineScanner.hasNext()) {
                        String word = lineScanner.next();
                        words++;
                    }
                }
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found" + fileName);
            
        }
      
     System.out.println(getCharacterCount());
     System.out.println(getLineCount());
     System.out.println(getWordCount());  
        }
    
    
    
    public static int getWordCount() {
        return words;
    }

    public static int getCharacterCount() {
        return chars;
    }

    public static int getLineCount() {
        return lines;
    }

}