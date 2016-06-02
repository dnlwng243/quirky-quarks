package org.beautiful_butterflies.quirky_quarks.game.graphics.shapes;

import android.graphics.PointF;

import javax.microedition.khronos.opengles.GL10;

public class GameObject {
    PointF position;

    public PointF getPosition() {
        return position;
    }
    public void setPosition(PointF position) {this.position = position;}

    public void draw(GL10 gl) {};
}
