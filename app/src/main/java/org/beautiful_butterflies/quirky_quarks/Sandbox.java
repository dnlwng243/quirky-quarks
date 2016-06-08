package org.beautiful_butterflies.quirky_quarks;

import android.app.Activity;

        import android.os.Bundle;
        import android.view.MotionEvent;
        import android.view.View;
        import android.widget.ImageView;
        import android.widget.LinearLayout.LayoutParams;



public class Sandbox extends Activity {

    int windowwidth;
    int windowheight;

    private LayoutParams layoutParams;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sandbox);

        windowwidth = getWindowManager().getDefaultDisplay().getWidth();
        windowheight = getWindowManager().getDefaultDisplay().getHeight();
        final ImageView img = (ImageView) findViewById(R.id.imageView1);

        img.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                LayoutParams layoutParams = (LayoutParams) img
                        .getLayoutParams();
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        break;
                    case MotionEvent.ACTION_MOVE:
                        int x_cord = (int) event.getRawX();
                        int y_cord = (int) event.getRawY();

                        if (x_cord > windowwidth) {
                            x_cord = windowwidth;
                        }
                        if (y_cord > windowheight) {
                            y_cord = windowheight;
                        }

                        layoutParams.leftMargin = x_cord - 25;
                        layoutParams.topMargin = y_cord - 75;

                        img.setLayoutParams(layoutParams);
                        break;
                    default:
                        break;
                }
                return true;
            }
        });
    }
}