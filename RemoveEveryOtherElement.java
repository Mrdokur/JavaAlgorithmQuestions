package com.dkr.generalJava;

import java.util.ArrayList;

public class RemoveEveryOtherElement {


    public static void main(String[] args) {


        // this method will remove every other item in a given array list
        // then return the remaining items as a string



        ArrayList<String> list = new ArrayList<String>();

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");

        System.out.println(removeElements(list));

    }


    public static String removeElements(ArrayList<String> list) {

        // lets create a copy of the array list first

        ArrayList<String> copyOfList = new ArrayList<String>();

        for (int i = 0; i < list.size(); i++) {
            copyOfList.add(list.get(i));
        }

        String returned = "";

        for (int i = 0; i <list.size(); i += 2) {
            returned += copyOfList.get(i);
        }

        return returned;
    }


}
