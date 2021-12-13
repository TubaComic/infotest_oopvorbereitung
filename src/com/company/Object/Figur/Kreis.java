package com.company.Object.Figur;

import com.company.Object.Objekt;

public class Kreis extends Objekt implements Figur {
    double radius;

    public Kreis(String material, double radius) {
        super(material);
        this.radius = radius;
    }

    @Override
    public double getUmfang() {
        return radius * 2 * Math.PI;
    }

    @Override
    public double getFlaeche() {
        return radius * radius * Math.PI;
    }
}
