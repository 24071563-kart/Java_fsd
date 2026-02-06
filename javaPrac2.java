import java.util.Scanner;

public class javaPrac2 {
    static Scanner sc = new Scanner(System.in);
    private String[] Name;
    private String[] Branch;

    public labjav(int n) {
        Name = new String[n];
        Branch = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Name : ");
            Name[i] = sc.next();

            System.out.println("Branch : ");
            Branch[i] = sc.next();

            System.out.println("\n");
        }
    }

    public void labDatadis() {
        for (int i = 0; i < Name.length; i++) {
            System.out.println(
                "Name : " + Name[i] +
                ", Branch : " + Branch[i] +
                ", PC no. (alloted) : " + (i + 1)
            );
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter lab details : ");
        String lab = sc.nextLine();

        System.out.print("Enter no. of students : ");
        int n = sc.nextInt();

        System.out.println("Enter NAME and BRANCH of students : ");
        labjav obj = new labjav(n);

        System.out.println("Lab name : " + lab);
        obj.labDatadis();
    }
}
