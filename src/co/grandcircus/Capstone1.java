// @author Brandon Bath

package co.grandcircus;

import java.util.Scanner;

public class Capstone1 {

	public static void main(String[] args) {

		String contString = "yes";

		while (contString.equalsIgnoreCase("yes")) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Welcome to the Pig Translator!");
			System.out.println();
			System.out.println("Please enter a word to be translated:");
			String userInput = scan.nextLine();

			System.out.println("Alright, let's translate: " + userInput + ".");

			// Position of first vowel
			int firstVowel = 0;

			String beforeVowel = "", afterVowel = "";

			for (int l = 0; l < userInput.length(); l++) {
				char ch = userInput.charAt(l);

				if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O'
						|| ch == 'u' || ch == 'U') {
					firstVowel = l;

					break;
				}
			}

			beforeVowel = userInput.substring(0, firstVowel);
			afterVowel = userInput.substring(firstVowel, userInput.length());
			if (firstVowel == 0) {
				System.out.println();
				System.out.println((beforeVowel + afterVowel + "way"));
				System.out.println();
			} else {
				System.out.println();
				System.out.println(afterVowel + beforeVowel + "ay");
				System.out.println();

			}
			System.out.println("Would you like to go again? (yes/no)");
			contString = scan.next();

		}

		System.out.println("Bye!");

	}
}

// use string array and split up the sentence by removing the spaces, and putting them into the string array, then running an enhanced for loop for each string array spot (which will be the individual words), and then putting them back together and inserting the spaces again.

// Prompt user for input word
// Convert each word to lowercase
// If it starts with a vowel, just add "way to the end"
// Use split to take off consonants up to the first vowel, and add to the end
// Reprint out the word with the consonants at the end, and add "ay"

// Ask user if they want to translate another word