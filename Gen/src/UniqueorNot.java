public class UniqueorNot {
    //Check weather the given number is unique or not

    public static void main(String[] args) {
        int arr[] = {889,997,8878,889};
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
        }
        if (count == 0) {
            System.out.println("Unique");
        } else {
            System.out.println("Not Unique");
        }
    }
}
