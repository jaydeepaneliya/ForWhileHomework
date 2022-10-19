import java.util.Scanner;

public class SumOfFiveDigitOfTheGivenNumber {

    public static void main(String[] args) {
        //To enter any 5-digit number scanner is used
        System.out.println("Enter any 5-digit number: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b; //variable assigned

        //to make sure that only 5-digit number is allowed by using logical or
        if (a <= 9999 || a >= 99999){
            System.out.println("Entered number is not a valid number!!!");
        }else {
            for(b = 0; a != 0; a = a/10){
                b = b + a%10; //Doing the sum of the remainder to get the sum of each digit
            }
            //printing the sum of the digits of the number
            System.out.println("Sum of digits of the given number is: "+ b);

        }
    }
}
