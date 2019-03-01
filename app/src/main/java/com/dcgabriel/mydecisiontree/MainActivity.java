package com.dcgabriel.mydecisiontree;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private TextView questionTextView;
    private TextView response1TextView;
    private TextView response2TextView;
    private TextView response3TextView;
    private TextView response4TextView;
    private CardView response1CardView;
    private CardView response2CardView;
    private CardView response3CardView;
    private CardView response4CardView;
    private TextToSpeech textToSpeech;
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
    private Outcome o17;
    private Outcome o18;
    private Outcome o19;
    private Outcome o20;
    private Outcome o21;
    private Outcome o22;
    private Outcome o23;
    private Outcome o24;
    private Outcome o25;
    private Outcome o26;
    private Outcome o27;
    private Outcome o28;
    private Outcome o29;
    private Outcome o30;
    private Outcome o31;
    private Outcome o32;
    private Outcome o33;
    private Outcome o34;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        questionTextView = findViewById(R.id.question_textView);
        response1TextView = findViewById(R.id.response1_textView);
        response2TextView = findViewById(R.id.response2_textView);
        response3TextView = findViewById(R.id.response3_textView);
        response4TextView = findViewById(R.id.response4_textView);
        response1CardView = findViewById(R.id.response1_cardView);
        response2CardView = findViewById(R.id.response2_cardView);
        response3CardView = findViewById(R.id.response3_cardView);
        response4CardView = findViewById(R.id.response4_cardView);

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
        o10 = new Outcome(getResources().getString(R.string.q10));
        o11 = new Outcome(getResources().getString(R.string.q11));


        //final outcomes
        o12 = new Outcome(getResources().getString(R.string.q12), true, new Choice(getResources().getString(R.string.go_back), o4));
        o33 = new Outcome(getResources().getString(R.string.q33), true, new Choice(getResources().getString(R.string.go_back), o4));
        o34 = new Outcome(getResources().getString(R.string.q34), true, new Choice(getResources().getString(R.string.go_back), o4));
        o13 = new Outcome(getResources().getString(R.string.q13), true, new Choice(getResources().getString(R.string.go_back), o5));
        o14 = new Outcome(getResources().getString(R.string.q14), true, new Choice(getResources().getString(R.string.go_back), o5));
        o15 = new Outcome(getResources().getString(R.string.q15), true, new Choice(getResources().getString(R.string.go_back), o5));
        o16 = new Outcome(getResources().getString(R.string.q16), true, new Choice(getResources().getString(R.string.go_back), o6));
        o17 = new Outcome(getResources().getString(R.string.q17), true, new Choice(getResources().getString(R.string.go_back), o6));
        o18 = new Outcome(getResources().getString(R.string.q18), true, new Choice(getResources().getString(R.string.go_back), o6));
        o19 = new Outcome(getResources().getString(R.string.q19), true, new Choice(getResources().getString(R.string.go_back), o7));
        o20 = new Outcome(getResources().getString(R.string.q20), true, new Choice(getResources().getString(R.string.go_back), o7));
        o21 = new Outcome(getResources().getString(R.string.q21), true, new Choice(getResources().getString(R.string.go_back), o7));
        o22 = new Outcome(getResources().getString(R.string.q23), true, new Choice(getResources().getString(R.string.go_back), o8));
        o23 = new Outcome(getResources().getString(R.string.q23), true, new Choice(getResources().getString(R.string.go_back), o8));
        o24 = new Outcome(getResources().getString(R.string.q23), true, new Choice(getResources().getString(R.string.go_back), o9));
        o25 = new Outcome(getResources().getString(R.string.q23), true, new Choice(getResources().getString(R.string.go_back), o9));
        o26 = new Outcome(getResources().getString(R.string.q23), true, new Choice(getResources().getString(R.string.go_back), o10));
        o27 = new Outcome(getResources().getString(R.string.q23), true, new Choice(getResources().getString(R.string.go_back), o11));
        o28 = new Outcome(getResources().getString(R.string.q23), true, new Choice(getResources().getString(R.string.go_back), o12));


        currentOutcome = o0;
        initializeChoices();
    }

    public void initializeChoices() {
        o0.setAllChoices(new Choice(getResources().getString(R.string.c1), o1), new Choice(getResources().getString(R.string.c2), o2), new Choice(getResources().getString(R.string.c3), o3), new Choice(getResources().getString(R.string.go_back), o0));
        o1.setAllChoices(new Choice(getResources().getString(R.string.c4), o4), new Choice(getResources().getString(R.string.c5), o5), new Choice(getResources().getString(R.string.c6), o6), new Choice(getResources().getString(R.string.go_back), o0));
        o2.setAllChoices(new Choice(getResources().getString(R.string.c7), o7), new Choice(getResources().getString(R.string.c8), o8), new Choice(getResources().getString(R.string.c9), o9), new Choice(getResources().getString(R.string.go_back), o0));
        o3.setAllChoices(new Choice(getResources().getString(R.string.c10), o10), new Choice(getResources().getString(R.string.c11), o11), new Choice(getResources().getString(R.string.c11), o11), new Choice(getResources().getString(R.string.go_back), o0));
        o4.setAllChoices(new Choice(getResources().getString(R.string.c12), o12), new Choice(getResources().getString(R.string.c33), o33), new Choice(getResources().getString(R.string.c34), o4), new Choice(getResources().getString(R.string.go_back), o1));
        o5.setAllChoices(new Choice(getResources().getString(R.string.c13), o13), new Choice(getResources().getString(R.string.c14), o14), new Choice(getResources().getString(R.string.c15), o15), new Choice(getResources().getString(R.string.go_back), o1));
        o6.setAllChoices(new Choice(getResources().getString(R.string.c16), o16), new Choice(getResources().getString(R.string.c17), o17), new Choice(getResources().getString(R.string.c18), o18), new Choice(getResources().getString(R.string.go_back), o1));

        //todo fix

    }

    public void populateTextViews() {
        questionTextView.setText(currentOutcome.getQuestionText());


        if (currentOutcome.isFinalOutcome()) {
            response1CardView.setVisibility(View.GONE);
            response2CardView.setVisibility(View.GONE);
            response3CardView.setVisibility(View.GONE);

        } else {
            response1TextView.setText(currentOutcome.getChoice1().getChoiceText());
            response2TextView.setText(currentOutcome.getChoice2().getChoiceText());
            response3TextView.setText(currentOutcome.getChoice3().getChoiceText());
            response4TextView.setText(currentOutcome.getChoice4().getChoiceText()); // back button

        }


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
