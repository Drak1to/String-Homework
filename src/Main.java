import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter some string:");
            String str = scanner.nextLine();
            System.out.println(Arrays.toString(str.split(" ")));
            String c = str;
            c = c.replace("Привіт,", "Сьогодні,").replace("я", "Я");
            System.out.println(c);
            String a = str;
            a = a.replace("Привіт,", "Справи" ).replace("справи?",  "привіт");
            System.out.println(a);
            System.exit(0);
        }
    }
}
// Привіт, як справи?