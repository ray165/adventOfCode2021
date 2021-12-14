import java.io.*;
import java.util.*;

public class Day1 {
    static String fileName = "input.txt";

    public static void parseFile() {
        Integer prev = null;
        Integer curr = null; 
        Scanner myReader = null;
        int counter = 0; 

        try {
            File file = new File(fileName);
            myReader = new Scanner(file);
            while (myReader.hasNextInt()) {
                curr = myReader.nextInt();
                if (prev == null || curr == null) {
                    prev = curr;
                }

                if (curr > prev) {
                    counter++;
                }

                prev = curr;
            }
        } catch (FileNotFoundException e) {
            System.err.println(e);
        } finally {
            myReader.close();
            System.out.println(counter);
        }
    }

    /**
     * Correct! ans: 1184
     * @param args
     */
    public static void main(String[] args) {
        parseFile();
    }
}