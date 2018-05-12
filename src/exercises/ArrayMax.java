package exercises;

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
        int [] numbers = {1, 2, 4, 6, 5};

        int max = FindMax(numbers);
        System.out.println(max);
    }
}
