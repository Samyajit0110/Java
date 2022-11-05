import java.util.Scanner;

//class InvalidInputException extends Exception {
//    InvalidInputException(String message) {
//        super(message);
//    }
//}

public class InverseNumber {
    public static void main(String[] args) { //throws InvalidInputException

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to find inverse");
        int number = sc.nextInt();
        int ndigits = 0, temp = number, digit, position = 0;
        while (temp > 0) {
            ndigits++;
            temp /= 10;
        }
        int[] number_array = new int[ndigits];
        while (number > 0) {
            digit = number % 10;
            number /= 10;
            number_array[digit - 1] = position + 1;
            position++;
        }
        for (int i : number_array) {
            System.out.print(i);
        }
    }
}
