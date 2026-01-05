import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        double balance = 5000.0; // Starting balance
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter withdrawal amount: ");
        int amount = sc.nextInt();

        if (amount % 100 != 0) {
            System.out.println("Error: Please enter an amount in multiples of 100.");
        } else if (amount > balance) {
            System.out.println("Error: Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful! New balance: ₹" + balance);
        }
    }
}