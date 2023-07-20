public class MaxEquilibriumSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 0, 3, 2, 1};
        int i, j, n, sum1, sum2, max;
        n = arr.length;
        max = 0;
        for(i = 0; i < n; i++) {
            sum1 = 0;
            sum2 = 0;
            for(j = 0; j < i; j++) {
                sum1 += arr[j];
            }
            for(j = i + 1; j < n; j++) {
                sum2 += arr[j];
            }
            if(sum1 == sum2) {
                max = sum1;
            }
        }
        System.out.println("The maximum equilibrium sum is: " + max);
    }
}
