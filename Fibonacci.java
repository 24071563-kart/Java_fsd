import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        System.out.print("Enter a number of terms to find the fibonacci series: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = 0, b = 1;

        System.out.print("Fibonacci Series: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
