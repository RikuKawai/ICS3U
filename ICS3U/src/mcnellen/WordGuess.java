package mcnellen;

import java.util.Arrays;
import java.util.Scanner;

public class WordGuess {
	
	final static String[] allWords = new String[] {"laptop", "keyboard", "monitor", "motherboard", "mouse", "chassis"}; //array of words to pick from
	public static char[] currentWord = new char[] {}; //currently selected word
	public static char[] displayedWord = new char[] {}; //dashes and letters to display to the user
	public static boolean wordGuessed = false;
	public static boolean playing = true;
	public static int guesses;
	final static int maxGuesses = 3; //maximum number of guesses allowed
	
	public static void main(String[] args) {
		// WordGuess.java
		// @author Quinlan McNellen
		// version 1.0.1
		// 2016/05/10
		
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("WordGuess Game");
			guesses = maxGuesses;
			currentWord = selectWord(allWords); //select a word from the array
			displayedWord = getDashes(currentWord); //generate dashes for the word
			
			do { 
				if (guesses > 1) { //print remaining guesses
					System.out.println("You have " + guesses + " guesses left");
				} else if (guesses == 1) {
					System.out.println("You have " + guesses + " guess left"); //format guess singularly if there's only one guess left
				} else if (guesses <= 0) {
					gameOver(); //end the game if the user runs out of guesses
					break;
				}
				System.out.println(displayedWord);
				System.out.print("Enter a letter (! to guess entire word): ");
				String guess = scan.nextLine();
				if (guess.equals("!")) {
					System.out.print("Enter a word: ");
					String wordGuess = scan.nextLine();
					guessWord(wordGuess);
				} else {guessLetter(guess);}
			} while(!wordGuessed);
			
			boolean validInput = false;
			do {
				System.out.println();
				System.out.print("Play again? ");
				String replay = scan.nextLine();
				if (replay.equalsIgnoreCase("n") || replay.equalsIgnoreCase("no")) {
					System.out.println("Thanks for playing!");
					validInput = true;
					playing = false;
				} else if (replay.equalsIgnoreCase("y") || replay.equalsIgnoreCase("yes")) {
					wordGuessed = false;
					validInput = true;
				} else {
					System.out.println("Invalid input");
				}
			} while(!validInput);
			
		} while(playing);
		scan.close();
	}
	public static void guessLetter(String guess) { //check if the guessed letter is correct
		guess = guess.toLowerCase();
		int occurences = 0;
		char letter = guess.charAt(0);
		for (int i=0; i<currentWord.length; i++) { //scan array and check for letter
			if (currentWord[i] == letter) {
				displayedWord[i] = letter; //update displayed word replacing dashes with occurrences of the letter
				occurences++;
			}
		}
		if (occurences == 0) {guesses--;} //check if a letter did not occur and subtract a guess
		if (Arrays.equals(currentWord, displayedWord)) { //check if the entire word has been guessed
			wordComplete();
		}
	}
	public static void guessWord(String guess) { //check if the guessed word is correct
		guess = guess.toLowerCase();
		char[] guessArray = guess.toCharArray();
		if (Arrays.equals(guessArray, currentWord)) {
			wordComplete();
		} else {
			gameOver(); //ends the game if the guess was incorrect
		}
	}
	public static char[] getDashes(char[] word) { //generate dashes matching the length of a word
		int numDashes = word.length;
		char[] dashes = new char[numDashes];
		for (int i = 0; i<numDashes; i++) {
			dashes[i] = '-';
		}
		return dashes;
	}
	public static char[] selectWord(String[] words) { //randomly selects a word from the array
		int max = (words.length) - 1;
		String word = allWords[random(0, max)];
		char[] wordChars = new char[word.length()];
		for (int i=0; i<word.length(); i++) {
			wordChars[i] = word.charAt(i);
		}
		return wordChars; //return selected word
	}
	public static void gameOver() { //stops asking for guesses and prints the correct answer
		wordGuessed = true;
		System.out.println("Game over!");
		System.out.print("The correct word was "); System.out.print(currentWord);
	}
	public static void wordComplete() { //stops asking for guesses and prints information
		wordGuessed = true;
		System.out.println("Correct!");
		System.out.print("The correct word was "); System.out.print(currentWord);
		if (guesses > 1) { //print remaining guesses
			System.out.println("\nYou had " + guesses + " guesses left");
		} else if (guesses == 1) {
			System.out.println("\nYou had " + guesses + " guess left"); //format guess singularly if there's only one guess left
		}
	}
	public static int random(int min, int max) { //generates a random number between specified numbers
		int x = (max - min) + 1;
		int random = (int)(Math.random() * x) + min; 
		return random;
	}
}
