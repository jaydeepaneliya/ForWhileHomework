import java.util.Scanner;

public class SumOfFirstAndLastDigit {
    public static void main(String[] args) {
        System.out.println("Enter any number here: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();


        int firstDigit = 0;
        int lastDigit = 0;

        // find last digit
        lastDigit = number%10;


        //find first digit
        while(number!=0) {
            firstDigit = number%10;
            number /= 10;
        }

        System.out.println("Sum of the first and the last digit of the number are: " + (firstDigit + lastDigit));
    }
}