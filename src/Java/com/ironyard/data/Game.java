package com.ironyard.data;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import static java.util.Collections.shuffle;

/**
 * Created by Tom on 10/20/16.
 */
public class Game {

    private Player player;
    private List<Card> cards;

    public static void main(String[] args) {
    getOneCard();
    }

    //player gets two cards
    public static void getOneCard() {
        List<Card> a = Card.createDeck();
        Card oneCard = a.remove(0);
        int value = oneCard.getValue();
        int hand = value;


        System.out.println(value);

    }
    public void shuffle(List<Card> shuffleThis){
        Collections.shuffle(shuffleThis);
    }

}