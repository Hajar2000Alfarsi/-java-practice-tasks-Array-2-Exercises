import java.util.Arrays;
import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter from where to start: ");
        int start = sc.nextInt();
        System.out.println("Enter Enter from where to end:");
        int end = sc.nextInt();

        task12 ex12 = new task12();
        System.out.println("post 4 : " + Arrays.toString(ex12.fizzBuzz(start,end)));
    }

    public String[] fizzBuzz(int start, int end) {
        String[] result = new String[end - start];
        for (int i = start; i < end; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result[i-start] = "FizzBuzz";
            } else if (i % 3 == 0) {
                result[i-start] = "Fizz";
            } else if (i % 5 == 0) {
                result[i-start] = "Buzz";
            } else {
                result[i-start] = String.valueOf(i);
            }
        }
        return result;
    }
}