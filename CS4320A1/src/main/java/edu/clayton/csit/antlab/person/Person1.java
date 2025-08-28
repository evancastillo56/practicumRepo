package edu.clayton.csit.antlab.person;

/**
 *  A simple class for person 1
 *  returns their name and a
 *  modified string 
 *  
 *  @author Qu
 *  @version 1.1
 */
public class Person1 {
  /** Holds the persons real name */
  private String name;
  	/**
	 * The constructor, takes in the persons
	 * name
	 * @param pname the person's real name
	 */
  public Person1(String pname) {
    name = pname;
  }
  	/**
	 * This method should take the string
	 * input and return its characters rotated
	 * 2 positions.
	 * given "gtg123b" it should return
	 * "g123bgt".
	 *
	 * @param input the string to be modified
	 * @return the modified string
	 */

    private String calc(String input) {
      if (input == null || input.length() < 2) {
        return input;
      }
      StringBuilder result = new StringBuilder();
      for (int i = 2; i < input.length(); i++) {
        result.append(input.charAt(i));
      }
      result.append(input.substring(0, 2));
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
