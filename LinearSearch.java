import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = {12, 23, 78, 14, 56, 96, 16, 43, 85};
        int n = arr.length;

        System.out.println("Enter the key to be searched : ");
        int key = input.nextInt();

        for(int i = 0; i<arr.length; i++){
            if(arr[i] == key){
                System.out.println("Element found at position "+(i+1));
            }
        }
    }
}
