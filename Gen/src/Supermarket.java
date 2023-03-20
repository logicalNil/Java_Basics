import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class Supermarket{
    private static final double DISCOUNT_PERCENTAGE = 0.2;
    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    private static String customerName;
    private static String product1Name;
    private static int product1Quantity;
    private static double product1Price;
    private static String product2Name;
    private static int product2Quantity;
    private static double product2Price;
    private static String product3Name;
    private static int product3Quantity;
    private static double product3Price;
    private static LocalDate product3ExpirationDate;
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get customer name
        System.out.print("Enter customer name: ");
        customerName = scanner.nextLine();

        // Get product-1 details
        System.out.print("Enter product-1 name: ");
        product1Name = scanner.nextLine();
        System.out.print("Enter product-1 quantity: ");
        product1Quantity = scanner.nextInt();
        System.out.print("Enter product-1 price: ");
        product1Price = scanner.nextDouble();
        scanner.nextLine(); 

        // Get product-2 details
        System.out.print("Enter product-2 name: ");
        product2Name = scanner.nextLine();
        System.out.print("Enter product-2 quantity: ");
        product2Quantity = scanner.nextInt();
        System.out.print("Enter product-2 price: ");
        product2Price = scanner.nextDouble();
        scanner.nextLine();

        // Get product-3 details
        System.out.print("Enter product-3 name: ");
        product3Name = scanner.nextLine();
        System.out.print("Enter product-3 quantity: ");
        product3Quantity = scanner.nextInt();
        System.out.print("Enter product-3 price: ");
        product3Price = scanner.nextDouble();
        scanner.nextLine(); 
        System.out.print("Enter expiration date (yyyy-MM-dd): ");
        product3ExpirationDate = LocalDate.parse(scanner.nextLine(), DATE_FORMATTER);

        // Compute bill amount and discount
        double totalBillAmount = (product1Quantity * product1Price) + (product2Quantity * product2Price) + (product3Quantity * product3Price);
        double discount = 0;
        if (LocalDate.now().isAfter(product3ExpirationDate.plusDays(2))) {
            discount = totalBillAmount * DISCOUNT_PERCENTAGE;
            System.out.println(product3Name + " is expired! Applying discount of " + (DISCOUNT_PERCENTAGE * 100) + "%");
        }
        double finalBillAmount = totalBillAmount - discount;

        // Display supermarket bill
        System.out.println("\nSupermarket Bill for " + customerName + ":");
        System.out.println("Product\t\tQuantity\tPrice");
        System.out.println(product1Name + "\t\t" + product1Quantity + "\t\t" + product1Price);
        System.out.println(product2Name + "\t\t" + product2Quantity + "\t\t" + product2Price);
        System.out.println(product3Name + "\t\t" + product3Quantity + "\t\t" + product3Price);
        System.out.println("\nTotal Bill Amount: " + totalBillAmount);
        if (discount > 0) {
            System.out.println("Discount: " + discount);
        }
        System.out.println("Final Bill Amount: " + finalBillAmount);
    }
}