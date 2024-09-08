package org.launchcode;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args){
        int[] integerArray = {1, 1, 2, 3, 5, 8};

        String str = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";

        for (int num : integerArray){
            if (num % 2 != 0){
                System.out.println(num);
            }
        }

        String[] splitStr = str.split("\\.");
        System.out.println(Arrays.toString(splitStr));
    }
}
