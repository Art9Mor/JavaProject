import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        do {
            System.out.println("Enter your name: ");
            name = scanner.nextLine();
        } while (name.length() == 0);
        System.out.println("Hello, " + name + "!");
    }
}