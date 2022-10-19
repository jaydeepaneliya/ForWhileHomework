import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {

        System.out.println("Enter the number of which you want the sum of: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = 0;

        //for loop created to get the sum of given numbers
        for (int i = 0; i <= n ; i++) {

            m+=i; //m = m + i

        }
        System.out.println("Sum of " + n + " natural numbers is = " + m);
    }
}
