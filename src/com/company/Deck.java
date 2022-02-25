package com.company;
import java.util.Random;

public class Deck {
    public String newDeck[];


    Deck(){
        newDeck = new String[]{"A-H", "A-C", "A-S", "A-D", "2-H", "2-C", "2-S", "2-D", "3-H", "3-C", "3-S", "3-D", "4-H", "4-C", "4-S", "4-D", "5-H", "5-C", "5-S", "5-D", "6-H", "6-C", "6-S", "6-D", "7-H", "7-C", "7-S", "7-D", "8-H", "8-C", "8-S", "8-D", "9-H", "9-C", "9-S", "9-D", "10-H", "10-C", "10-S", "10-D", "J-H", "J-C", "J-S", "J-D", "Q-H", "Q-C", "Q-S", "Q-D", "K-H", "K-C", "K-S", "K-D"};
    }
    public void shuffle(){
        Random index = new Random();

        for (int i = 0; i < 52; i++){
            int swapIndex = index.nextInt(52);
            String temp = newDeck[swapIndex];
            newDeck[swapIndex] = newDeck[i];
            newDeck[i] = temp;
        }

    }

    public String draw(int cardIndex){
        return newDeck[cardIndex];
    }
    public String[] getNewDeck(){
        return newDeck;
    }
}
