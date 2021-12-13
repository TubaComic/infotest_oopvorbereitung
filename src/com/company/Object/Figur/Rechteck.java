package com.company.Object.Figur;

import com.company.Object.Figur.Figur;
import com.company.Object.Figur.Kreis;
import com.company.Object.Objekt;

public class Rechteck extends Objekt implements Figur {
    double hoehe;
    double seiten;

    public Rechteck(String material, double hoehe, double seiten) {
        super(material);
        this.hoehe = hoehe;
        this.seiten = seiten;
    }


    @Override
    public double getUmfang() {
        return 2 * (hoehe + seiten);
    }

    @Override
    public double getFlaeche() {
        return hoehe * seiten;
    }
}
