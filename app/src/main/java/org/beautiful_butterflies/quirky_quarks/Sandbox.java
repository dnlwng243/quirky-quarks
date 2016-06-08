package org.beautiful_butterflies.quirky_quarks;

import android.app.Activity;

import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
        import android.view.MotionEvent;
        import android.view.View;
        import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;

        import android.graphics.Bitmap;
        import android.graphics.Canvas;
        import android.graphics.Color;
        import android.graphics.Paint;

public class Sandbox extends Activity {

    int windowwidth;
    int windowheight;

    private LayoutParams layoutParams;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sandbox);

        Paint paint = new Paint();
        paint.setColor(Color.parseColor("#FFFFFF"));
        Bitmap bg = Bitmap.createBitmap(600,600,Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bg);
        canvas.drawRect(100,200,400,400,paint);
        RelativeLayout ll = (RelativeLayout) findViewById(R.id.draw_area);
        ll.setBackgroundDrawable(new BitmapDrawable(bg));


        windowwidth = getWindowManager().getDefaultDisplay().getWidth();
        windowheight = getWindowManager().getDefaultDisplay().getHeight();
        final ImageView img = (ImageView) findViewById(R.id.imageView1);
        final ImageView img2 = (ImageView) findViewById(R.id.imageView2);
        final ImageView img3 = (ImageView) findViewById(R.id.imageView3);
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
        img2.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                LayoutParams layoutParams = (LayoutParams) img2
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

                        img2.setLayoutParams(layoutParams);
                        break;
                    default:
                        break;
                }
                return true;
            }
        });
        img3.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                LayoutParams layoutParams = (LayoutParams) img3
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

                        img3.setLayoutParams(layoutParams);
                        break;
                    default:
                        break;
                }
                return true;
            }
        });
    }
}