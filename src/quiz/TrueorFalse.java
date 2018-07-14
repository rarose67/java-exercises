package quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class TrueorFalse extends Question {

    private static String[] choices = {"True", "False"};
    private boolean answer;

    public TrueorFalse(String aText, boolean aAnswer) {
        super(aText);
        this.answer = aAnswer;
    }

    public static String[] getChoices() {
        return choices;
    }

    public boolean isAnswer() {
        return answer;
    }

    public void setAnswer(boolean aAnswer) {
        this.answer = aAnswer;
    }

    public boolean isCorrect(boolean aAnswer)
    {
        if(aAnswer == this.isAnswer())
        {
            System.out.println("That's correct.");
            return true;
        }
        else
        {
            System.out.println("That's not correct.");
            return false;
        }
    }

    public boolean answerQuestion()
    {
        Scanner in;
        String answer;
        boolean isValid, value;

        do
        {
            in = new Scanner(System.in);
            answer = in.next();

            if(answer.equals("true") || answer.equals("True"))
            {
                isValid = true;
                value = true;
            }
            else if(answer.equals("false") || answer.equals("False"))
            {
                isValid = true;
                value = false;
            }
            else
            {
                System.out.println(answer + " is not a valid choice.  Please try again.\n");
                isValid = false;
                value = false;
            }
        }while (!(isValid));

        return isCorrect(value);
    }

    public void askQuestion() {
        super.askQuestion();

        for(int i=0; i<choices.length; i++)
        {
            System.out.println(i + ":  " + choices[i]);
        }
    }

}