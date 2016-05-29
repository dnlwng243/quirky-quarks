package org.beautiful_butterflies.quirky_quarks.game;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class GameBackground extends View {
    Paint p;

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        p = new Paint(Paint.ANTI_ALIAS_FLAG);
        p.setColor(Color.YELLOW); //TODO
    }

    public GameBackground(Context context) {
        super(context);
    }
}