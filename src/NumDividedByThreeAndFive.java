public class NumDividedByThreeAndFive {
    public static void main(String[] args) {

        //To keep it clear I have given heading and hence printed this statement first
        System.out.println(" Numbers divided by 3: ");

        //for loop used for numbers divided by 3
        for (int i = 1; i <= 100; i++) {
            if (i%3==0){
                System.out.print(i + ", ");
            }

        }
        //Heading for numbers divided by 5
        System.out.println("\n \n Numbers divided by 5: ");
        //for loop used for numbers divided by 5
        for (int i = 1; i <= 100; i++) {
            if (i%5==0) {
                System.out.print(i + ", ");
            }
        }
    }
}
