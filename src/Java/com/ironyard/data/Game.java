package com.ironyard.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Tom on 10/20/16.
 */
public class Game {
    private List<Player> players;
    private List<Cards> cardsInPlay;
    private List<Cards> startingDeck;
    int turns = 0;

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public List<Cards> getCardsInPlay() {
        return cardsInPlay;
    }

    public void setCardsInPlay(List<Cards> cardsInPlay) {
        this.cardsInPlay = cardsInPlay;
    }

    public List<Cards> getStartingDeck() {
        return startingDeck;
    }

    public void setStartingDeck(List<Cards> startingDeck) {
        this.startingDeck = startingDeck;
    }

    public int getTurns() {
        return turns;
    }

    public void setTurns(int turns) {
        this.turns = turns;
    }

    public static void main(String[] args) {
        Game g = new Game();
        g.initGame(4);
        g.dealOutAllCards();
        Player winner = g.startGame();

        System.out.printf("\n\n%s is the Winner! In %s turns\n", winner.getName(), g.turns);
    }

    // game starts
    public Player startGame(){
        Player winner = null;
        while(winner == null){
            playRound();
            winner = getWinner();
        }
        return winner;
    }

    public void playRound(){
        // each player puts down top card
        for(Player p:players){
            cardsInPlay.add(p.playCard());
        }
        turns++;

        // see who won
        Cards highest = null;
        for(Cards c:cardsInPlay){
            if(highest == null){
                highest = c;
            }else if(highest.getValue() < c.getValue()){
                highest = c;
            }
        }

        // winner gets all played cards
        highest.getOwner().acceptWonCards(cardsInPlay);
        cardsInPlay.clear();

    }

    // Deal cards{
    public void dealOutAllCards(){
        // go through staringDeck
        int playerTurn = 0;
        for(Cards c: startingDeck) {
            // give each player 1 card (repeat)
            int pos = playerTurn % players.size();
            players.get(pos).acceptCardForPlay(c);
            playerTurn++;
        }

    }
    //----->deck shuffles
    public static void shuffle(List<Cards> shuffleMePlease){
        // pick random number
        Collections.shuffle(shuffleMePlease);
    }

    public void initGame(int numberOfPlayers){
        // set all lists to new empty lists
        turns = 0;
        players = new ArrayList<players>();
        cardsInPlay = new ArrayList<cardsInPlay>();
        startingDeck = new ArrayList<startingDeck>();

        // create x players add to list of players
        for(int i=0; i<numberOfPlayers; i++){
            players.add(new Player("Player #"+i));
        }

        // init deck of cards
        startingDeck = Cards.createDeck();

        // shuffle deck of cards
        shuffle(startingDeck);

    }

    // ---->player gets two cards
    // ---->dealer gets one}
    //
    //  Player Turn
    //----->player can hit or stay
    //----->if player hits he is dealt one card
    //----->if player goes over 21 the game is over.
    //----->if he stays dealers turn
    //
    //Dealer Turn
    //----->dealer draws cards until >= 17
    //----->evaluate the scores, closest to 21 but not over wins. If tie dealer wins

    //play again





}

