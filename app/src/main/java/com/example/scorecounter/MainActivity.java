package com.example.scorecounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
/* Author : Kazi Sahariar Rahi
*All rights are reserved.
* Open source code.
* Source code can be found in my github repo
* github.com/kazi123kazi
 */

public class MainActivity extends AppCompatActivity {

    private TextView teamAScore,teamBScore,teamAWicket,teamBWicket;
    int scoreA = 0,scoreB = 0,wicketA = 0,wicketB = 0;;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initwidget();
    }

    private void initwidget() {
        teamAScore = (TextView) findViewById(R.id.teamAScore);
        teamAWicket = (TextView) findViewById(R.id.teamAWicket);
        teamBScore = (TextView) findViewById(R.id.teamBScore);
        teamBWicket = (TextView) findViewById(R.id.teamBWicket);
    }

    //Display
    private void displayScoreA()
    {
        teamAScore.setText(String.valueOf(scoreA));
    }
    private void displayWicketA()
    {
        teamAWicket.setText(String.valueOf(wicketA));
    }
    private void displayScoreB()
    {
        teamBScore.setText(String.valueOf(scoreB));
    }
    private void displayWicketB()
    {
        teamBWicket.setText(String.valueOf(wicketB));
    }

   //Player A
    public void scoreOneA(View view){
        scoreA += 1;
        displayScoreA();
    }
    public void scoreTwoA(View view){
        scoreA += 2;
        displayScoreA();
    }
    public void scoreThreeA(View view){
        scoreA += 3;
        displayScoreA();
    }
    public void scoreFourA(View view){
        scoreA += 4;
        displayScoreA();
    }
    public void scoreSixA(View view){
        scoreA += 6;
        displayScoreA();
    }
    public void wicketA(View view){
        wicketA += 1;
        displayWicketA();
    }




    //Player B
    public void scoreOneB(View view){
        scoreB +=1;
        displayScoreB();
    }
    public void scoreTwoB(View view){
        scoreB +=2;
        displayScoreB();
    }
    public void scoreThreeB(View view){
        scoreB += 3;
        displayScoreB();
    }
    public void scoreFourB(View view){
        scoreB += 4;
        displayScoreB();
    }
    public void scoreSixB(View view){
        scoreB += 6;
        displayScoreB();
    }
    public void wicketB(View view){
        wicketB +=1;
        displayWicketB();
    }


   //Reset
    public void resetA(View view){
        scoreA = 0;wicketA = 0;
        displayScoreA();displayWicketA();
    }
    public void resetB(View view){
        scoreB = 0;wicketB = 0;
        displayScoreB();displayWicketB();
    }
}
