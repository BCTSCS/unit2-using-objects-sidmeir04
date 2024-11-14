import java.awt.Color;

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WordGames here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WordGames extends Actor
{
    /**
     * Act - do whatever the WordGames wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    private GreenfootImage img;
    private String word;

    // Constructor
    public WordGames(String text) {
        this.word = text;
        this.img = new GreenfootImage("text"); // Initialize image with text
        setImage(img); // Set the image for the actor
    }

    // Act method (moves the text, you can implement movement logic)
    public void act()
    {
        // Add your action code here.
        scramble();
        Greenfoot.delay(100);
        int index=Greenfoot.getRandomNumber(word.length());
        bananaSplit(index, "Hello");
        Greenfoot.delay(100);
       
        bananaSplit("e", "World");
        Greenfoot.delay(100);
    }
    // Scrambles the word
    public String scramble() {
        char[] characters = word.toCharArray();
        for (int i = 0; i < characters.length; i++) {
            int randomIndex = (int) (Math.random() * characters.length);
            char temp = characters[i];
            characters[i] = characters[randomIndex];
            characters[randomIndex] = temp;
        }
        return new String(characters);
    }

    // bananaSplit method (insert by index)
    public String bananaSplit(int insertIdx, String insertText) {
        String firstPart = word.substring(0, insertIdx);
        String secondPart = word.substring(insertIdx);
        return firstPart + insertText + secondPart;
    }

    // bananaSplit method (insert by character)
    public String bananaSplit(String insertChar, String insertText) {
        int idx = word.indexOf(insertChar);
        if (idx == -1) {
            return word; // Character not found
        }
        return bananaSplit(idx, insertText);
    }

    // toString method (returns Games[word])
    @Override
    public String toString() {
        return "Games[" + word + "]";
    }
}
