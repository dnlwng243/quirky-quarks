package org.beautiful_butterflies.quirky_quarks.game.graphics;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.view.MotionEvent;

public class MyGLSurfaceView extends GLSurfaceView {
    MyGLRenderer renderer;

    public MyGLSurfaceView(Context context) {
        super(context);

        renderer = new MyGLRenderer(context);
        this.setRenderer(renderer);

        this.requestFocus();
        this.setFocusableInTouchMode(true);
    }

    private float mLastTouchX;
    private float mLastTouchY;

    @Override
    public boolean onTouchEvent(final MotionEvent evt) {
        final int action = evt.getAction();
        final float x = evt.getX();
        final float y = evt.getY();

        switch (action) {
            case MotionEvent.ACTION_MOVE: {
                final float dx = x - mLastTouchX;
                final float dy = y - mLastTouchY;

                renderer.objRotation = (renderer.objRotation + dx/8) % 360f;

                renderer.posZ += dy/1000;
                if(renderer.posZ > -1.4f)
                    renderer.posZ = -1.4f;
                else if(renderer.posZ < -2.0f)
                    renderer.posZ = -2.0f;

                requestRender();
                break;
            }
        }

        mLastTouchX = x;
        mLastTouchY = y;

        return true;
    }
}