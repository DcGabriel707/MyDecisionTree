package com.dcgabriel.mydecisiontree;

public class Outcome {

    private String questionText;
    private Choice choice1;
    private Choice choice2;
    private Choice choice3;
    private Choice choice4;

    public Outcome(String questionText) {
        this.questionText = questionText;
    }

    public Outcome(String questionText, Choice choice1, Choice choice2, Choice choice3, Choice choice4) {
        this.questionText = questionText;
        this.choice1 = choice1;
        this.choice2 = choice2;
        this.choice3 = choice3;
        this.choice4 = choice4;
    }

    public void setAllChoices(Choice choice1, Choice choice2, Choice choice3, Choice choice4) {
        this.choice1 = choice1;
        this.choice2 = choice2;
        this.choice3 = choice3;
        this.choice4 = choice4;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public Choice getChoice1() {
        return choice1;
    }

    public void setChoice1(Choice choice1) {
        this.choice1 = choice1;
    }

    public Choice getChoice2() {
        return choice2;
    }

    public void setChoice2(Choice choice2) {
        this.choice2 = choice2;
    }

    public Choice getChoice3() {
        return choice3;
    }

    public void setChoice3(Choice choice3) {
        this.choice3 = choice3;
    }

    public Choice getChoice4() {
        return choice4;
    }

    public void setChoice4(Choice choice4) {
        this.choice4 = choice4;
    }


}
