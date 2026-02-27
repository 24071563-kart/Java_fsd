import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {

        int[] arr = {12, 23, 78, 14, 56, 96, 16, 43, 85};
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }

        System.out.println("Sorted array (insertion sort) : ");
        for (int i = 1; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
