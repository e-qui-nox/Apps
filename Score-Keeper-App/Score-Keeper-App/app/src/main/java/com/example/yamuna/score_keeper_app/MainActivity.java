package com.example.yamuna.score_keeper_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int player1_score = 0;
    int player2_score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addThreeForPlayer1(View v) {
        player1_score=player1_score+3;
        displayForPlayer1(player1_score);
    }

    public void addTwoForPlayer1(View v) {
        player1_score=player1_score+2;
        displayForPlayer1(player1_score);
    }

    public void addOneForPlayer1(View v) {
        player1_score = player1_score + 1;
        displayForPlayer1(player1_score);
    }

    public void addThreeForPlayer2(View v) {
        player2_score=player2_score+3;
        displayForPlayer2(player2_score);
    }

    public void addTwoForPlayer2(View v) {
        player2_score=player2_score+2;
        displayForPlayer2(player2_score);
    }

    public void addOneForPlayer2(View v) {
        player2_score = player2_score + 1;
        displayForPlayer2(player2_score);
    }

    public void displayForPlayer1(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player1_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForPlayer2(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player2_score);
        scoreView.setText(String.valueOf(score));
    }

    public void ResetScore(View v) {
        player1_score = 0;
        player2_score = 0;
        displayForPlayer1(player1_score);
        displayForPlayer2(player2_score);
    }
}