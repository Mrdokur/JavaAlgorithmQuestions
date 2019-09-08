package com.dkr.generalJava;

import java.util.ArrayList;

public class arraysSumSingleDigit {


    public static void main(String[] args) {

        /*
         this algorithm adds up the values in two arrays and
         store the values in a new array. if any value is greater than 10,
         it will separate the digits as single items.
        */

        int[] arr1 = {9, 7, 7};
        int[] arr2 = {6, 7, 9};

        arraysSumSingleDigit(arr1, arr2);

    }


    // here is the method

    public static void arraysSumSingleDigit(int[] a, int[] b){

        int[] arr  = new int[a.length];

        for (int i = a.length - 1; i >= 0; i--) {

            int item = a[i] + b[i];

            arr[i] = item;

        }

        // create an array list
        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Original sum up array: ");

        // converting array to array list to make it single digits
        for (int i = 0; i <arr.length; i++) {

            if (arr[i] >= 10){

                list.add(arr[i] / 10);
                list.add(arr[i] % 10);

            }else{
                list.add(arr[i]);
            }

            // printing the new array

            System.out.print(arr[i] + " ");

        }

        System.out.println(" ");
        System.out.print("Numbers as single digits: ");

        Object[] ab = list.toArray();

        for (int i = 0; i <list.size() ; i++) {
            System.out.print(ab[i] + " ");
        }


    }

}
