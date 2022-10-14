import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a number: ");
        int number = in.nextInt();

        String numberToStr = String.valueOf(number);
        String[] strToArray = numberToStr.split("");
        int[] numbers = new int[strToArray.length];

        for (int i = 0; i < strToArray.length; i++) {
            numbers[i] = Integer.valueOf(strToArray[i]);
            System.out.println(numbers[i]);
        }
        int sum = 0;
        for (int i: numbers) {
            sum = sum + i;
        }
        int sumqwe = 0;
        for (int i: numbers) {
            if (i%2 != 0) {
                sumqwe += i;
            }
        }
        int max = 0;
        for (int i: numbers) {
           max = Math.max(max, i);

        }

        System.out.println("Сумма всех цифр = " + sum);
        System.out.println("Сумма нечётных цифр = " + sumqwe);
        System.out.println("Максимальная цифра = " + max);
    }
}
