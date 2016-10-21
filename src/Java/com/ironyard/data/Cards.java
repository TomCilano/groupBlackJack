package com.ironyard.data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tom on 10/20/16.
 */
public class Cards {
    public enum SUIT {
        HEARTS,
        SPADES,
        DIAMONDS,
        CLUBS
    }

    private int value;
    private String name;
    private Player owner;
    private SUIT suit;

    public Cards(int value, String name, Player owner, SUIT suit){
        this.value = value;
        this.name = name;
        this.owner = owner;
        this.suit = suit;
    }

    public static List<Cards> createDeck() {
        List<Cards> deck = new ArrayList<Cards>();
        for (SUIT aSuit : SUIT.values()) {
            // cards 2 - 10
            for (int i = 2; i <= 10; i++) {
                String aCardName = String.format("%s of %s", i, aSuit);
                deck.add(new Cards(i, aCardName, null, aSuit));
            }
            //card faces
            deck.add(new Cards(11, String.format("Ace of %s", aSuit), null, aSuit));
            deck.add(new Cards(10, String.format("King of %s", aSuit), null, aSuit));
            deck.add(new Cards(10, String.format("Queen of %s", aSuit), null, aSuit));
            deck.add(new Cards(10, String.format("Jack of %s", aSuit), null, aSuit));
            deck.add(new Cards(10, String.format("10 of %s", aSuit), null, aSuit));
            deck.add(new Cards(9, String.format("9 of %s", aSuit), null, aSuit));
            deck.add(new Cards(8, String.format("8 of %s", aSuit), null, aSuit));
            deck.add(new Cards(7, String.format("7 of %s", aSuit), null, aSuit));
            deck.add(new Cards(6, String.format("6 of %s", aSuit), null, aSuit));
            deck.add(new Cards(5, String.format("5 of %s", aSuit), null, aSuit));
            deck.add(new Cards(4, String.format("4 of %s", aSuit), null, aSuit));
            deck.add(new Cards(3, String.format("3 of %s", aSuit), null, aSuit));
            deck.add(new Cards(2, String.format("2 of %s", aSuit), null, aSuit));
        }
        return deck;
    }

    //getters and setters

    public int getValue() {return value;}
    public void setValue(int value) {this.value = value;}

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public Player getOwner() {return owner;}
    public void setOwner(Player owner) {this.owner = owner;}

    public SUIT getSuit() {return suit;}
    public void setSuit(SUIT suit) {this.suit = suit;}
}


