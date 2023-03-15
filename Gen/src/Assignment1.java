import java.util.Scanner;

class Assignment1 {

    private int cousumerNumber;
    private String consumerName;
    private String consumerType;
    private int prevMonthReading;
    private int currMonthReading;
    private int unitsConsumed;

    public void readInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter consumer number: ");
        cousumerNumber = scanner.nextInt();
        System.out.print("Enter consumer name: ");
        consumerName = scanner.next();
        System.out.print("Enter previous month reading: ");
        prevMonthReading = scanner.nextInt();
        System.out.print("Enter current month reading: ");
        currMonthReading = scanner.nextInt();

         // User Input type of ElectricityBill connection
        System.out.print("Enter type of EB connection (D for domestic, C for commercial): ");
        consumerType = scanner.next();

        unitsConsumed = currMonthReading - prevMonthReading;
    }

    // Method to calculate the bill amount
    public double calculateBillAmount() {
        double billAmount = 0;
        if (consumerType.equalsIgnoreCase("D")) {
            if (unitsConsumed <= 100) {
                billAmount = unitsConsumed * 1;
            } else if (unitsConsumed <= 200) {
                billAmount = 100 * 1 + (unitsConsumed - 100) * 2.5;
            } else if (unitsConsumed <= 500) {
                billAmount = 100 * 1 + 100 * 2.5 + (unitsConsumed - 200) * 4;
            } else {
                billAmount = 100 * 1 + 100 * 2.5 + 300 * 4 + (unitsConsumed - 500) * 6;
            }
        } else if (consumerType.equalsIgnoreCase("C")) {
            if (unitsConsumed <= 100) {
                billAmount = unitsConsumed * 2;
            } else if (unitsConsumed <= 200) {
                billAmount = 100 * 2 + (unitsConsumed - 100) * 4.5;
            } else if (unitsConsumed <= 500) {
                billAmount = 100 * 2 + 100 * 4.5 + (unitsConsumed - 200) * 6;
            } else {
                billAmount = 100 * 2 + 100 * 4.5 + 300 * 6 + (unitsConsumed - 500) * 7;
            }
        }else {
            System.out.println("Invalid type of EB connection");
            System.exit(0);
        }
        return billAmount;
    }
    public void displayBill() {
        double billAmount = calculateBillAmount();
        System.out.println("Consumer number: " + cousumerNumber);
        System.out.println("Consumer name: " + consumerName);
        System.out.println("Previous month reading: " + prevMonthReading);
        System.out.println("Current month reading: " + currMonthReading);
        System.out.println("Units consumed: " + unitsConsumed);
        System.out.println("Bill amount: Rs. " + billAmount);
    }

    public static void main(String[] args) {
        Assignment1 bill = new Assignment1();
        bill.readInput();
        bill.displayBill();
    }
}
