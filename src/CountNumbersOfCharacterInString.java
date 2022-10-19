import java.util.Scanner;

public class CountNumbersOfCharacterInString {
    public static void main(String[] args) {

        System.out.println("Enter string here to count 'a' in it: ");
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();

        char search = 'a'; //Character to search 'a'

        int count = 0;

        for (int i = 0; i < a.length(); i++) {

            if(a.charAt(i) == search) //
            count++;

        }

        System.out.println("The character '"+search+"' appears in this string " + count + " times.");

    }
}
