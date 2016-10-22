package com.ironyard.data;

import java.util.List;

/**
 * Created by Tom on 10/20/16.
 */
public class Player {

    public String name;
    public List hand;
    public List <Card> cards;

    public Player(String name, List hand, List<Card> cards) {
        this.name = name;
        this.hand = hand;
        this.cards = cards;
    }


    // player takes  gets a hand

    public void playerGetsOneCard(Card c){
        c.getOwner(this);
        cards.add(c);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getHand() {
        return hand;
    }

    public void setHand(List hand) {
        this.hand = hand;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }


