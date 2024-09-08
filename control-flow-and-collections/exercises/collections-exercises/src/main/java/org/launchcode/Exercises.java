package org.launchcode;

import java.util.ArrayList;

public class Exercises {
    public static void main(String[] args){
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(6);
        nums.add(7);
        nums.add(8);
        nums.add(9);
        nums.add(10);

        System.out.println(ArrayListPractice.sumEven(nums));

        ArrayList<String> words = new ArrayList<>();
        words.add("If");
        words.add("And");
        words.add("What");
        words.add("Where");
        words.add("Caught");
        words.add("Trigger");
        words.add("Severity");
        words.add("Worldwide");
        words.add("Requisite");

        ArrayListPractice.wordWith(words);
    }
}
