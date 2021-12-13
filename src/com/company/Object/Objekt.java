package com.company.Object;

public abstract class Objekt implements Comparable<Objekt>{
    private final String material;

    @Override
    public int compareTo(Objekt o) {
        return material.compareTo(o.material);
    }

    protected Objekt(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }
}
