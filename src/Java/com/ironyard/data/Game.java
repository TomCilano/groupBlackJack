package com.ironyard.data;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Tom on 10/20/16.
 */
public class Game {

    public static void main (String[] args){

        List<Card> x = Card.createDeck();

        Card y = x.get(1);

        
        System.out.println(y);
        

        // game starts


        // Deal cards{
        //----->deck shuffles
        // ---->player gets two cards
        // ---->dealer gets one}
        //
        //  Player Turn
        //----->player can hit or stay
        //----->if player hits he is dealt one card
        //----->if player goes over 21 the dealer wins.
        //----->if he stays dealers turn
        //
        //Dealer Turn
        //----->dealer draws cards until >= 17
        //----->evaluate the scores, closest to 21 but not over wins. If tie dealer wins

        //play again



    }
}
