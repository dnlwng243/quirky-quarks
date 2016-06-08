package org.beautiful_butterflies.quirky_quarks.game.graphics.shapes;

import javax.microedition.khronos.opengles.GL10;

public class GameObject {
    float[] position;
    public float[] getPosition() {
        return position;
    }
    public void setPosition(float[] position) { System.arraycopy(position, 0, this.position, 0, 2); }

    float rotation;
    public float getRotation() {
        return rotation;
    }
    public void setRotation(float deg) {
        this.rotation = deg;
    }

    public void draw(GL10 gl) {};
}
