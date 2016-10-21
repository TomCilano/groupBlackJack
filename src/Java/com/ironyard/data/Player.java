package com.ironyard.data;

import java.util.List;

/**
 * Created by Tom on 10/20/16.
 */
public class Player {

    public String name;
    public int hand;
    public List <Card> cards;


    public Player(String name, int hand, List<Card> cards) {
        this.name = name;
        this.hand = hand;
        this.cards = cards;
    }

    // player takes a hit



    public static void playerHit (Card c){



    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHand() {
        return hand;
    }

    public void setHand(int hand) {
        this.hand = hand;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }
}
