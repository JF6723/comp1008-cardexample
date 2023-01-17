package com.example.w23comp1008cardexample;

import java.util.Arrays;
import java.util.List;

public class Card {
    //these are the instance variables
    //we make them private so the Card class controls how they are updated/set
    private String suit;
    private String faceName;

    /**
     * This is the constructor.  When it is called, it creates space in system memory to hold a Card object
     */
    public Card(String suitArgument, String faceName) {
        setSuit(suitArgument);
        setFaceName(faceName);
    }

    /**
     * This method returns a list of String objects that represent the valid
     * suits for a Card in lower case
     * @return "hearts","spades","diamonds","clubs"
     */
    public static List<String> getListOfValidSuits()
    {
        return Arrays.asList("hearts","spades","diamonds","clubs");
    }

    public void setSuit(String suitArgument) {
        suitArgument = suitArgument.toLowerCase();

        if (getListOfValidSuits().contains(suitArgument))
            this.suit = suitArgument;
        else
            throw new IllegalArgumentException(suitArgument + " received, but must be from " +
                    "the list " + getListOfValidSuits());
    }

    public static List<String> getValidFaceNames()
    {
        return Arrays.asList("2","3","4","5","6","7","8","9","10","jack","queen","king","ace");
    }

    /**
     * This method will validate that the argument is a valid face name for a Card
     * @param faceName "2","3","4"..."9","10","jack","queen","king","ace"
     */
    public void setFaceName(String faceName) {
        faceName = faceName.toLowerCase();

        if (getValidFaceNames().contains(faceName))
            this.faceName = faceName;
        else
            throw new IllegalArgumentException(faceName +" received, but not in list "+
                    getValidFaceNames());
    }

    /**
     * This will overwrite the Object class toString() method
     */
    @Override
    public String toString()
    {
        return faceName + " of " + suit;
    }

    /**
     * This method evaluates and returns the value of the card
     * index        0   1   2   3   4   5   6   7    8    9      10      11     12
     * faceName -> "2","3","4","5","6","7","8","9","10","jack","queen","king","ace"
     * value    ->  2   3   4   5   6   7   8   9   10     11    12     13     14
     */
    public int getFaceValue()
    {
        List<String> faceNames = getValidFaceNames();
        int indexOfFaceName = faceNames.indexOf(faceName);
        return indexOfFaceName+2;
    }

    public String getColour()
    {
        if (suit.equals("hearts") || suit.equals("diamonds"))
            return "red";
        else
            return "black";
    }

    public String getSuit() {
        return suit;
    }

    public String getFaceName() {
        return faceName;
    }
}
