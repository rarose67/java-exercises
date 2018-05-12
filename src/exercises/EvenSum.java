package exercises;

import java.util.ArrayList;

public class EvenSum
{
    public static int EvenSum(ArrayList<Integer> nums)
    {
        int sum = 0;

        for (int i=0; i < nums.size(); i++)
        {
            if ((nums.get(i) % 2) == 0)
            {
                sum += nums.get(i);
            }
        }

        return sum;
    }

    public static void main(String[] args)
    {
        ArrayList<Integer> numbers = new ArrayList();
        for (int i=0; i<=10; i++)
        {
            numbers.add(i);
        }

        int sum = EvenSum(numbers);
        System.out.println("sum is: " + sum);
    }
}
