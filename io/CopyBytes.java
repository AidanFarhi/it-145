import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * A program that copies the bytes from a file.
 */
public class CopyBytes {
    public static void main(String[] args) {
        try (FileInputStream in = new FileInputStream("xanadu.txt");
            FileOutputStream out = new FileOutputStream("xanadu_copybytes.txt")) {
            int nexByte;
            while ((nexByte = in.read()) != -1) {
                out.write(nexByte);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}