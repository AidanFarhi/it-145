import java.io.FileReader;
import java.io.FileWriter;

public class CopyCharacters {
    public static void main(String[] args) {
        try (FileReader in = new FileReader("xanadu.txt");
            FileWriter out = new FileWriter("xanadu_copycharacters.txt")) {
            int nextChar;
            while ((nextChar = in.read()) != -1) {
                out.write(nextChar);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
