import java.util.Scanner;

class ModNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any integer: ");
        int a = sc.nextInt();

        System.out.print("Enter any number for divisor: ");
        int b = sc.nextInt();

        int mod = a % b;
        System.out.println("Remainder = " + mod);
    }
}