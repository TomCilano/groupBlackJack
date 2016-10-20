package com.ironyard.data;

import java.util.List;

/**
 * Created by Tom on 10/20/16.
 */
public class Player {

    public String name;
    public List <Cards> cards;

    public Player(String name, List<Cards> cards) {
        this.name = name;
        this.cards = cards;

    }

    //player hit

    //player stay

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Cards> getCards() {
        return cards;
    }

    public void setCards(List<Cards> cards) {
        this.cards = cards;
    }
}
