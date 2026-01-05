import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Basic Salary: ");
        double basic = sc.nextDouble();

        double hra = 0.20 * basic;
        double da = 0.10 * basic;
        double totalSalary = basic + hra + da;
        double tax = 0.05 * totalSalary;
        double netSalary = totalSalary - tax;

        System.out.println("HRA: ₹" + hra);
        System.out.println("DA: ₹" + da);
        System.out.println("Tax: ₹" + tax);
        System.out.println("Net Salary: ₹" + netSalary);
    }
}