public class FibonacciSeries {

    public static void main(String[] args) {

        int n1=0,n2=1,n3,i,count=10; //all the variables assigned as integer

        //for loop used to print numbers in fibonacci series
        for (i = 0; i < count; i++) {

            n3 = n1+n2;
            System.out.print(" "+n3);
            n1 = n2;
            n2 = n3;

        }

    }
}
