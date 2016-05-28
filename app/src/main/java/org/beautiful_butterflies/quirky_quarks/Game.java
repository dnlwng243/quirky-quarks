package org.beautiful_butterflies.quirky_quarks;

import android.os.Handler;
import android.os.Looper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class Game extends AppCompatActivity {

    TextView countdownTextView;
    Timer timer;
    int timerVal;

    Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_game);

        countdownTextView = (TextView) findViewById(R.id.countdownTextView);
        timer = new Timer("Timer-Countdown", true);
        int timerVal = -1;
        handler = new Handler(Looper.getMainLooper());

        /* TEST */
        startCountdown(15);
    }

    public void startCountdown(int secs) {
        timerVal = secs;
        setCountdownText(timerVal);

        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                if(timerVal <= 1)
                    this.cancel();

                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        decrementTimer(1);
                    }
                });
            }
        }, 1000, 1000);
    }

    private void decrementTimer(int secs) {
        timerVal -= secs;
        setCountdownText(timerVal);
    }

    private void setCountdownText(int timerVal) {
        countdownTextView.setText(Integer.toString(timerVal));
    }
}
