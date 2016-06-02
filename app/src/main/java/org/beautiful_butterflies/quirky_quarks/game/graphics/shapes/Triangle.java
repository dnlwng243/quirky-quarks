package org.beautiful_butterflies.quirky_quarks.game.graphics.shapes;

import android.graphics.PointF;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

import javax.microedition.khronos.opengles.GL10;

public class Triangle extends GameObject {
    private FloatBuffer vertexBuffer;
    private FloatBuffer colorBuffer;
    private ByteBuffer indexBuffer;

    private float[] vertices = {
            0.0f,  1.0f, 0.0f, // 0. top
            -1.0f, -1.0f, 0.0f, // 1. left-bottom
            1.0f, -1.0f, 0.0f  // 2. right-bottom
    };

    private byte[] indices = { 0, 1, 2 };

    private float[] colors = {
            0.0f, 0.0f, 0.0f, 1.0f, // 0. Black
            1.0f, 1.0f, 1.0f, 1.0f, // 1. White
            0.0f, 0.0f, 1.0f, 1.0f  // 2. Blue
    };

    public Triangle() {
        position = new PointF(0, 0);
        initializeBuffers();
    }

    public Triangle(float scale, float x, float y) {
        position = new PointF(x, y);

        for(int i = 0; i < vertices.length; i++)
            vertices[i] *= scale;

        initializeBuffers();
    }

    private void initializeBuffers() {
        ByteBuffer vbb = ByteBuffer.allocateDirect(vertices.length * 4);
        vbb.order(ByteOrder.nativeOrder());
        vertexBuffer = vbb.asFloatBuffer();
        vertexBuffer.put(vertices);
        vertexBuffer.position(0);

        ByteBuffer cbb = ByteBuffer.allocateDirect(colors.length * 4);
        cbb.order(ByteOrder.nativeOrder());
        colorBuffer = cbb.asFloatBuffer();
        colorBuffer.put(colors);
        colorBuffer.position(0);

        indexBuffer = ByteBuffer.allocateDirect(indices.length);
        indexBuffer.put(indices);
        indexBuffer.position(0);
    }

    public void draw(GL10 gl) {
        gl.glEnableClientState(GL10.GL_VERTEX_ARRAY);
        gl.glEnableClientState(GL10.GL_COLOR_ARRAY);
        gl.glVertexPointer(3, GL10.GL_FLOAT, 0, vertexBuffer);
        gl.glColorPointer(4, GL10.GL_FLOAT, 0, colorBuffer);

        gl.glDrawElements(GL10.GL_TRIANGLES, indices.length, GL10.GL_UNSIGNED_BYTE, indexBuffer);

        gl.glDisableClientState(GL10.GL_VERTEX_ARRAY);
        gl.glDisableClientState(GL10.GL_COLOR_ARRAY);
    }

}