import java.util.Scanner;

public class Task1 {
    private static final int MIN_RANGE = 1;
    private static final int MAX_RANGE = 1000;
    public static void main(String[] args) {
        int n = 0;
        boolean isCriteriaMet = false;

        Scanner sc = new Scanner(System.in);

        //Checking criteria match for n
        while (!isCriteriaMet) {
            n = sc.nextInt();
            if (n < MIN_RANGE || n > MAX_RANGE) {
                System.out.println("Array length is not in range (1 - 1000), please enter a new one");
            } else {
                isCriteriaMet = true;
            }
        }

        int[] candles = new int[n];

        while (isCriteriaMet) {
            for (int i = 0; i < n; i++) {
                candles[i] = sc.nextInt();
            }
            for (int num : candles) {
                if (num > MAX_RANGE || num < MIN_RANGE) {
                    System.out.println("One of numbers out of range ( 1 - 1000), insert new numbers");
                    isCriteriaMet = true;
                    break;
                } else {
                    isCriteriaMet = false;
                }
            }
        }

        System.out.println(birthdayCakesCandles(candles));
    }

    public static int birthdayCakesCandles(int[] candles){
        int max = 0;
        int count = 0;

        //Finding highest number
        for (int i = 0; i < candles.length; i++){
            if(candles[i] > max){
                max = candles[i];
            }
        }

        //Finding how many times it comes
        for (int i = 0; i < candles.length; i++){
            if (max == candles[i]){
                count++;
            }
        }

        return count;
    }
}
