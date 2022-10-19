import java.util.Scanner;

public class Factorial {


    public static void main(String[] args) {
        System.out.println("Enter any number fo which you want factorial: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = 1;

        //for loop created to get factorial of given number
        for (int i = 1; i <= a ; i++) {
            b*=i; //b = b * i


        }
        System.out.println("Factorial of " + a + " is: " + b);
    }
}
