package com.company.Object.Koerper;

import com.company.Object.Objekt;

public class Kugel extends Objekt implements Koerper{
    double radius;

    public Kugel(String material, double radius) {
        super(material);
        this.radius = radius;
    }

    @Override
    public double getVolumen() {
        return 4/3 * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public double getManteloberflaeche() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
}
