package question3;

import java.util.Scanner;

/**
 * PalindromeCheck @author Justin Kord 
 * Student number 0360764 
 * This class checks a String to see if it is printed the same backwards as forwards.
 * It uses the LinkedQueue and ArrayStack methods to store the string items.
 */

public class PalindromeCheck {

	// public static void main(String[] args) {
	public static String PalindromeCheck(String text) {

		/**
		 * Defining an ArrayStack and ArrayQueue
		 */

		LinkedQueue queue;

		ArrayStack stack;

		queue = new LinkedQueue();

		stack = new ArrayStack(text.length());

		/**
		 * looping through all characters
		 */

		for (int i = 0; i < text.length(); i++) {

			// getting the char at current position

			char c = text.charAt(i);

			// checking if it is an alphabet

			if (Character.isLetter(c)) {

				/**
				 * Adding to the queue and stack
				 */

				queue.enqueue(c);

				stack.push(c);

			}

		}

		/**
		 * characters are added to the stack and queue, now it is time to check if its
		 * palindrome or not. At this point,we assume that the text is palindrome
		 */

		boolean palindrome = true;

		/**
		 * loops until the stack/queue is empty, we can use any of them as both of them
		 * will have the same size
		 */

		while (!stack.isEmpty()) {

			/**
			 * popping the stack and dequeuing the queue
			 */

			Character c1 = (Character) stack.pop();

			Character c2 = (Character) queue.dequeue();

			/**
			 * comparing the two characters (case insensitive)
			 */

			if (Character.toLowerCase(c1) != Character.toLowerCase(c2)) {

				/**
				 * mismatch found, the text is not palindrome, updating the variable and
				 * breaking the loop
				 */

				palindrome = false;

				break;

			}

		}

		/**
		 * if the palindrome variable is true after exiting the loop, it means that the
		 * text is palindrome, else not
		 */

		if (palindrome) {

			String dromeOne = "'" + text + "' is a palindrome";
			return dromeOne;

		} else {

			String drometwo = "'" + text + "' is not a palindrome";
			return drometwo;

		}

	}

}