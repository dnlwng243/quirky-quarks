package org.beautiful_butterflies.quirky_quarks.game;

import org.beautiful_butterflies.quirky_quarks.game.graphics.items.Baryon;
import org.beautiful_butterflies.quirky_quarks.game.graphics.shapes.GameObject;

import java.util.ArrayList;
import java.util.List;

public class ParticleSet {

    // Simulation settings
    public final float FRAMELENGTH = 0.6f;
    public final float G = 6.67408e-11f;
    // Static object declarations
    private List<Baryon> particles;
    private List<Baryon> particleWorkset;
    // Graphics trace history

    public ParticleSet(List<Baryon> particleList) {
        particles = new ArrayList<>();
        for(GameObject g : particleList)
            particles.add((Baryon) g);

        particleWorkset = new ArrayList<>(particles);
    }

    public void update() {
        particleWorkset = new ArrayList<Baryon>(particles);

        for (int i = 0; i <= particleWorkset.size() - 2; i++) {
            for (int j = i + 1; j <= particleWorkset.size() - 1; j++) {
                adjustVelocity(particleWorkset.get(i), particleWorkset.get(j));
                adjustVelocity(particleWorkset.get(j), particleWorkset.get(i));
            }
        }

        for (Baryon p : particleWorkset)
            adjustPosition(p);
    }

    private void adjustPosition(Baryon particle) {
        for (int i = 0; i <= 1; i++) {
            particle.getPosition()[i] += (particle.getVelocity()[i] * FRAMELENGTH);
        }
    }

    private void adjustVelocity(Baryon focusParticle, Baryon periParticle) {
        float[] accelerationArray = getAccelerationArray(focusParticle, periParticle);

        for (int i = 0; i <= 1; i++) {
            focusParticle.getVelocity()[i] += (accelerationArray[i] * FRAMELENGTH);
        }

        if (getMagnitude(focusParticle.getVelocity()) > 2.998e8f) {
            diluteVelocity(focusParticle);
        }
    }

    // Adjust velocity matrix to consider approximate effects of Lorentz Force
    private void diluteVelocity(Baryon focusParticle) {

        // focusParticle.getVelocity()
        float proportionalityConstant = 2.998e8f / getMagnitude(focusParticle.getVelocity());

        for (int i = 0; i <= 1; i++) {
            focusParticle.getVelocity()[i] *= proportionalityConstant;
        }
        // ^WARNING: Possible source of gradual inaccuracy
    }

    private float[] getAccelerationArray(Baryon focusParticle, Baryon periParticle) {
        float m = focusParticle.getMass();
        float[] FGravityArray = getFGravityArray(focusParticle, periParticle);

        return new float[] { FGravityArray[0] / m, FGravityArray[1] / m};
    }

    private float[] getDisplacementMatrix(Baryon focusParticle, Baryon periParticle) {
        return new float[] { periParticle.getPosition()[0] - focusParticle.getPosition()[0],
                periParticle.getPosition()[1] - focusParticle.getPosition()[1]};
    }

    private float[] getFGravityArray(Baryon focusParticle, Baryon periParticle) {
        float m1 = focusParticle.getMass();
        float m2 = periParticle.getMass();

        float[] displacementArray = getDisplacementMatrix(focusParticle, periParticle);
        float r = getMagnitude(displacementArray);

//        float fGravityMagnitude = G * (m1 * m2) / ((float)Math.pow(r, 2));
        float fGravityMagnitude = (r < 1) ? (r) : (0); // TODO: temp strong force spring approx
        float proportionalityConstant = fGravityMagnitude / r;

        return new float[] { proportionalityConstant * displacementArray[0],
                proportionalityConstant * displacementArray[1]};
    }

    private float getMagnitude(float[] vec) {
        return (float)(Math.sqrt(Math.pow(vec[0], 2) + Math.pow(vec[1], 2)));
    }

    public List<Baryon> getParticles() {
        return particles;
    }

    public float[] averargePosition() {
        float pos[] = {0.0f, 0.0f};
        for(Baryon b : particles) {
            pos[0] += b.getPosition()[0];
            pos[1] += b.getPosition()[1];
        }
        pos[0] /= (float) particles.size();
        pos[1] /= (float) particles.size();

        return pos;
    }
}
