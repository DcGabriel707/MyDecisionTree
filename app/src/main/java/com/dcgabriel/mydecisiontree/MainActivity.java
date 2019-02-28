package com.dcgabriel.mydecisiontree;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private TextView questionTextView;
    private TextView response1TextView;
    private TextView response2TextView;
    private TextView response3TextView;
    private TextView response4TextView;
    private Outcome currentOutcome;
    private Outcome o0;
    private Outcome o1;
    private Outcome o2;
    private Outcome o3;
    private Outcome o4;
    private Outcome o5;
    private Outcome o6;
    private Outcome o7;
    private Outcome o8;
    private Outcome o9;
    private Outcome o10;
    private Outcome o11;
    private Outcome o12;
    private Outcome o13;
    private Outcome o14;
    private Outcome o15;
    private Outcome o16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        questionTextView = findViewById(R.id.question_textView);
        response1TextView = findViewById(R.id.response1_textView);
        response2TextView = findViewById(R.id.response2_textView);
        response3TextView = findViewById(R.id.response3_textView);
        response4TextView = findViewById(R.id.response4_textView);

        initializeQuestions();
        populateTextViews();


    }

    public void initializeQuestions() {
        o0 = new Outcome(getResources().getString(R.string.q0));
        o1 = new Outcome(getResources().getString(R.string.q1));
        o2 = new Outcome(getResources().getString(R.string.q2));
        o3 = new Outcome(getResources().getString(R.string.q3));
        o4 = new Outcome(getResources().getString(R.string.q4));
        o5 = new Outcome(getResources().getString(R.string.q5));
        o6 = new Outcome(getResources().getString(R.string.q6));
        o7 = new Outcome(getResources().getString(R.string.q7));
        o8 = new Outcome(getResources().getString(R.string.q8));
        o9 = new Outcome(getResources().getString(R.string.q9));
        currentOutcome = o0;

        initializeChoices();
    }

    public void initializeChoices() {
        o0.setAllChoices(new Choice(getResources().getString(R.string.c1), o1), new Choice(getResources().getString(R.string.c2), o2), new Choice(getResources().getString(R.string.c3), o3), new Choice(getResources().getString(R.string.go_back), o0));
        o1.setAllChoices(new Choice(getResources().getString(R.string.c4), o4), new Choice(getResources().getString(R.string.c5), o5), new Choice(getResources().getString(R.string.c6), o6), new Choice(getResources().getString(R.string.go_back), o1));
        o2.setAllChoices(new Choice(getResources().getString(R.string.c7), o7), new Choice(getResources().getString(R.string.c8), o8), new Choice(getResources().getString(R.string.c9), o9), new Choice(getResources().getString(R.string.go_back), o1));
        o3.setAllChoices(new Choice(getResources().getString(R.string.c10), o10), new Choice(getResources().getString(R.string.c11), o11), new Choice(getResources().getString(R.string.c11), o11), new Choice(getResources().getString(R.string.go_back), o1));
        o4.setAllChoices(new Choice(getResources().getString(R.string.c12), o12), new Choice(getResources().getString(R.string.c33), o4), new Choice(getResources().getString(R.string.c34), o4), new Choice(getResources().getString(R.string.go_back), o0));
//todo fix

    }

    public void populateTextViews() {
        questionTextView.setText(currentOutcome.getQuestionText());
        response1TextView.setText(currentOutcome.getChoice1().getChoiceText());
        response2TextView.setText(currentOutcome.getChoice2().getChoiceText());
        response3TextView.setText(currentOutcome.getChoice3().getChoiceText());
        response4TextView.setText(currentOutcome.getChoice4().getChoiceText());
    }


    public void response1Click(View view) {
        currentOutcome = currentOutcome.getChoice1().getChoiceOutcome();
        populateTextViews();
    }

    public void response2Click(View view) {
        currentOutcome = currentOutcome.getChoice2().getChoiceOutcome();
        populateTextViews();
    }

    public void response3Click(View view) {
        currentOutcome = currentOutcome.getChoice3().getChoiceOutcome();
        populateTextViews();
    }

    public void response4Click(View view) {
        currentOutcome = currentOutcome.getChoice4().getChoiceOutcome();
        populateTextViews();
    }
}
