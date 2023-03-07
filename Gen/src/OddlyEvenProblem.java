public class OddlyEvenProblem {
    // Java program for Given a maximum of 100 digit numbers as input, find the difference between the sum of odd and even position digits.

    public static void main(String[] args) {
        int[] arr = {123456, 1234567, 12345678, 123456789};
        for (int i = 0; i < arr.length; i++) {
            int oddSum = 0;
            int evenSum = 0;
            int num = arr[i];
            int count = 0;
            while (num > 0) {
                int rem = num % 10;
                if (count % 2 == 0) {
                    evenSum += rem;
                } else {
                    oddSum += rem;
                }
                num /= 10;
                count++;
            }
            System.out.println(evenSum - oddSum);
        }
    }
}
