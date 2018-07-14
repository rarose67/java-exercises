package exercises;

import java.util.ArrayList;
import java.util.HashMap;

public class ArrayMax {
    public static int FindMax(int[] nums)
    {
        int max_int = nums[0];

        for (int i=0; i < nums.length; i++)
        {
            if (nums[i] > max_int)
            {
                max_int = nums[i];
            }
        }

        return max_int;
    }

    public static void main(String[] args)
    {
        int [] numbers = {1, 2, 40, 62, 5};
        ArrayList<Integer> numbers2 = new ArrayList<>();
        HashMap<String, Object> test = new HashMap<>();

        for (int i=0; i<10; i++)
        {
            numbers2.add(i);
        }

        for (int j=0; j<numbers.length; j++)
        {
            if (numbers2.contains(numbers[j]))
            {
                System.out.println(numbers[j] + " is in the list");
            }
            else
            {
                System.out.println(numbers[j] + " is not in the list");
            }
        }

        int max = FindMax(numbers);
        System.out.println("\nMax is: " + max + "\n");

        test.put("String", "Hi");
        test.put("int", 1);
        test.put("double", 1.5);

        for (String key : test.keySet())
        {
            if (key.equals("int"))
            {
                int val = (int) test.get(key);
                System.out.println(key + ":  " + val);
            }
            else if (key.equals("double"))
            {
                double val = (double) test.get(key);
                System.out.println(key + ":  " + val);
            }
            else if (key.equals("String"))
            {
                String val = (String) test.get(key);
                System.out.println(key + ":  " + val);
            }
            System.out.println(key + ":  " + test.get(key) + "\n");


        }
    }
}
