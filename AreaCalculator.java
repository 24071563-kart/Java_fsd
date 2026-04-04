import java.util.Scanner;

public class AreaCalculator {
    double area(int side) {
        return side*side;
    }

    double area(int length, int breadth) {
        return length*breadth;
    }

    double area(double radius) {
        return 3.14*radius*radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AreaCalculator calc = new AreaCalculator();

        while (true) {
            System.out.println("Choose Shape: \n1. Square \n2. Rectangle \n3. Circle \n4. Exit");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.print("Enter side of square: ");
                    int side = sc.nextInt();
                    System.out.println("Square Area:" + calc.area(side));
                    break;

                case 2:
                    System.out.println("Enter Length of rectangle: ");
                    int length = sc.nextInt();
                    System.out.println("Enter breadth of rectangle: ");
                    int breadth = sc.nextInt();
                    System.out.println("Rectangle Area:"+ calc.area(length, breadth));
                    break;

                case 3:
                    System.out.println("Enter radius of circle: ");
                    double radius = sc.nextDouble();
                    System.out.println("Circle Area:" + calc.area(radius));
                    break;

                case 4:
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
