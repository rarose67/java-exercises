package exercises;

import java.util.ArrayList;
import java.util.Arrays;

public class Words {
    public static void FiveLetterWords(ArrayList<String> words)
    {
        int sum = 0;

        for (int i=0; i < words.size(); i++)
        {
            if ((words.get(i).length()) == 5)
            {
                System.out.println(words.get(i));
            }
        }
    }

    public static void main(String[] args)
    {
        ArrayList wordlist;
        String[] words = {"Fives", "dog", "birds", "Hives"};

        wordlist = new ArrayList(Arrays.asList(words));

        FiveLetterWords(wordlist);
    }
}
