public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        quickSort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    public static void swap(int[] arr, int l, int r) {
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }
    public static void quickSort(int[] arr, int l, int r) {
        if (l >= r) return;
        int p = arr[l + (r - l) / 2];
        int index = partition(arr, l, r, p);
        quickSort(arr, l, index - 1);
        quickSort(arr, index, r);
    }
    public static int partition(int[] arr, int l, int r, int p) {
        while (l <= r) {
            while (arr[l] < p) l++;
            while (arr[r] > p) r--;
            if (l <= r) {
                swap(arr, l, r);
                l++;
                r--;
            }
        }
        return l;
    }
}
