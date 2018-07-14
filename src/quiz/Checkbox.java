package quiz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Checkbox extends Question {

    private HashMap<String, String> choices;
    private ArrayList<String> correctAnswer;

    public Checkbox(String aText, ArrayList<String> aAnswer, HashMap<String, String> choices) {
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

    public ArrayList<String> getCorrectAnswer() {
        return correctAnswer;
    }

    public void setAnswer(ArrayList<String> aAnswer) {
        this.correctAnswer = aAnswer;
    }

    public boolean isCorrect(ArrayList<String> aAnswer)
    {
        boolean correctAnswer = true;

        if((this.getCorrectAnswer().size()) == aAnswer.size())
        {
            for (int i=0; i < aAnswer.size(); i++) {
                if (!(this.getCorrectAnswer().contains(aAnswer.get(i)))) {
                    correctAnswer = false;
                    break;
                }
            }
        }
        else
        {
            correctAnswer = false;
        }

        return correctAnswer;
    }

    @Override
    public void askQuestion() {
        super.askQuestion();
        System.out.println("Enter done when finished.");

        for (Map.Entry<String, String> choice : choices.entrySet()) {
            System.out.println(choice.getKey() + ": " + choice.getValue());
        }
    }

    public  boolean answerQuestion()
    {
        Scanner in;
        String choice;
        ArrayList<String> answer = new ArrayList<>();

        do {
            in = new Scanner(System.in);
            choice = in.next();

            if(getChoices().keySet().contains(choice))
            {
                answer.add(choice);
            }
            else if(!(choice.equals("done")))
            {
                System.out.println(answer + " is not a valid choice.  Please try again.\n");
            }
        }while (!(choice.equals("done")));

        return isCorrect(answer);
    }

    public static void main(String[] args) {

        String question = "What are the common types of pie?";
        HashMap<String, String> choices = new HashMap<>();
        ArrayList<String> correctAnswer = new ArrayList<>();

        choices.put("A", "Cherry");
        choices.put("B","Apple");
        choices.put("C","Pumkin");
        choices.put("D","pickle");
        choices.put("E","All of the above");

        correctAnswer.add("A");
        correctAnswer.add("B");
        correctAnswer.add("C");

        Checkbox q1 = new Checkbox(question, correctAnswer, choices);

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
