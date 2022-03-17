public class Average {
    public static void main(String[] args) {
        int[] numbers = {3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17};
        double result = 0;
        if (numbers.length > 0) {
            double sum = 0;
            for (int i = 0; i < numbers.length; i++) {
                sum += numbers[i];
            }
            result = sum / numbers.length;
        }
        System.out.println("Значение среднего арифметического = " + result);
    }

}

