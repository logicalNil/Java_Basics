// Lets take a array of n number and we have to come each number of array with each number of array and print the array if it is greater from after elem.
import java.util.Scanner;

public class ComparingValues {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int i, max, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        n = sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        for(i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The array is: ");
        for(i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        //keeping time complexity O(N)
        max = arr[0];
        for(i = 0; i < n; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("The maximum element is: " + max);
        sc.close();
    }
}
