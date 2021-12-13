package com.company.Object.Figur;

import com.company.Object.Objekt;

public class Quadrat extends Objekt implements Figur{
    double seiten;

    public Quadrat(String material, double seiten) {
        super(material);
        this.seiten = seiten;
    }
    @Override
    public double getUmfang() {
        return 2 * (seiten + seiten);
    }

    @Override
    public double getFlaeche() {
        return seiten * seiten;
    }
}
