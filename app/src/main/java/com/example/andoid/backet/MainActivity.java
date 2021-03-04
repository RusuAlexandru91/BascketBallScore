package com.example.andoid.backet;

import androidx.appcompat.app.AppCompatActivity;
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
    /** Make +3 button work for Team A**/

    public void addThreeForTeamA (View v) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA );
    }
    /** Make +3 button work for team B**/

    public void addThreeForTeamB (View v) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB );
    }

    /** Make +2 Button work for team A**/
    public void addTwoForTeamA ( View v) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA );
    }
    /** Make +2 Button work for team B **/
    public void addTwoForTeamB ( View v) {
        scoreTeamB= scoreTeamB + 2;
        displayForTeamB(scoreTeamB );
    }
    /** Make +1 Button work for team A**/
    public void addOneForTeamA ( View v) {
        scoreTeamA = scoreTeamA +1;
        displayForTeamA(scoreTeamA );
    }
    /** Make +1 Button work for team B**/
    public void addOneForTeamB ( View v) {
        scoreTeamB = scoreTeamB +1;
        displayForTeamB(scoreTeamB );
    }

    /** Make Reset button work **/
    public void reset ( View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA );
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreTeamA);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreTeamB);
        scoreView.setText(String.valueOf(score));
    }
}