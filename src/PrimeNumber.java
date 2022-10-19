import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int i, m, flag = 0; // flag variable initialised as a signal to let the program
                            // know if certain condition meets or not
        Scanner scanner= new Scanner(System.in); //Scanner used for the user flexibility to check any number
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();

        m=n/2;

        if (n==0 || n==1){ //0 and 1 are not a prime number so here I used Logical Or
            System.out.println(n + " is NOT a prime number");
        }
        else {
            for (i = 2; i <=m ; i++) {
                if (n%i==0){
                    System.out.println(n + " is NOT a prime number");
                    flag=1;
                    break;
                }

            }
            if(flag==0) {
                System.out.println(n + " is a prime number");
            }
        }

    }
}
