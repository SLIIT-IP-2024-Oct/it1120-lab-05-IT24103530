import java.util.Scanner;

public class IT24103530Lab5Q3 {
    public static final int ROOM_CHARGE_PER_DAY = 48000;
    public static final int DISCOUNT_3_TO_4_DAYS = 10;
    public static final int DISCOUNT_5_OR_MORE_DAYS = 20;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the start date (1-31): ");
        int startDate = scanner.nextInt();

        System.out.print("Enter the end date (1-31): ");
        int endDate = scanner.nextInt();

        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Start and end dates must be between 1 and 31.");
            return;
        }

        if (startDate >= endDate) {
            System.out.println("Error: Start date must be less than the end date.");
            return;
        }

        int numberOfDays = endDate - startDate;

        int discountRate = 0;
        if (numberOfDays >= 3 && numberOfDays <= 4) {
            discountRate = DISCOUNT_3_TO_4_DAYS;
        } else if (numberOfDays >= 5) {
            discountRate = DISCOUNT_5_OR_MORE_DAYS;
        }

        double totalCharge = numberOfDays * ROOM_CHARGE_PER_DAY;
        double discount = totalCharge * discountRate / 100;
        double totalAmountToPay = totalCharge - discount;

        System.out.println("Room charge per day: Rs 48000/=");
        System.out.println("Number of days reserved: " + numberOfDays);
        System.out.printf("Total amount to be paid: " + totalAmountToPay);
    }
}
