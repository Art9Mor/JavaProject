import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        int start;
        int finish;
        int sum1 = 0;
        int sum2 = 0;
        int count1 = 0;
        int count2 = 0;


        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the beginning of the number range: ");
        start = scanner.nextInt();

        System.out.print("Enter the ending of the number range: ");
        finish = scanner.nextInt();

        while (start <= finish) {
            sum1 += start;
            count1++;
        if (start % 2 == 0) {
            sum2 +=start;
            count2++;
        }
        ++start;
    }
        double average1 = (double) sum1 / count1;
        System.out.println("Average = " + average1);
        double average2 = (double) sum2 / count2;
        System.out.println("Average for even numbers = " + average2);
    }
}
