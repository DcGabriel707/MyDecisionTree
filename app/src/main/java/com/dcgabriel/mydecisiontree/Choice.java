package com.dcgabriel.mydecisiontree;

public class Choice {

    private String choiceText;
    private Outcome choiceOutcome;

    public Choice(String choiceText, Outcome choiceOutcome) {
        this.choiceText = choiceText;
        this.choiceOutcome = choiceOutcome;
    }


    public String getChoiceText() {
        return choiceText;
    }

    public void setChoiceText(String choiceText) {
        this.choiceText = choiceText;
    }

    public Outcome getChoiceOutcome() {
        return choiceOutcome;
    }

    public void setChoiceOutcome(Outcome choiceOutcome) {
        this.choiceOutcome = choiceOutcome;
    }

}
