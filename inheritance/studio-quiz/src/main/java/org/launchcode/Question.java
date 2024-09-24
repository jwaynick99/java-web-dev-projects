package org.launchcode;

public class Question {
    private final int questionNum;
    private static int nextQuestionNum = 1;
    private final String question;
    private final String correctAnswer;
    private String correctAnswer2;

    public Question(String correctAnswer, String question){
        questionNum = nextQuestionNum;
        nextQuestionNum ++;
        this.correctAnswer = correctAnswer;
        this.question = question;
    }

    public Question(String correctAnswer, String correctAnswer2, String question){
        questionNum = nextQuestionNum;
        nextQuestionNum ++;
        this.correctAnswer = correctAnswer;
        this.correctAnswer2 = correctAnswer2;
        this.question = question;
    }

    public int getQuestionNum() {
        return questionNum;
    }

    public String getCorrectAnswer(){
        return correctAnswer;
    }

    public String getCorrectAnswer2(){
        return correctAnswer2;
    }

    public boolean checkCorrect(){
        return false;
    }

    public String getQuestion() {
        return question;
    }
}
