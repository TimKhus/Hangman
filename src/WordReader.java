import java.io.FileNotFoundException;
import java.util.*;
import java.io.File;

public class WordReader {
    public static String randWord() throws FileNotFoundException {
        File file = new File("C:\\Users\\User\\IdeaProjects\\Hangman\\src\\Resources\\nouns.txt");
        Scanner scanWord = new Scanner(file);
        List<String> words = new ArrayList<String>();
        while (scanWord.hasNextLine()) {
            words.add(scanWord.nextLine());
        }
        Random rand = new Random();
        int randInt = rand.nextInt(words.size());
        return words.get(randInt);
    }
}
