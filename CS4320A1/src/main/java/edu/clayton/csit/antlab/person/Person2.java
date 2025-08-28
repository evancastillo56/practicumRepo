package edu.clayton.csit.antlab.person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *  A simple class for person 2
 *  returns their name and a
 *  modified string 
 *
 * @author Justin Thom
 * @version 1.1
 */
public class Person2 {
    /** Holds the person's real name */
    private String name;

    /**
     * The constructor, takes in the person's
     * name
     * @param pname the person's real name
     */
    public Person2(String pname) {
        name = pname;
    }

    /**
     * This method should take the string
     * input and return its characters in
     * random order.
     * given "gtg123b" it should return
     * something like "g3tb1g2".
     *
     * @param input the string to be modified
     * @return the modified string
     */
    private String calc(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }
        // Convert string to a list of characters
        List<Character> chars = new ArrayList<>();
        for (char c : input.toCharArray()) {
            chars.add(c);
        }
        // Shuffle characters
        Collections.shuffle(chars);
        // Rebuild the string
        StringBuilder result = new StringBuilder();
        for (char c : chars) {
            result.append(c);
        }
        return result.toString();
    }

    /**
     * Return a string rep of this object
     * that varies with an input string
     *
     * @param input the varying string
     * @return the string representing the 
     *         object
     */
    public String toString(String input) {
        return name + calc(input);
    }
}