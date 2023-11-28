import java.io.IOException;

public class InputStreamReader {

    public static void main(String[] args) throws IOException {
        int userInput;
        do {
            userInput = System.in.read();
            System.out.println((char) userInput);
        } while (userInput != -1 && (char) userInput != 'q');
    }
}