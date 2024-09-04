package org.launchcode;

import java.util.Scanner;

public class AliceAdventurs {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String aliceString = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having " +
                "nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures" +
                " or conversations in it, ‘and what is the use of a book,’ thought Alice ‘without pictures or conversation?’";

        System.out.println("What word would you like to check: ");
        String word = input.next();

        Boolean strContains = aliceString.toLowerCase().contains(word.toLowerCase());
        System.out.println(strContains);

        if (strContains){
            System.out.println("Index of word in string: " + aliceString.toLowerCase().indexOf(word.toLowerCase()));
            System.out.println("Word length: " + word.length());

            String replacedStr = aliceString.toLowerCase().replace(word.toLowerCase(), "");
            System.out.println(replacedStr);
        }
    }
}
