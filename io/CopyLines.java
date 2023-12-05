import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class CopyLines {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("xanadu.txt"));
            PrintWriter writer = new PrintWriter(new FileWriter("xanadu_copylines.txt"))) {
            String nextLine;
            while ((nextLine = reader.readLine()) != null) {
                writer.println(nextLine);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
