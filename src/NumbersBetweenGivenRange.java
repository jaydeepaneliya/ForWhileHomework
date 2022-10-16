import java.util.Scanner;

public class NumbersBetweenGivenRange {

    public static void main(String[] args) {
        //Scanner used so that user can input data according to the need
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter starting number of range: ");
        int a = scanner.nextInt();
        System.out.println("Enter ending number of range: ");
        int b = scanner.nextInt();

        //to print numbers in given range, I have used for loop
        for (int i = a; i <= b; i++) {
            System.out.println(i);

        }
    }
}
