package org.launchcode;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> songs = new ArrayList<>();
        songs.add("Katy Perry - Firework");
        songs.add("Backstreet Boys - Everybody");
        songs.add("Katy Perry - Hot and Cold");
        songs.add("SpongeBob - Campfire Song Song");
        // TODO: Declare and initialize a CD and a DVD object.
        CD studioCD = new CD(650, 500, "Playlist", songs, "CD");
        // TODO: Call each CD and DVD method to verify that they work as expected.
        studioCD.spinDisc();
        studioCD.dataSize();
        studioCD.readData();
        studioCD.writeToDisc("Katy Perry - Roar");
        studioCD.writeToDisc("Phil Collins - You Can't Hurry Love");
        studioCD.readData();
        System.out.println(studioCD.report() + "\n\n\n");

        DVD dieHard = new DVD(5, 9280, "Die Hard", "DVD", "The entirety of the movie starring Bruce Willis Die Hard");
        dieHard.spinDisc();
        dieHard.dataSize();
        dieHard.readData();
        System.out.println(dieHard.report());
        dieHard.writeToDisc("The entirety of the movie starring Tom Hanks and Meg Ryan; You've Got Mail");
        dieHard.readData();
    }
}