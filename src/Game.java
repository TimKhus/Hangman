import java.util.Scanner;
import java.util.*;
import java.io.*;

public class Game {
    public static void game() throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);
        String word = WordReader.randWord().toUpperCase();
        int mistakes = 0;
        List<String> usedLetters = new ArrayList<String>();
        Map<Integer, String> wordMap = new TreeMap<Integer, String>();
        Map<Integer, String> hiddenWord = new TreeMap<Integer, String>();
        for (int i = 0; i < word.length(); i++) {
            wordMap.put(i + 1, String.valueOf(word.toCharArray()[i]));
            hiddenWord.put(i + 1, "*");
        }
        while (true) {
            for (String i : hiddenWord.values()) {
                System.out.print(i);
            }
            System.out.println();
            System.out.println("Input a letter: ");
            String letter = scan.next().toUpperCase();
            if (Character.isLetter(letter.charAt(0)) && !usedLetters.contains(letter) && letter.length() == 1) {
                usedLetters.add(letter);
                if (wordMap.containsValue(letter)) {
                    Gallow.showGallows(mistakes);
                    System.out.println("You guessed the letter! Number of mistakes: " + mistakes);
                    for (Integer i : wordMap.keySet()) {
                        if (wordMap.get(i).equals(letter)) {
                            hiddenWord.put(i, letter);
                        }
                    }
                } else {
                    mistakes++;
                    Gallow.showGallows(mistakes);
                    System.out.println("Error! Number of mistakes: " + mistakes);
                    if (mistakes >= 7) {
                        System.out.println("Hidden word was: " + word);
                        System.out.println("You loss!");
                        break;
                    }
                }
                System.out.println();
                if (wordMap.equals(hiddenWord)) {
                    for (String i : hiddenWord.values()) {
                        System.out.print(i);
                    }
                    System.out.println();
                    System.out.println("Victory! You guessed the word!");
                    break;
                }
            } else if (usedLetters.contains(letter)) {
                System.out.println("You already used this letter. Try another.");
            } else {
                System.out.println("This is not a letter. Input a letter please.");
            }
        }
    }
}
