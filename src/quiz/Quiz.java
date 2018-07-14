package quiz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class Quiz {

    private int score;
    private int numQuestions;
    private HashMap<Integer, MultipleChoice> mcQuestions;
    private HashMap<Integer, Checkbox> checkboxQuestions;
    private HashMap<Integer, TrueorFalse> tfQuestions;

    public Quiz(int numQuestions, HashMap<Integer, MultipleChoice> mcQuestions,
                HashMap<Integer, Checkbox> checkboxQuestions, HashMap<Integer, TrueorFalse> tfQuestions)
    {
        this.score = 0;
        this.numQuestions = numQuestions;
        this.mcQuestions = mcQuestions;
        this.checkboxQuestions = checkboxQuestions;
        this.tfQuestions = tfQuestions;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getNumQuestions() {
        return numQuestions;
    }

    public void setNumQuestions(int numQuestions) {
        this.numQuestions = numQuestions;
    }

    public HashMap<Integer, MultipleChoice> getMcQuestions() {
        return mcQuestions;
    }

    public void setMcQuestions(HashMap<Integer, MultipleChoice> mcQuestions) {
        this.mcQuestions = mcQuestions;
    }

    public HashMap<Integer, Checkbox> getCheckboxQuestions() {
        return checkboxQuestions;
    }

    public void setCheckboxQuestions(HashMap<Integer, Checkbox> checkboxQuestions) {
        this.checkboxQuestions = checkboxQuestions;
    }

    public HashMap<Integer, TrueorFalse> getTfQuestions() {
        return tfQuestions;
    }

    public void setTfQuestions(HashMap<Integer, TrueorFalse> tfQuestions) {
        this.tfQuestions = tfQuestions;
    }

    public void addQuestion(int index, TrueorFalse question)
    {
        tfQuestions.put(index, question);
    }

    public void addQuestion(int index, MultipleChoice question)
    {
        mcQuestions.put(index, question);
    }

    public void addQuestion(int index, Checkbox question)
    {
        checkboxQuestions.put(index, question);
    }

    public void takeQuiz()
    {
        for (int i=0; i < getNumQuestions(); i++)
        {
            if(tfQuestions.keySet().contains(i))
            {
                tfQuestions.get(i).askQuestion();
                if(tfQuestions.get(i).answerQuestion())
                {
                    this.score++;
                }
            }
            else if(mcQuestions.keySet().contains(i))
            {
                mcQuestions.get(i).askQuestion();
                if(mcQuestions.get(i).answerQuestion())
                {
                    this.score++;
                }
            }
            else
            {
                checkboxQuestions.get(i).askQuestion();
                if(checkboxQuestions.get(i).answerQuestion())
                {
                    this.score++;
                }
            }
        }

        System.out.println("You scored a " + getScore() + " out of " + getNumQuestions());
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

