import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter electricity consumption in KWH:");
        int consumption = scanner.nextInt();

        double billAmount = 0;
        double surcharge = 0;

        if (consumption <= 50) {
            billAmount = consumption * 0.10; // 10 cents per unit
        } else if (consumption <= 150) {
            billAmount = 50 * 0.10 + (consumption - 50) * 0.16; // First 50 units at 10 cents, remaining at 16 cents
        } else if (consumption <= 250) {
            billAmount = 50 * 0.10 + 100 * 0.16 + (consumption - 150) * 0.22; // First 50 at 10 cents, next 100 at 16 cents, remaining at 22 cents
        } else {
            billAmount = 50 * 0.10 + 100 * 0.16 + 100 * 0.22 + (consumption - 250) * 0.30; // First 50 at 10 cents, next 100 at 16 cents, next 100 at 22 cents, remaining at 30 cents
        }

        if (consumption <= 250) {
            surcharge = 7; // Surcharge for consumption less than or equal to 250 KWH
        } else {
            surcharge = 12; // Surcharge for consumption greater than 250 KWH
        }

        double totalBill = billAmount + surcharge;

        System.out.println("Total electricity bill: $" + totalBill);
    }
}