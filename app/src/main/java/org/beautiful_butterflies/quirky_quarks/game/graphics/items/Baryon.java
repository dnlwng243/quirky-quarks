package org.beautiful_butterflies.quirky_quarks.game.graphics.items;

import org.beautiful_butterflies.quirky_quarks.game.graphics.shapes.Triangle;

public class Baryon extends Triangle {

    static final float massSizeRatio = 0.05f; // TODO temp unused

    float[] velocity;

    static float[][] quarkColors = {
            {1.00f, 0.65f, 0.00f, 1.0f}, // 0. Up
            {1.00f, 0.00f, 0.00f, 1.0f}, // 1. Down
            {0.00f, 0.75f, 1.00f, 1.0f}, // 2. Charm
            {0.00f, 0.00f, 0.50f, 1.0f}, // 3. Strange
            {0.20f, 0.80f, 0.20f, 1.0f}, // 4. Top
            {0.00f, 0.39f, 0.00f, 1.0f}, // 5. Bottom
    };

    int[] quarks;
    float spin, charge, mass;

    public Baryon(float[] pos, float[] vel, int[] quarks) {
        super(0.04f, pos[0], pos[1]);

        setVelocity(vel);

        setQuarks(quarks);
        for(int i = 0; i < 3; i++)
            setColors(i, quarkColors[quarks[i]]);

        loadProperties(quarks);
    }

    private void loadProperties(int[] quarks) {
        // TODO: Create database class
    }

    public float[] getVelocity() {
        return velocity;
    }

    public void setVelocity(float[] vel) {
        this.velocity = new float[vel.length];
        System.arraycopy(vel, 0, this.velocity, 0, vel.length);
    }

    public int[] getQuarks() {
        return quarks;
    }

    public void setQuarks(int[] quarks) {
        this.quarks = new int[quarks.length];
        System.arraycopy(quarks, 0, this.quarks, 0, quarks.length);
    }
}
