package quiz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MultipleChoice extends Question {

    private HashMap<String, String> choices;
    private String correctAnswer;

    public MultipleChoice(String aText, String aAnswer, HashMap<String, String> choices) {
        super(aText);
        this.correctAnswer = aAnswer;
        this.choices = choices;
    }

    public HashMap<String, String> getChoices() {
        return choices;
    }

    public void setChoices(HashMap<String, String> aChoices) {
        this.choices = aChoices;
    }

    public String getAnswer() {
        return correctAnswer;
    }

    public void setAnswer(String aAnswer) {
        this.correctAnswer = aAnswer;
    }

    public boolean isCorrect(String aAnswer)
    {
        boolean correctAnswer = false;

        if (this.getAnswer().equals(aAnswer))
        {
            correctAnswer = true;
        }

        return correctAnswer;
    }

    @Override
    public void askQuestion() {
        super.askQuestion();

        for (Map.Entry<String, String> choice : choices.entrySet()) {
            System.out.println(choice.getKey() + ": " + choice.getValue());
        }
    }

    public boolean answerQuestion()
    {
        Scanner in;
        String choice;
        String answer;

        do {
            in = new Scanner(System.in);
            choice = in.next();

            if(getChoices().keySet().contains(choice))
            {
                answer = choice;
            }
            else
            {
                System.out.println(choice + " is not a valid choice.  Please try again.\n");
                answer = "";
            }
        }while (answer.equals(""));

        return isCorrect(answer);
    }

    public static void main(String[] args) {

        String question = "What are the best type of pie?";
        HashMap<String, String> choices = new HashMap<>();
        String correctAnswer = "A";

        choices.put("A", "Cherry");
        choices.put("B","Apple");
        choices.put("C","Pumkin");
        choices.put("D","pickle");
        choices.put("E","All of the above");

        MultipleChoice q1 = new MultipleChoice(question, correctAnswer, choices);

        q1.askQuestion();
        boolean a1 = q1.answerQuestion();

        if(a1)
        {
            System.out.println("That's correct.");
        }
        else
        {
            System.out.println("That's not correct.");
        }
    }
}

