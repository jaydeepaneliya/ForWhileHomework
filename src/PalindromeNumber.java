import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String args[]) {
        int r, sum = 0, temp; //variables assigned and initialised
        System.out.println("Enter any number to check palindrome number: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        temp = n;

        while (n > 0) {
            r = n % 10;  //getting remainder
            sum = (sum * 10) + r;
            n = n / 10;
        }
        //if condition satisfied then it's palindrome, otherwise it is not
        if (temp == sum)
            System.out.println("The given number is palindrome number.");
        else
            System.out.println("The given number is not palindrome number");
    }
}

