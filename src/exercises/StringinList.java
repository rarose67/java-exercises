package exercises;

import java.util.ArrayList;

public class StringinList {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Hi");
        list.add("HI");
        list.add("hello");

        if(list.contains("Ha"))
        {
            System.out.println("It's in the list");
        }
        else
        {
            System.out.println("It's not in the list");
        }
    }
}
