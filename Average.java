import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        int start;
        int finish;
        int i = 1;
        i = i + 1;
        int sum = 0;


        Scanner scanner = new Scanner(System.in);

        System.out.print("Beginning of the range: ");
        start = scanner.nextInt();

        System.out.print("Ending of the range: ");
        finish = scanner.nextInt();

        do {
            int count = scanner.nextInt();
            sum += i;
            ++i;
            double average = (double) (sum) / count;
            System.out.println("Average= " + average);
        }
        while (i >= 17);
    }
}
