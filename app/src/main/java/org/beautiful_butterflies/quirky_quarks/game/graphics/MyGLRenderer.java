package org.beautiful_butterflies.quirky_quarks.game.graphics;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.opengl.GLU;

import org.beautiful_butterflies.quirky_quarks.game.graphics.shapes.Tetrahedron;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public class MyGLRenderer implements GLSurfaceView.Renderer {
    Context context;

    String state;

    private Tetrahedron tetra;
    float tetraDist;
    float tetraRotation;

    public MyGLRenderer(Context context) {
        this.context = context;

        setState("blank");

        tetra = new Tetrahedron();
        tetraDist = -1.5f;
        tetraRotation = 0;
    }

    @Override
    public void onSurfaceCreated(GL10 gl, EGLConfig config) {
        gl.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        gl.glClearDepthf(1.0f);
        gl.glEnable(GL10.GL_DEPTH_TEST);
        gl.glDepthFunc(GL10.GL_LEQUAL);
        gl.glHint(GL10.GL_PERSPECTIVE_CORRECTION_HINT, GL10.GL_NICEST);
        gl.glShadeModel(GL10.GL_SMOOTH);
        gl.glDisable(GL10.GL_DITHER);
    }

    @Override
    public void onSurfaceChanged(GL10 gl, int width, int height) {
        gl.glViewport(0, 0, width, height);

        gl.glMatrixMode(GL10.GL_PROJECTION);
        gl.glLoadIdentity();
        GLU.gluPerspective(gl, 45, (float)width / ((height == 0) ? 1 : height), 0.1f, 50.f);

        gl.glMatrixMode(GL10.GL_MODELVIEW);
        gl.glLoadIdentity();
    }

    @Override
    public void onDrawFrame(GL10 gl) {
        gl.glClear(GL10.GL_COLOR_BUFFER_BIT | GL10.GL_DEPTH_BUFFER_BIT);
        gl.glLoadIdentity();

        switch(state) {
            case "blank":
                {
                    /* SPACEFILLER */
                    break;
                }
            case "tetra":
                {
                    gl.glTranslatef(0.0f, -0.33f, tetraDist);
                    gl.glRotatef(-90.0f, 1.0f, 0.0f, 0.0f);
                    gl.glRotatef(tetraRotation, 0.0f, 0.0f, 1.0f);

                    tetra.draw(gl);
                }
                break;
        }

        // tetraRotation = (tetraRotation - 2.0f) % 360f;
    }

    public String getState() {
        return state;
    }

    public void setState(String stateName) {
        this.state = stateName;
    }

}
