public class BlockSwap {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int i, j, n, d;
        n = arr.length;
        d = 4;
        System.out.println("The array is: ");
        for(i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        if(d == 0 || d == n) {
            System.out.println("The array after rotation is: ");
            for(i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        } else if(d < n - d) {
            j = d;
            for(i = 0; i < n; i++) {
                int tem = arr[i];
                arr[i] = arr[j];
                arr[j] = tem;
                j++;
                if(j == n) {
                    break;
                }
            }
            System.out.println("The array after rotation is: ");
            for(i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        } else {
            j = n - d;
            for(i = 0; i < n; i++) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
                if(j == n) {
                    break;
                }
            }
            System.out.println("The array after rotation is: ");
            for(i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
