package quiz;

public abstract class Question {

    private int id;
    protected String prompt;
    private boolean asked;
    private static int nextId = 1;

    public Question()
    {
        this.id = nextId;
        nextId++;
    }

    public Question(String aText) {
        this();
        this.prompt = aText;
        this.asked = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int aId) {
        this.id = aId;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int aNextId) {
        Question.nextId = aNextId;
    }

    public String getPrompt() {
        return prompt;
    }

    public void setPrompt(String aText) {
        this.prompt = aText;
    }

    public boolean isAsked() {
        return asked;
    }

    public void setAsked(boolean aAsked) {
        this.asked = aAsked;
    }

   public void askQuestion()
   {
       System.out.println(getPrompt());
       setAsked(true);
   }
}
