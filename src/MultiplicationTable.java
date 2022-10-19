import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {

        //Number n for which we have to print the multiplication table

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:- ");
        int a = scanner.nextInt();

        for (int i = 1; i <= 10 ; i++) {

        // printing a * i = ai, till 10th number
            System.out.println(a + " * " + i + " = " + a*i);
        }
    }
}