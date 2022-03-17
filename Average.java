import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        int start;
        int finish;
        int i = 0;
        int sum = 0;


        Scanner scanner = new Scanner(System.in);

        System.out.print("Beginning of the range: ");
        start = scanner.nextInt();

        System.out.print("Ending of the range: ");
        finish = scanner.nextInt();

        if (i < 17) {
            System.out.println("Внутри диапазона");
        }

        double average = (double) (start + finish) /2;
        System.out.println("Average= " + average);
