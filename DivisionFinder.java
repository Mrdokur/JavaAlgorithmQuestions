package algorithms;

public class DivisionFinder {


    public static void main(String[] args) {


    }


    public static String division(int divident, int divisor) { int quotient = 0;
        int remainder = 0;

        while(divident >= divisor) {

            divident = divident - divisor; quotient++;
            remainder = divident;

        }


        return "quotient = " + quotient + " remainder = " + remainder;


    }




}
