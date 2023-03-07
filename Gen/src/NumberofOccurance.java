public class NumberofOccurance {
    public static void main(String[] args) {
        int[] arr = {4, 2, 1, 3, 4,5, 7,8,4};
        int target = 4;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
            }
        }
        System.out.println("Number of occurance of " + target + " is " + count);
    }
}
