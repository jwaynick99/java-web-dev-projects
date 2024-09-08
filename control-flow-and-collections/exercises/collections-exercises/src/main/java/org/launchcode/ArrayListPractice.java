package org.launchcode;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {
    public static int sumEven(ArrayList<Integer> arr){
        int sum = 0;

        for (int num : arr){
            if (num % 2 == 0){
                sum += num;
            }
        }
        return sum;
    }
    public static void wordWith(ArrayList<String> arr){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter desired word length:");
        int numChars = input.nextInt();

        for (String word : arr){
            if (word.length() == numChars){
                System.out.println(word);
            }
        }

    }
}
