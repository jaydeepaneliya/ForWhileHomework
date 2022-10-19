import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int remainder, reverse = 0; //variable initialised

        System.out.println("Enter any 5 digit number to be reversed: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        //set the limit of '5-digit' number only by using logical or
        if (num <= 9999 || num >= 99999){
            System.out.println("Entered number is not a valid number!!!");
        }else {
            //created for loop to reverse the number
            for (; num != 0; num = num / 10) {
                remainder = num % 10;
                reverse = reverse * 10 + remainder;
            }
            System.out.println("The reverse of the given number is " + reverse);

        }


    }
}
