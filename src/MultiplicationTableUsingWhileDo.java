import java.util.Scanner;

public class MultiplicationTableUsingWhileDo {
    public static void main(String[] args) {
        int a=1; //declaring and initialising variable

        //Do-while loop
        do {
            //printing numbers as required
            System.out.println(a + " " + (a*2) + " " + (a*3));

            //updating variable
            a++;

        //Checking condition
        }while(a<=7);
    }
}
