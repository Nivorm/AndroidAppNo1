package pl.edu.pb.wi;

public class Question {
    private int questionID;
    private boolean trueAnswer;

    public Question(int questionID, boolean trueAnswer) {
        this.questionID = questionID;
        this.trueAnswer = trueAnswer;
    }

    public int getQuestionID() {
        return questionID;
    }

    public boolean isTrueAnswer() {
        return trueAnswer;
    }
}
