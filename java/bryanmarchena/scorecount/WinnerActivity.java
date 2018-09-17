package bryanmarchena.scorecount;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class WinnerActivity extends AppCompatActivity {

    //declaring textview
    private TextView textView_win;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_winner);
        
        //find and cast textview
        textView_win = (TextView)findViewById(R.id.winner_text);

        //get data from intent
        Intent intent = getIntent();
        int teamOne_int = intent.getIntExtra(MainActivity.EXTRA_INT1, 0);
        int teamTwo_int = intent.getIntExtra(MainActivity.EXTRA_INT2, 0);
        String WinningTeam = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        
        //calculate the score spread
        int score_Spread = (Math.max(teamOne_int,teamTwo_int) - Math.min(teamOne_int,teamTwo_int));

        //prints the winner and spread
        textView_win.setText(WinningTeam + " won by: " + score_Spread);
    }
}
