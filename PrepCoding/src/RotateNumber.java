import java.util.Scanner;

class RotateNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        double number = sc.nextDouble();
        int no_digits = 0;
        double temporary = number;
        while (temporary > 0) {
            no_digits++;
            temporary /= 10;
        }
        System.out.println("Enter rotation");
        int rotation = sc.nextInt();
        double remainder;
        if (rotation > 0) {
            remainder = number % (Math.pow(10, rotation));
            number /= Math.pow(10, rotation);
            remainder *= Math.pow(10, no_digits - rotation);
            number += remainder;
        }
        System.out.println(number);
    }
}
