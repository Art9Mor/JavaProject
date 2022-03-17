import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        int start;
        int finish;
        int sum = 0;
        int sum2 = 0;
        int count = 0;


        Scanner scanner = new Scanner(System.in);

        System.out.print("Beginning of the range: ");
        start = scanner.nextInt();

        System.out.print("Ending of the range: ");
        finish = scanner.nextInt();

        for(int i = start; i <= finish; i++) {
            sum +=i;
            if(i%2 == 0){
                sum2+= i;
                count ++;
            }
        }
        double average = (double) (sum) / (finish - start);
        System.out.println("Average= " + average);

        double average2 = (double) (sum2) / count;
        System.out.println("Average2= " + average2);
    }
}
