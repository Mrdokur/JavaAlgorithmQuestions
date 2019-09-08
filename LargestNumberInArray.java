package algorithms;

public class LargestNumberInArray {

    public static void main(String[] args) {

        int[] arr = {3, 45, 67, 32, 66};


        System.out.println(largest(arr));



    }

    public static int largest(int[] a){

        int largest = a[0];
       // int temp = 0;

        for(int i = 1; i < a.length; i++){
            if(a[i] > largest){
                largest = a[i];
            }

        }

        return largest;
    }


}
