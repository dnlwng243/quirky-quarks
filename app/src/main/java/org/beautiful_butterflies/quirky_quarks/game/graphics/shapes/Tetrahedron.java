package org.beautiful_butterflies.quirky_quarks.game.graphics.shapes;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

import javax.microedition.khronos.opengles.GL10;

public class Tetrahedron {

    private FloatBuffer vertexBuffer;
    private  FloatBuffer colorBuffer;
    private ByteBuffer indexBuffer;

    private float[] vertices = { // Opt 2: (±1,0,−1/√2), (0,±1,1/√2) -> 0.707107f
            (float)( Math.sqrt(3)/3),  0.0f, 0.0f,
            (float)(-Math.sqrt(3)/6), -0.5f, 0.0f,
            (float)(-Math.sqrt(3)/6),  0.5f, 0.0f,
            0.0f,  0.0f, (float)( Math.sqrt(6)/3)
    };

    private float[] colors = { // colors of vertices in RGBA
            1.0f, 0.5f, 0.5f, 1.0f,  // 0.
            0.5f, 1.0f, 0.5f, 1.0f,  // 1.
            0.5f, 0.5f, 1.0f, 1.0f,  // 2.
            1.0f, 1.0f, 1.0f, 1.0f,  // 3.
    };

    private byte[] indices = {
            3, 0, 1,   // front face (CCW)
            3, 1, 2,   // right face
            2, 1, 0,   // back face
            2, 0, 3    // left face
    };

    public Tetrahedron() {
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
        gl.glFrontFace(GL10.GL_CCW);

        gl.glEnableClientState(GL10.GL_VERTEX_ARRAY);
        gl.glEnableClientState(GL10.GL_COLOR_ARRAY);
        gl.glVertexPointer(3, GL10.GL_FLOAT, 0, vertexBuffer);
        gl.glColorPointer(4, GL10.GL_FLOAT, 0, colorBuffer);

        gl.glDrawElements(GL10.GL_TRIANGLES, indices.length, GL10.GL_UNSIGNED_BYTE,
                indexBuffer);

        gl.glDisableClientState(GL10.GL_VERTEX_ARRAY);
        gl.glDisableClientState(GL10.GL_COLOR_ARRAY);
    }

}
