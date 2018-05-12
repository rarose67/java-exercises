package org.launchcode.java.studios;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CountingChars {
    //private static final String DATA_FILE = "resources/CountingChars.txt";
    private static final String DATA_FILE = "resources/alice.txt";

    public static void main(String[] args) {

        HashMap<String, Integer> charmap = new HashMap<>();
        //String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc accumsan sem ut ligula scelerisque sollicitudin. Ut at sagittis augue. Praesent quis rhoncus justo. Aliquam erat volutpat. Donec sit amet suscipit metus, non lobortis massa. Vestibulum augue ex, dapibus ac suscipit vel, volutpat eget massa. Donec nec velit non ligula efficitur luctus.";
        //String text = "Hello ghi, GHI, World1h!";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        char[] charactersInText;
        String character;
        int num;
        boolean is_lower = false;
        boolean is_upper = false;

        try
        {
            BufferedReader in = new BufferedReader(new FileReader(DATA_FILE));
            String line;
            String text = "";

            while ((line = in.readLine()) != null)
            {
                text += line;
            }
            in.close();

            charactersInText = text.toCharArray();

            for (int i=0; i < charactersInText.length; i++)
            {
                character = Character.toString(charactersInText[i]);
                is_lower = (alphabet.indexOf(character) >= 0);
                is_upper = (alphabet.toUpperCase().indexOf(character) >= 0);
                //System.out.println("Char " + character + " is Alpha: " + alphabet.indexOf(character));


                if (is_lower || is_upper)
                {
                    if(charmap.containsKey(character.toLowerCase()))
                    {
                        num = charmap.get(character.toLowerCase());
                        num += 1;
                        charmap.replace(character.toLowerCase(), num);
                    }
                    else {
                        charmap.put(character.toLowerCase(), 1);
                    }
                }
            }

            // Print char
            System.out.println("\nChar count:");

            for (Map.Entry<String, Integer> letter : charmap.entrySet()) {
                System.out.println(letter.getKey() + ": " + letter.getValue());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
