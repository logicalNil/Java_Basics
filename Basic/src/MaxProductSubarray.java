import java.util.Scanner;

public class MaxProductSubarray {
    public static void main (String[] args) {
        int[] arr = new int[10];
        int i, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        n = sc.nextInt();
        System.out.println("Enter the elements of the array: ");

    }
    public static int maxProductSubarray(int[] arr) {
        int n = arr.length;
        int maxEnd = 1;
        int minEnd = 1;
        int maxSoFar = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                maxEnd = maxEnd * arr[i];
                minEnd = Math.min(minEnd * arr[i], 1);
            } else if (arr[i] == 0) {
                maxEnd = 1;
                minEnd = 1;
            } else {
                int temp = maxEnd;
                maxEnd = Math.max(minEnd * arr[i], 1);
                minEnd = temp * arr[i];
            }
            if (maxSoFar < maxEnd) {
                maxSoFar = maxEnd;
            }
        }
        return maxSoFar;
    }

}

