import java.util.Scanner;
public class DigitsNumbers {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int result = 100;
        for (int i = 0; i < count; i++){
            int number = scanner.nextShort();
            if((number % 4 == 0) && (number != 0)){
                result++;
            }
        }
        System.out.println(result);
    }
}