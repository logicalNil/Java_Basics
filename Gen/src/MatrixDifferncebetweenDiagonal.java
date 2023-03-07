public class MatrixDifferncebetweenDiagonal {
    public static void main(String[] args) {
        int[][] arr = {{11, 2, 4}, {4, 5, 6}, {10, 8, -12}};
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < arr.length; i++) {
            sum1 += arr[i][i];
            sum2 += arr[i][arr.length - i - 1];
        }
        System.out.println(Math.abs(sum1 - sum2));
    }
}