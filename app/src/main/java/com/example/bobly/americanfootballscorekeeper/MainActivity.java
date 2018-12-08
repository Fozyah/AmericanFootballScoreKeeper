package com.example.bobly.americanfootballscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /*
    score for team A
     */
    public void addSevenPointForTeamA (View v)
    {
        scoreTeamA += 7;
        displayForTeamA(scoreTeamA);
    }
    public void addSixPointForTeamA (View v)
    {
        scoreTeamA +=6;
        displayForTeamA(scoreTeamA);
    }
    public void addThreePointForTeamA (View v)
    {
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }
    /*
    score for team B
     */
    public void addSevenPointForTeamB (View v)
    {
        scoreTeamB += 7;
        displayForTeamB(scoreTeamB);
    }
    public void addSixPointForTeamB (View v)
    {
        scoreTeamB +=6;
        displayForTeamB(scoreTeamB);
    }
    public void addThreePointForTeamB (View v)
    {
        scoreTeamB +=3 ;
        displayForTeamB(scoreTeamB);
    }
    public void restValue ( View v) {
        scoreTeamA =0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);

    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

}
