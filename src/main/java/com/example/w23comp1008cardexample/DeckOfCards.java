package com.example.w23comp1008cardexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DeckOfCards {
    private ArrayList<Card> deck;

    /**
     * This is the constructor, it is a special type of "method" that does not have a return type and must be named
     * identically to the class name.  When this is called, the system will allocate space in memory for a new
     * DeckOfCards object
     */
    public DeckOfCards()
    {
        deck = new ArrayList<>();
        List<String> suits =  Card.getListOfValidSuits();
        List<String> faceNames = Card.getValidFaceNames();

        for (int i=0; i<suits.size(); i++)
        {
            for (int j=0; j<faceNames.size() ; j++)
                deck.add(new Card(suits.get(i),faceNames.get(j)));
        }
    }

    /**
     * This method will shuffle the deck of cards
     */
    public void shuffle()
    {
        Collections.shuffle(deck);
    }

    /**
     * This method returns the top Card from the deck
     */
    public Card dealTopCard()
    {
        if (deck.size()>0)
            return deck.remove(0);
        return null;
    }

    /**
     * Returns the number of cards left in the deck
     */
    public int getNumOfCards()
    {
        return deck.size();
    }
}
