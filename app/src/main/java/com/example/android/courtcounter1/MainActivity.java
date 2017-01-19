package com.example.android.courtcounter1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    int scoreA=0;
    int scoreB=0;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       //displayForTeamA(8);
            }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int scoreA)
    {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(scoreA));
    }
    public void displayForTeamB(int scoreB)
    {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreB));
    }
  public void increaseA3(View v)
    {
         scoreA+=3;
        displayForTeamA(scoreA);

    }
    public void increaseA2(View v)
    {
         scoreA+=2;
        displayForTeamA(scoreA);

    }
    public void increaseA1(View v)
    {
         scoreA+=1;
        displayForTeamA(scoreA);

    }

    public void increaseB3(View v)
    {
        scoreB+=3;
        displayForTeamB(scoreB);

    }
    public void increaseB2(View v)
    {
        scoreB+=2;
        displayForTeamB(scoreB);

    }
    public void increaseB1(View v)
    {
        scoreB+=1;
        displayForTeamB(scoreB);

    }

    public void reset(View v)
    {
        scoreA=0;
        scoreB=0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }





}
