package org.beautiful_butterflies.quirky_quarks.game.graphics;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class MyGLSurfaceView extends GLSurfaceView {
    MyGLRenderer renderer;

    public MyGLSurfaceView(Context context, AttributeSet attrs) {
        super(context, attrs);

        renderer = new MyGLRenderer(context);
        this.setRenderer(renderer);

        this.requestFocus();
        this.setFocusable(true);
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

                renderer.tetraRotation = (renderer.tetraRotation + dx/8) % 360f;

                renderer.tetraDist += dy/1000;
                if(renderer.tetraDist > -1.4f)
                    renderer.tetraDist = -1.4f;
                else if(renderer.tetraDist < -2.0f)
                    renderer.tetraDist = -2.0f;

                renderer.x += dx/1000;
                renderer.y -= dy/1000;

                requestRender();
                break;
            }
        }

        mLastTouchX = x;
        mLastTouchY = y;

        return true;
    }

    public MyGLRenderer getRenderer() {
        return renderer;
    }
}