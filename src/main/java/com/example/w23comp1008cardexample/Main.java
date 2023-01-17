package com.example.w23comp1008cardexample;

public class Main {
    public static void main(String[] args) {
        //create an instance of a Card object
        Card card1 = new Card("Spades","Ace");
        Card card2 = new Card("Hearts","7");

        System.out.println(card1);
        System.out.println(card2);

        //an ace should have a value of 14
        System.out.println("value of ace: " + card1.getFaceValue());

        //a 7 should have a value of 7
        System.out.println("value of 7: " + card2.getFaceValue());

        System.out.printf("%s is: %s%n", card1.toString(), card1.getColour());
        System.out.printf("%s is: %s%n", card2.toString(), card2.getColour());

        DeckOfCards deckOfCards = new DeckOfCards();
        deckOfCards.shuffle();
        System.out.println(deckOfCards.getNumOfCards());
        Card cardFromTopOfDeck = deckOfCards.dealTopCard();
        System.out.println(deckOfCards.getNumOfCards());
        System.out.println(cardFromTopOfDeck);

    }
}
