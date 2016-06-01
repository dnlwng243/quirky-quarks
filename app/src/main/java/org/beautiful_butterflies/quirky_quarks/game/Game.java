package org.beautiful_butterflies.quirky_quarks.game;

import android.graphics.Point;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.beautiful_butterflies.quirky_quarks.R;
import org.beautiful_butterflies.quirky_quarks.game.graphics.MyGLSurfaceView;

import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;

public class Game extends AppCompatActivity {

    /* VARIABLES */
    TextView clock;
    RelativeLayout.LayoutParams clockTopLayout;
    RelativeLayout.LayoutParams clockCenterLayout;

    Handler handler;
    Timer timer;
    int timerVal;

    ImageView background;

    ImageButton pauseBtn, recipeBtn;
    ImageButton pseudoscalarMesonBtn, vectorMesonBtn;
    ImageButton isospinBaryonOctetBtn, isospinBaryonDecupletBtn;

    GLSurfaceView drawView;

    HashMap<String, View> views;
    /* VARIABLES END */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set fullscreen
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        // Prepare UI components
        setContentView(R.layout.activity_game);
        views = new HashMap<>();
        defineViews();
        defineButtons();
        defineUtilityButtons();

        // Initialize timer/handler pair
        timer = new Timer(true);
        handler = new Handler(Looper.getMainLooper());

        // Assume stage 5 metastatic cancer
        setViewState("load");
        countdownToGame(5);
    }

    private void defineViews() {
        background = (ImageView) findViewById(R.id.background);
        drawView = (MyGLSurfaceView) findViewById(R.id.drawView);
        clock = (TextView) findViewById(R.id.countdownTextView);

        views.put("background", background);
        views.put("canvas", drawView);
        views.put("clock", clock);

        clockTopLayout = (RelativeLayout.LayoutParams) clock.getLayoutParams();
        clockCenterLayout = clockTopLayout;
        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        clockCenterLayout.height -= size.y/2;
    }

    private void defineButtons() {
        pauseBtn = (ImageButton) findViewById(R.id.pauseButton);
        recipeBtn = (ImageButton) findViewById(R.id.recipeButton);

        pauseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Go to pause menu TODO
            }
        });
        recipeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Go to standard model TODO
            }
        });

        views.put("pause", pauseBtn);
        views.put("recipe", recipeBtn);
    }

    private void defineUtilityButtons() {
        pseudoscalarMesonBtn = (ImageButton) findViewById(R.id.pseudoscalarMesonButton);
        vectorMesonBtn = (ImageButton) findViewById(R.id.vectorMesonButton);
        isospinBaryonOctetBtn = (ImageButton) findViewById(R.id.isospinBaryonOctetButton);
        isospinBaryonDecupletBtn = (ImageButton) findViewById(R.id.isospinBaryonDecupletButton);

        pseudoscalarMesonBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Go to meson1 chooser TODO
            }
        });
        vectorMesonBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Go to meson2 chooser TODO
            }
        });
        isospinBaryonOctetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Go to baryon1 chooser TODO
            }
        });
        isospinBaryonDecupletBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Go to baryon2 chooser TODO
            }
        });

        views.put("meson1", pseudoscalarMesonBtn);
        views.put("meson2", vectorMesonBtn);
        views.put("baryon1", isospinBaryonOctetBtn);
        views.put("baryon2", isospinBaryonDecupletBtn);
    }

    private void setViewState(String stateName) {
        switch(stateName) {
            case "load":
                setVisibleViews(new String[]{
                        "background",
                        "clock",
                        "pause"
                });
                clock.setLayoutParams(clockCenterLayout);
                break;
            case "game":
                setVisibleViews(new String[]{
                        "canvas",
                        "pause",
                        "meson1",
                        "meson2",
                        "baryon1",
                        "baryon2",
                        "recipe"
                });
                clock.setLayoutParams(clockTopLayout);
                break;
        }
    }

    private void setVisibleViews(String[] visibleViews) {
        for(String key : views.keySet()) {
            boolean isContained = false;
            for(String v : visibleViews)
                if(key.equals(v))
                    isContained = true;
            if (isContained)
                views.get(key).setVisibility(View.VISIBLE);
            else
                views.get(key).setVisibility(View.INVISIBLE);
        }
    }

    private void countdownToGame(int secs) {
        timerVal = secs;

        timer.cancel();
        timer.purge();

        timer = new Timer(true);
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        if(timerVal > 0)
                            clock.setText("Starting in " + timerVal + "s ...");
                        timerVal--;
                    }
                });

                if(timerVal <= 0) {
                    this.cancel();
                    handler.post(new Runnable() {
                        @Override
                        public void run() {
                            startNewGame();
                        }
                    });
                }
            }
        }, 0, 1000);
    }

    private void startNewGame() {
        /* Game Init */
        setViewState("game");
        clock.setTextSize(20f);

        /* Game Logiks */
        // TODO
    }
}
