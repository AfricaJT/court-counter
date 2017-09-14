package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int sumA = 0;
    private int sumB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * The point3 method checks the ID of the view and adds 3 points to the relevant int sum, either sumA or sumB
     * @param view the View the method is called on
     */
    public void point3 (View view){
        if (view.getId() == R.id.a3){
            sumA = sumA + 3;
            this.updateScoreA(sumA);
        }
        else{
            sumB = sumB + 3;
            this.updateScoreB(sumB);
        }
    }

    /**
     * The point2 method checks the ID of the view and adds 2 points to the relevant int sum, either sumA or sumB
     * @param view the View the method is called on
     */
    public void point2 (View view){
        if (view.getId() == R.id.a2){
            sumA = sumA + 2;
            this.updateScoreA(sumA);
        }
        else{
            sumB = sumB + 2;
            this.updateScoreB(sumB);
        }
    }

    /**
     * The freeThrow method checks the ID of the view and adds 1 point to the relevant int sum, either sumA or sumB
     * @param view the View the method is called on
     */
    public void freeThrow (View view){
        if (view.getId() == R.id.a1){
            sumA++;
            this.updateScoreA(sumA);
        }
        else{
            sumB++;
            this.updateScoreB(sumB);
        }
    }

    /**
     * The reset method takes each teams score and zeros it (resets it)
     * @param view the View the method is called on
     */
    public void reset(View view){
        TextView teamScore = (TextView) findViewById(R.id.team_a_score);
        teamScore.setText(R.string.team_a_score);
        sumA = 0;
        teamScore = (TextView) findViewById(R.id.team_b_score);
        teamScore.setText(R.string.team_b_score);
        sumB = 0;
    }

    /**
     * The updateScoreA method changes the text of the view team_a_score to the updated int sumA
     * @param score int team points
     */
    public void updateScoreA(int score){
        TextView teamScoreA = (TextView) findViewById(R.id.team_a_score);
        teamScoreA.setText(String.valueOf(score));
    }

    /**
     * The updateScoreB method changes the text of the view team_b_score to the updated int sumB
     * @param score int team points
     */
    public void updateScoreB (int score){
        TextView teamScoreB = (TextView) findViewById(R.id.team_b_score);
        teamScoreB.setText(String.valueOf(score));
    }
}
