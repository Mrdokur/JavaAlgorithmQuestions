package algorithms;

import java.util.*;

public class FindDuplicateCharsInString {

    public static void main(String[] args) {
        String word = "ad echet, ecmmbb";

        returnDuplicates(word);

    }

    public static void returnDuplicates(String s){

        Map<String, Integer> map = new HashMap<String, Integer>();

        String character = "";
        s = s.replaceAll(" ", "");
        s = s.replaceAll(",", "");

        for (int i = 0; i < s.length(); i++) {

            String current = Character.toString(s.charAt(i));

            if(map.get(current) == null) {
                map.put(current, 1);
            }else{
                map.put(current, map.get(current) + 1);

            }

        }

        for (Map.Entry entry: map.entrySet()) {
            if((Integer) entry.getValue() > 1){

                System.out.println(entry.getKey()+ ": " + entry.getValue());
            }

        }



    }


}
