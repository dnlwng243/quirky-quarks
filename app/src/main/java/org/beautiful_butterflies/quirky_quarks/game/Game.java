package org.beautiful_butterflies.quirky_quarks.game;

import android.content.Intent;
import android.graphics.Point;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.beautiful_butterflies.quirky_quarks.MainActivity;
import org.beautiful_butterflies.quirky_quarks.R;
import org.beautiful_butterflies.quirky_quarks.StandardModel;
import org.beautiful_butterflies.quirky_quarks.game.graphics.MyGLSurfaceView;
import org.beautiful_butterflies.quirky_quarks.game.graphics.shapes.GameObject;
import org.beautiful_butterflies.quirky_quarks.game.graphics.shapes.Triangle;

import java.util.ArrayList;
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

    MyGLSurfaceView drawView;

    HashMap<String, View> views;
    /* VARIABLES END */

    /* WORKINGSET VARIABLES */
    ArrayList<GameObject> gameObjects;
    /* WORKINGSET VARIABLES END */

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
        countdownToGame(1);

        // Initialize game-related instance variables
        gameObjects = new ArrayList<>();
        loadGameObjects();
    }

    private void loadGameObjects() {
        for(float y = -0.8f; y <= 1.0; y+= 0.1)
            for(float x = -1.4f; x <= 1.4; x+= 0.1)
                gameObjects.add(new Triangle(0.02f, x, y));
    }

    private void defineViews() {
        background = (ImageView) findViewById(R.id.background);
        drawView = (MyGLSurfaceView) findViewById(R.id.drawView);
        clock = (TextView) findViewById(R.id.countdownTextView);

        views.put("background", background);
        views.put("canvas", drawView);
        views.put("clock", clock);

        clockTopLayout = (RelativeLayout.LayoutParams) clock.getLayoutParams();
        clockCenterLayout = new RelativeLayout.LayoutParams(clockTopLayout);
        Point size = new Point();
        getWindowManager().getDefaultDisplay().getSize(size);
        clockCenterLayout.height -= size.y/2;
    }

    private void defineButtons() {
        pauseBtn = (ImageButton) findViewById(R.id.pauseButton);
        recipeBtn = (ImageButton) findViewById(R.id.recipeButton);

        pauseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Game.this, MainActivity.class));
            }
        });
        recipeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Game.this, StandardModel.class));
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
                drawView.getRenderer().setState("tetra");
            }
        });
        vectorMesonBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawView.getRenderer().setState("tetra");
            }
        });
        isospinBaryonOctetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawView.getRenderer().setState("tetra");
            }
        });
        isospinBaryonDecupletBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawView.getRenderer().setState("tetra");
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
                // TODO: Not working
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
        for(int turn = 1; turn <= 20; turn++) {
            //TODO
            drawView.getRenderer().updateGameObjects(gameObjects);
            drawView.requestRender();
        }
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK){
            if(!drawView.getRenderer().getState().equals("blank"))
                drawView.getRenderer().setState("blank");
            else super.onKeyDown(keyCode, event);
        }
        return true;
    }
}
