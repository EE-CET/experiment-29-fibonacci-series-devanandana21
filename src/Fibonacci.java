import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        if (N == 1) {
            System.out.println(0);
            return;
        } else if (N == 2) {
            System.out.println(1);
            return;
        }

        long a = 0, b = 1, fib = 0;
        for (int i = 3; i <= N; i++) {
            fib = a + b;
            a = b;
            b = fib;
        }

        System.out.println(fib);
    }
}
