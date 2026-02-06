import java.util.Scanner;

public class Studentmarks {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the marks: ");
        int marks = sc.nextInt();

        if (marks >= 75) {
            System.out.println("Result: Distinction");
        } else if (marks >= 60) {
            System.out.println("Result: First Class");
        } else if (marks >= 40) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }
    }
}
