import java.util.Scanner;

public class StringInputStream {
    public static void main(String[] args) {
        String userInfo = "Jim Johnson 26";
        Scanner scanner = new Scanner(userInfo);
        String firstName = scanner.next();
        String lastName = scanner.next();
        Integer age = scanner.nextInt();
        System.out.printf(
            "First name: %s | Last name: %s | Age: %d\n",
            firstName, lastName, age
        );
        scanner.close();
    }
}
