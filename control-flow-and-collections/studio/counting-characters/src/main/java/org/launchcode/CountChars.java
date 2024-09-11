package org.launchcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CountChars {
    public static void main(String[] args){
        String loopString = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with." +
                " So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of" +
                " the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

        char[] charInString = loopString.toLowerCase().toCharArray();

        HashMap<Character, Integer> charCount = new HashMap<>();

        char[] alphabetArr = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        for (char character : charInString) {
            int count = 0;
            for (char singleChar : charInString){
                if (singleChar == character){
                    count++;
                }
            }
            charCount.put(character, count);
        }
        for (Map.Entry<Character, Integer> charPrint : charCount.entrySet()){
            System.out.println(charPrint.getKey() + " : " + charPrint.getValue());
        }
    }
}
