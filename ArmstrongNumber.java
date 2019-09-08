package algorithms;

import java.util.*;

public class ArmstrongNumber {


    // armstrong number
    public static void main(String[] args) {

        System.out.println(ifarms(153));

    }


    public static boolean ifarms(int num){

        int temp = num;
        int a = 0, sum = 0;

        // 153 is an Armstrong number.
        // 1*1*1 + 5*5*5 + 3*3*3 = 153


        while(temp > 0){
            a = temp % 10;
            sum += (a*a*a);
            temp = temp/10;

        }

        if(num == sum){
            System.out.println("Num: " + num + "\nSum: " + sum);
            return true;
        }else{
            return false;
        }

    }



}
