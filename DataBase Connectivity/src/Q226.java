import java.util.Scanner;

public class Q226 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;
        do {
            System.out.println("Enter your choice:");
            System.out.println("1. Dollar to Rupee");
            System.out.println("2. Rupee to Euro");
            System.out.println("3. Rupee to Yen");
            System.out.println("4. Meter to Kilometer");
            System.out.println("5. Kilometer to Meter");
            System.out.println("6. Hours to Minutes");
            System.out.println("7. Hours to Seconds");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter dollar amount:");
                    double dollar = sc.nextDouble();
                    double inr = CurrencyConversion.dollarToRupee(dollar);
                    System.out.println("Dollar " + dollar + " is equal to INR " + inr);
                    break;

                case 2:
                    System.out.println("Enter rupee amount:");
                    double rupee = sc.nextDouble();
                    double euro = CurrencyConversion.rupeeToEuro(rupee);
                    System.out.println("Rupee " + rupee + " is equal to Euro " + euro);
                    break;

                case 3:
                    System.out.println("Enter rupee amount:");
                    double rup = sc.nextDouble();
                    double yen = CurrencyConversion.rupeeToYen(rup);
                    System.out.println("Rupee " + rup + " is equal to Yen " + yen);
                    break;

                case 4:
                    System.out.println("Enter meter value:");
                    double meter = sc.nextDouble();
                    double km = DistanceConversion.meterToKilometer(meter);
                    System.out.println(meter + " meter is equal to " + km + " kilometer");
                    break;

                case 5:
                    System.out.println("Enter kilometer value:");
                    double kilm = sc.nextDouble();
                    double meters = DistanceConversion.kilometerToMeter(kilm);
                    System.out.println(kilm + " kilometer is equal to " + meters + " meter");
                    break;

                case 6:
                    System.out.println("Enter hours value:");
                    double hours = sc.nextDouble();
                    double minutes = TimeConversion.hoursToMinutes(hours);
                    System.out.println(hours + " hours is equal to " + minutes + " minutes");
                    break;

                case 7:
                    System.out.println("Enter hours value:");
                    double hrs = sc.nextDouble();
                    double seconds = TimeConversion.hoursToSeconds(hrs);
                    System.out.println(hrs + " hours is equal to " + seconds + " seconds");
                    break;

                default:
                    System.out.println("Invalid choice");
                    break;

            }
        } while (choice != 0);
    }
}