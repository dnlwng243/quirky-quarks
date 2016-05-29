package org.beautiful_butterflies.quirky_quarks.game;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.beautiful_butterflies.quirky_quarks.R;

import java.util.Timer;
import java.util.TimerTask;

public class Game extends AppCompatActivity {

    Handler handler;
    Timer timer;

    int timerVal;

    ImageView catBackgroundView;
    ImageView gameBackgroundView;
    TextView countdownTextView;
    ImageButton pauseButton;
    ImageButton pseudoscalarMesonButton;
    ImageButton vectorMesonButton;
    ImageButton isospinBaryonOctetButton;
    ImageButton isospinBaryonDecupletButton;
    ImageButton recipeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_game);

        timer = new Timer("Timer-Countdown", true);
        int timerVal = -1;
        handler = new Handler(Looper.getMainLooper());

        { /* Define views */
            catBackgroundView = (ImageView) findViewById(R.id.catBackgroundView);
            gameBackgroundView = (ImageView) findViewById(R.id.gameBackgroundView);
            countdownTextView = (TextView) findViewById(R.id.countdownTextView);
            pauseButton = (ImageButton) findViewById(R.id.pauseButton);
            pseudoscalarMesonButton = (ImageButton) findViewById(R.id.pseudoscalarMesonButton);
            vectorMesonButton = (ImageButton) findViewById(R.id.vectorMesonButton);
            isospinBaryonOctetButton = (ImageButton) findViewById(R.id.isospinBaryonOctetButton);
            isospinBaryonDecupletButton = (ImageButton) findViewById(R.id.isospinBaryonDecupletButton);
            recipeButton = (ImageButton) findViewById(R.id.recipeButton);
        }

        queueNewGame();
    }

    private void showGameControls(boolean bool) {
        int state = (bool) ? View.VISIBLE : View.INVISIBLE;

        pseudoscalarMesonButton.setVisibility(state);
        vectorMesonButton.setVisibility(state);
        isospinBaryonOctetButton.setVisibility(state);
        isospinBaryonDecupletButton.setVisibility(state);
    }

    private void queueNewGame() {
        RelativeLayout.LayoutParams centerLayout = (RelativeLayout.LayoutParams) countdownTextView.getLayoutParams();
        centerLayout.topMargin += 540;
        countdownTextView.setLayoutParams(centerLayout);

        showGameControls(false);
        setBackground("cat");

        timerVal = 5;
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        if(timerVal > 0)
                            countdownTextView.setText("Starting in " + timerVal + "s ...");
                        timerVal--;
                    }
                });

                if(timerVal <= 0) {
                    this.cancel();
                    handler.post(new Runnable() {
                        @Override
                        public void run() {
                            initGameLayout();
                            startNewGame();
                        }
                    });
                }
            }
        }, 0, 1000);
    }


    private void setBackground(String id) {
        switch(id) {
            case "cat":
                catBackgroundView.setVisibility(View.VISIBLE);
                gameBackgroundView.setVisibility(View.INVISIBLE);
                break;
            case "game":
                catBackgroundView.setVisibility(View.INVISIBLE);
                gameBackgroundView.setVisibility(View.VISIBLE);
                break;
        }
    }

    private void initGameLayout() {
        RelativeLayout.LayoutParams origLayout = (RelativeLayout.LayoutParams) countdownTextView.getLayoutParams();
        origLayout.topMargin -= 540;
        countdownTextView.setLayoutParams(origLayout);
        countdownTextView.setTextSize(20f);

        setBackground("game");
        showGameControls(true);
    }

    private void startNewGame() {
        countdownTextView.setText("#temp~'New Game'");
    }
}
