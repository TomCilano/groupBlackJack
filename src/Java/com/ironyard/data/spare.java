package com.ironyard.data;

import java.util.List;
import java.util.Scanner;

import static java.util.Collections.shuffle;

/**
 * Created by Tom on 10/20/16.
 */
public class spare {


    public static void main(String[] args) {

        List<Card> x = Card.createDeck();
        shuffle(x);
        List<Card> a = Card.createDeck();
        shuffle(a);


        Card y = x.get(0);
        Card z = x.get(1);
        int phand = y.getValue() + z.getValue();

        System.out.println("Player's cards are " + y + " and " + z);
        System.out.println("Player's current score is " + phand);


        List<Card> dealerHandRef = a.subList(0, 2);
        Card d = dealerHandRef.get(0);
        Card d2 = dealerHandRef.get(1);
        int hand = d.getValue() + d2.getValue();

        System.out.println("Dealer's cards are " + d + " and one hidden card!");
        System.out.println("Dealer's score is " + d.getValue());


        //hit or stay
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to get hit or stay?");

        String hs = input.nextLine();

        if (hs.equalsIgnoreCase("hit")) {
            System.out.println("let's keep playing");
            Card hitCard = x.get(2);
            int newCard = hitCard.getValue() + phand;
            System.out.println("Player's current score is " + newCard);


            boolean playerWon = false;

            // player has more than dealer AND its less than 21 then player wins
            // if player has less than dealer player loses
            // if player and dealer tie player loses
            if (phand > hand && phand <= 21) {
                playerWon = true;
            } else if (phand < hand && hand <= 21) {
                playerWon = false;
            } else if (phand == hand) {
                playerWon = false;
            }else{

            }

            System.out.println("It's dealers turn");
            //get a new card
            //add the values
            //hit or stay

            //if stay
            //dealers turn
        }
    }
}

