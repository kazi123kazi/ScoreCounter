package com.example.scorecounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView teamAScore,teamBScore;
    TextView teamAWicket,teamBWicket;
    int scoreA = 0,scoreB = 0;
    int wicketA = 0,wicketB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        teamAScore = (TextView) findViewById(R.id.teamAScore);
        teamAWicket = (TextView) findViewById(R.id.teamAWicket);
        teamBScore = (TextView) findViewById(R.id.teamBScore);
        teamBWicket = (TextView) findViewById(R.id.teamBWicket);
    }
    public void displayScoreA()
    {
        teamAScore.setText(String.valueOf(scoreA));
    }
    public void displayWicketA()
    {
        teamAWicket.setText(String.valueOf(wicketA));
    }
    public void displayScoreB()
    {
        teamBScore.setText(String.valueOf(scoreB));
    }

    public void displayWicketB()
    {
        teamBWicket.setText(String.valueOf(wicketB));
    }




    public void scoreOneA(View view){
        scoreA = scoreA+1;
        displayScoreA();
    }

    public void scoreTwoA(View view){
        scoreA = scoreA+2;
        displayScoreA();
    }
    public void scoreThreeA(View view){
        scoreA = scoreA+3;
        displayScoreA();
    }
    public void scoreFourA(View view){
        scoreA = scoreA+4;
        displayScoreA();
    }
    public void scoreSixA(View view){
        scoreA = scoreA+6;
        displayScoreA();
    }
    public void wicketA(View view){
        wicketA = wicketA+1;
        displayWicketA();
    }





    public void scoreOneB(View view){
        scoreB = scoreB+1;
        displayScoreB();
    }

    public void scoreTwoB(View view){
        scoreB = scoreB+2;
        displayScoreB();
    }
    public void scoreThreeB(View view){
        scoreB = scoreB+3;
        displayScoreB();
    }
    public void scoreFourB(View view){
        scoreB = scoreB+4;
        displayScoreB();
    }
    public void scoreSixB(View view){
        scoreB = scoreB+6;
        displayScoreB();
    }
    public void wicketB(View view){
        wicketB = wicketB+1;
        displayWicketB();
    }



    public void resetA(View view){
        scoreA = 0;wicketA = 0;
        displayScoreA();displayWicketA();
    }
    public void resetB(View view){
        scoreB = 0;wicketB = 0;
        displayScoreB();displayWicketB();
    }
}
