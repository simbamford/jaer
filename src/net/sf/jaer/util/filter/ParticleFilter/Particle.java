/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.sf.jaer.util.filter.ParticleFilter;

/**
 *
 * @author minliu and hongjie
 */
import java.util.Random;

public interface Particle extends Cloneable {
	public Particle clone();
	public void addNoise(Random r, double spread);
}
