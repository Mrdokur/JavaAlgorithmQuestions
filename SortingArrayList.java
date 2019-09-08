package algorithms;

import java.util.ArrayList;
import java.util.List;

public class SortingArrayList {


    public static void main(String[] args) {


        List<Integer> a = new ArrayList<Integer>();
        a.add(2);
        a.add(5);
        a.add(4);
        a.add(6);
        a.add(8);
        a.add(3);
        a.add(1);
        a.add(9);
        a.add(7);

        System.out.println("Elements before sorting: ");
        System.out.println(a);

        for (int i = 1; i < a.size(); i++) {
            for (int j = i; j > 0; j--) {
                if (a.get(j-1) > a.get(j)) {
                    int temp = a.get(j);
                    a.set(j, a.get(j-1));
                    a.set(j-1 , temp);
                }
            }
        }

        System.out.println("Elements After sorting (in Ascending order): ");
        System.out.println(a);



    }


}
