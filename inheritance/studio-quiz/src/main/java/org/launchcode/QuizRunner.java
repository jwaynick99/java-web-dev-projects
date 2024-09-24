package org.launchcode;

public class QuizRunner {
    public static void main(String[] args){
        MultipleChoice quest1 = new MultipleChoice("Who was the first American woman in space?", "Sally Ride", "Christina Koch", "Eileen Collins", "Kate Rubins", "Sally Ride");
        TrueFalse quest2 = new TrueFalse("True or false: 5 kilometer == 5000 meters? ", "True", "False", "True");
        MultipleChoice quest3 = new MultipleChoice("(5 + 3)/2 * 10 = ?", "30", "45", "40", "15", "40");
        MultipleChoice quest4 = new MultipleChoice("Given the array [8, 'Orbit', 'Trajectory', 45], what entry is at index 2?", "Orbit", "45", "Trajectory", "8", "Trajectory");
        CheckBox quest5 = new CheckBox("What goes on a traditional PB&J?", "Salami", "Peanut Butter", "Jelly", "Ketchup", "Peanut Butter", "Jelly");

        Quiz studioQuiz = new Quiz();
        studioQuiz.addQuestion(quest1);
        studioQuiz.addQuestion(quest2);
        studioQuiz.addQuestion(quest3);
        studioQuiz.addQuestion(quest4);
        studioQuiz.addQuestion(quest5);

        studioQuiz.runQuiz();
        studioQuiz.gradeQuiz();
    }

}
