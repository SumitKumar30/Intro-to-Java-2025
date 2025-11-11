import java.io.*;
import java.util.Scanner;

public class FileStats {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();

        File file = new File(fileName);

        // check if file exists
        if (!file.exists()) {
            System.out.println("File not found!");
            return;
        }

        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            String line;

            while ((line = br.readLine()) != null) {
                lineCount++;

                // count characters (excluding newline)
                charCount += line.length();

                // split by whitespace to count words
                String[] words = line.trim().split("\\s+", 2);
                if (words.length == 1 && words[0].isEmpty()) {
                    // handle empty line (no words)
                    continue;
                }
                wordCount += words.length;
            }

            br.close();
            fr.close();

            System.out.println("\n--- File Statistics ---");
            System.out.println("Lines: " + lineCount);
            System.out.println("Words: " + wordCount);
            System.out.println("Characters: " + charCount);

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
