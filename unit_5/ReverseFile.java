import java.io.*;
import java.util.*;

public class ReverseFile {
    public static void main(String[] args) {

        // Check if filename is passed as command-line argument
        if (args.length != 1) {
            System.out.println("Usage: java ReverseFile <filename>");
            return;
        }

        String fileName = args[0];
        File file = new File(fileName);

        if (!file.exists()) {
            System.out.println("File not found!");
            return;
        }

        List<String> reversedLines = new ArrayList<>();

        try {
            // 1️⃣ Read each line from the original file
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;

            while ((line = br.readLine()) != null) {
                // Reverse the line using StringBuilder
                String reversed = new StringBuilder(line).reverse().toString();
                reversedLines.add(reversed);
            }
            br.close();

            // 2️⃣ Write the reversed lines back to the same file
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            for (String reversedLine : reversedLines) {
                bw.write(reversedLine);
                bw.newLine();
            }
            bw.close();

            System.out.println("File has been reversed successfully!");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
