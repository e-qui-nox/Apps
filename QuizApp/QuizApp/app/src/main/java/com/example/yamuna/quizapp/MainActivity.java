package com.example.yamuna.quizapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    RadioButton question1_choice3;
    EditText question2_answer;
    EditText question3_answer;
    RadioButton question4_choice2;
    EditText question5_answer;
    EditText question6_answer;
    RadioButton question7_choice2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        setContentView(R.layout.activity_main);
    }


    public void submitAnswers(View view) {
        CharSequence resultsDisplay;
        int answer1_score;
        int answer2_score;
        int answer3_score;
        int answer4_score;
        int answer5_score;
        int answer6_score;
        int answer7_score;
        int final_score;

        Boolean answer1;

        question1_choice3 = (RadioButton) this.findViewById(R.id.question1_choice3);
        answer1 = question1_choice3.isChecked();
        if (answer1) {
            answer1_score = 1;
        } else {
            answer1_score = 0;
        }

        String answer2;
        question2_answer = (EditText) this.findViewById(R.id.question2_answer);
        answer2 = question2_answer.getText().toString().toLowerCase();
        if (answer2.equals("north korea")) {
            answer2_score = 1;
        } else {
            answer2_score = 0;
        }

        String answer3;
        question3_answer = (EditText) this.findViewById(R.id.question3_answer);
        answer3 = question3_answer.getText().toString().toLowerCase();
        if (answer3.equals("continents")) {
            answer3_score = 1;
        } else {
            answer3_score = 0;
        }

        Boolean answer4;
        question4_choice2 = (RadioButton) this.findViewById(R.id.question4_choice2);
        answer4 = question4_choice2.isChecked();
        if (answer4) {
            answer4_score = 1;
        } else {
            answer4_score = 0;
        }

        String answer5;
        question5_answer = (EditText) this.findViewById(R.id.question5_answer);
        answer5 = question5_answer.getText().toString().toLowerCase();
        if (answer5.equals(" triathlon") ) {
            answer5_score = 1;
        } else {
            answer5_score = 0;
        }


        String answer6;
        question6_answer = (EditText) this.findViewById(R.id.question6_answer);
        answer6 = question6_answer.getText().toString().toLowerCase();
        if (answer6.equals("norman g pritchard")) {
            answer6_score = 1;
        } else {
            answer6_score = 0;
        }

        Boolean answer7;
        question7_choice2 = (RadioButton) this.findViewById(R.id.question7_choice2);
        answer7 = question7_choice2.isChecked();
        if (answer7) {
            answer7_score = 1;
        } else {
            answer7_score = 0;
        }

        final_score = answer1_score + answer2_score + answer3_score + answer4_score + answer5_score  + answer6_score + answer7_score ;

        if (final_score == 10) {
            resultsDisplay = "Perfect! You scored 7 out of 7";
        } else {
            resultsDisplay = "Try again. You scored " + final_score + " out of 7";
        }

        Context context = getApplicationContext();
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context, resultsDisplay, duration);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }
}
