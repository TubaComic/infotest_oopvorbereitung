package com.company.Object.Koerper;

import com.company.Object.Objekt;

public class Zylinder extends Objekt implements Koerper{
    double hoehe;
    double radius;

    public Zylinder(String material, double hoehe, double radius) {
        super(material);
        this.hoehe = hoehe;
        this.radius = radius;
    }

    @Override
    public double getVolumen() {
        double flaeche = radius * radius * Math.PI;
        return flaeche * hoehe;
    }

    @Override
    public double getManteloberflaeche() {
        return 2 * radius * Math.PI * hoehe;
    }
}
