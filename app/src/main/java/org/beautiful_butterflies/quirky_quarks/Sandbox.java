package org.beautiful_butterflies.quirky_quarks;

import android.app.Activity;

import android.media.Image;
import android.os.Bundle;
        import android.view.MotionEvent;
        import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;

public class Sandbox extends Activity {

    int windowwidth;
    int windowheight;
    Button resetButton;
    Button combineButton;
    private LayoutParams layoutParams;
    ImageView proton;
    ImageView neutron;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sandbox);

        windowwidth = getWindowManager().getDefaultDisplay().getWidth();
        windowheight = getWindowManager().getDefaultDisplay().getHeight();
        final ImageView upQuark1 = (ImageView) findViewById(R.id.upQuark1);
        final ImageView upQuark2 = (ImageView) findViewById(R.id.upQuark2);
        final ImageView downQuark1 = (ImageView) findViewById(R.id.downQuark1);
        final ImageView downQuark2 = (ImageView) findViewById(R.id.downQuark2);
        final ImageView electron = (ImageView) findViewById(R.id.electron);

        upQuark1.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                LayoutParams layoutParams = (LayoutParams) upQuark1
                        .getLayoutParams();
                int x_cord;
                int y_cord;
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        break;
                    case MotionEvent.ACTION_MOVE:
                        x_cord = (int) event.getRawX();
                        y_cord = (int) event.getRawY();

                        if (x_cord > windowwidth) {
                            x_cord = windowwidth;
                        }
                        if (y_cord > windowheight) {
                            y_cord = windowheight;
                        }

                        layoutParams.leftMargin = x_cord;
                        layoutParams.topMargin = y_cord;

                        upQuark1.setLayoutParams(layoutParams);
                        break;
                    default:
                        break;
                }
                return true;
            }
        });
        upQuark2.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                LayoutParams layoutParams = (LayoutParams) upQuark2
                        .getLayoutParams();
                int x_cord;
                int y_cord;
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        break;
                    case MotionEvent.ACTION_MOVE:
                        x_cord = (int) event.getRawX();
                        y_cord = (int) event.getRawY();

                        if (x_cord > windowwidth) {
                            x_cord = windowwidth;
                        }
                        if (y_cord > windowheight) {
                            y_cord = windowheight;
                        }

                        layoutParams.leftMargin = x_cord;
                        layoutParams.topMargin = y_cord;

                        upQuark2.setLayoutParams(layoutParams);
                        break;
                    default:
                        break;
                }
                return true;
            }
        });
        downQuark1.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                LayoutParams layoutParams = (LayoutParams) downQuark1
                        .getLayoutParams();
                int x_cord;
                int y_cord;
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        break;
                    case MotionEvent.ACTION_MOVE:
                        x_cord = (int) event.getRawX();
                        y_cord = (int) event.getRawY();

                        if (x_cord > windowwidth) {
                            x_cord = windowwidth;
                        }
                        if (y_cord > windowheight) {
                            y_cord = windowheight;
                        }

                        layoutParams.leftMargin = x_cord;
                        layoutParams.topMargin = y_cord;

                        downQuark1.setLayoutParams(layoutParams);
                        break;
                    default:
                        break;
                }
                return true;
            }
        });

        downQuark2.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                LayoutParams layoutParams = (LayoutParams) downQuark2
                        .getLayoutParams();
                int x_cord;
                int y_cord;
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        break;
                    case MotionEvent.ACTION_MOVE:
                        x_cord = (int) event.getRawX();
                        y_cord = (int) event.getRawY();

                        if (x_cord > windowwidth) {
                            x_cord = windowwidth;
                        }
                        if (y_cord > windowheight) {
                            y_cord = windowheight;
                        }

                        layoutParams.leftMargin = x_cord;
                        layoutParams.topMargin = y_cord;

                        downQuark2.setLayoutParams(layoutParams);
                        break;
                    default:
                        break;
                }
                return true;
            }
        });
        electron.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                LayoutParams layoutParams = (LayoutParams) electron
                        .getLayoutParams();
                int x_cord;
                int y_cord;
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        break;
                    case MotionEvent.ACTION_MOVE:
                        x_cord = (int) event.getRawX();
                        y_cord = (int) event.getRawY();

                        if (x_cord > windowwidth) {
                            x_cord = windowwidth;
                        }
                        if (y_cord > windowheight) {
                            y_cord = windowheight;
                        }

                        layoutParams.leftMargin = x_cord;
                        layoutParams.topMargin = y_cord;

                        electron.setLayoutParams(layoutParams);
                        break;
                    default:
                        break;
                }
                return true;
            }
        });

        resetButton = (Button) findViewById(R.id.resetButton);
        combineButton = (Button) findViewById(R.id.combineButton);
        proton = (ImageView) findViewById(R.id.proton);
        neutron = (ImageView) findViewById(R.id.neutron);

        combineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proton.setVisibility(View.GONE);
                neutron.setVisibility(View.GONE);
                int upQuark1X = (int) upQuark1.getX();
                int upQuark1Y = (int) upQuark1.getY();
                int upQuark2X = (int) upQuark2.getX();
                int upQuark2Y = (int) upQuark2.getY();
                int downQuark1X = (int) downQuark1.getX();
                int downQuark1Y = (int) downQuark1.getY();
                int downQuark2X = (int) downQuark2.getX();
                int downQuark2Y = (int) downQuark2.getY();
                int electronX = (int) electron.getX();
                int electronY = (int) electron.getY();
                if (upQuark1X > 216 && upQuark1X < 648 && upQuark1Y > 480 && upQuark1Y < 925 &&
                        upQuark2X > 216 && upQuark2X < 648 && upQuark2Y > 480 && upQuark2Y < 925
                        && downQuark1X > 216 && downQuark1X < 648 && downQuark1Y > 480 &&
                        downQuark1Y < 925) {
                    proton.setVisibility(View.VISIBLE);
                    upQuark1.setVisibility(View.GONE);
                    upQuark2.setVisibility(View.GONE);
                    downQuark1.setVisibility(View.GONE);
                }
                if (upQuark1X > 216 && upQuark1X < 648 && upQuark1Y > 480 && upQuark1Y < 925 &&
                        upQuark2X > 216 && upQuark2X < 648 && upQuark2Y > 480 && upQuark2Y < 925
                        && downQuark2X > 216 && downQuark2X < 648 && downQuark2Y > 480 &&
                        downQuark2Y < 925) {
                    proton.setVisibility(View.VISIBLE);
                    upQuark1.setVisibility(View.GONE);
                    upQuark2.setVisibility(View.GONE);
                    downQuark2.setVisibility(View.GONE);
                }
                if (downQuark1X > 216 && downQuark1X < 648 && downQuark1Y > 480 && downQuark1Y <
                        925 &&
                        downQuark2X > 216 && downQuark2X < 648 && downQuark2Y > 480 && downQuark2Y <
                        925
                        && upQuark1X > 216 && upQuark1X < 648 && upQuark1Y > 480 &&
                        upQuark1Y < 925) {
                    neutron.setVisibility(View.VISIBLE);
                    downQuark1.setVisibility(View.GONE);
                    downQuark2.setVisibility(View.GONE);
                    upQuark1.setVisibility(View.GONE);
                }
                if (downQuark1X > 216 && downQuark1X < 648 && downQuark1Y > 480 && downQuark1Y <
                        925 &&
                        downQuark2X > 216 && downQuark2X < 648 && downQuark2Y > 480 && downQuark2Y <
                        925
                        && upQuark2X > 216 && upQuark2X < 648 && upQuark2Y > 480 &&
                        upQuark2Y < 925) {
                    neutron.setVisibility(View.VISIBLE);
                    downQuark1.setVisibility(View.GONE);
                    downQuark2.setVisibility(View.GONE);
                    upQuark2.setVisibility(View.GONE);
                }
            }
        });

        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                startActivity(getIntent());
            }
        });

    }
}