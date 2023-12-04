import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * Tests for the Paint2 class.
 */
public class Paint2Test {
    public static void main(String[] args) {
        try(Stream<Path> paths = Files.walk(Paths.get("./inputs"))) {
            paths.forEach(path -> {
                if (path.toFile().isFile()) {
                    try {
                        System.out.println("Test: " + path.toString());
                        Process process = new ProcessBuilder("java", "Paint2.java").start();
                        try (OutputStream outputStream = process.getOutputStream();
                                BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream))) {
                            Files.copy(path, outputStream);
                            writer.flush();
                        }
                        InputStream inputStream = process.getInputStream();
                        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
                        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                        bufferedReader.lines().forEach(System.out::println);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("----------------------------");
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}