package Game;

public class Enigma {

    private String question;
    private String[] answers;
    private int rightAnswer;

    public Enigma(String question, String[] answers, int rightAnswers) {
        this.question = question;
        this.answers = answers;
        this.rightAnswer = rightAnswers;
    }

    public int getRightAnswer() {
        return rightAnswer;
    }

    public void setRightAnswer(int rightAnswer) {
        this.rightAnswer = rightAnswer;
    }

    public String getQuestion() {

        return question;
    }

    public void setQuestion(String question) {

        this.question = question;
    }

    public String[] getAnswers() {

        return answers;
    }

    public void setAnswers(String[] answers) {
        this.answers = answers;
    }



}
