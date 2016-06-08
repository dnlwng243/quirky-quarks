package org.beautiful_butterflies.quirky_quarks.game.graphics.items;

import org.beautiful_butterflies.quirky_quarks.game.graphics.shapes.Triangle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

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

    long randID;

    public Baryon(float[] pos, float[] vel, int[] quarks) {
        super(0.04f, pos[0], pos[1]);

        setVelocity(vel);

        setQuarks(quarks);
        for(int i = 0; i < 3; i++)
            setColors(i, quarkColors[quarks[i]]);

        loadProperties(quarks);

        randID = (new Random()).nextLong();
    }

    private void loadProperties(int[] quarks) {
        int[][] baryonArray = {
                {0, 0, 0},
                {1, 0, 0},
                {1, 1, 0},
                {1, 1, 1}
        };
        float[] massArray = {
                1232,
                938,
                940,
                1232
        };

        boolean found = false;
        int currIndex = 0;

        while(!found && currIndex < baryonArray.length) {
            if(isReorderedArray(quarks, baryonArray[currIndex])) {
                if(currIndex == 0 || currIndex == 3)
                    spin = 3f/2f;
                else spin = 1f/2f;
                mass = massArray[currIndex] * 1.78266191e-30f;
                charge = findCharge(quarks);

                found = true;
            }
            else currIndex++;
        }

        if(!found) {
            // default to neutron
            spin = 1f/2f;
            mass = 940;
            charge = 0;
        }
    }

    private float findCharge(int[] quarkArray) {
        float[] quarkCharges = {+2, -1, +2, -1, +2, -1};

        float totalCharge = 0.0f;
        for(int quarkID : quarkArray)
            totalCharge += quarkCharges[quarkID];

        return totalCharge/3;
    }

    private boolean isReorderedArray(int[] orig, int[] target) {
        ArrayList<Integer> origList = new ArrayList<>();
        ArrayList<Integer> targetList = new ArrayList<>();

        for(int i = 0; i < 3; i++) {
            origList.add(orig[i]);
            targetList.add(target[i]);
        }

        Collections.sort(origList);
        Collections.sort(targetList);

        return origList.equals(targetList);
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

    public float getSpin() {
        return spin;
    }

    public float getCharge() {
        return charge;
    }

    public float getMass() {
        return mass;
    }
}
