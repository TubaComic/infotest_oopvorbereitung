package com.company;

import com.company.Object.Figur.*;
import com.company.Object.Koerper.*;
import com.company.Object.Objekt;

import java.util.Arrays;

import java.util.List;
import java.util.TreeSet;

public class Main {


    public static void main(String[] args) {
        TreeSet<Objekt> t1 = new TreeSet<>();

        Kreis kreis = new Kreis("Holz", 20);
        Kugel kugel = new Kugel("Metall", 10);
        Rechteck rechteck = new Rechteck("Holz", 10, 20);
        Quadrat quadrat = new Quadrat("Holz", 20);
        Zylinder zylinder = new Zylinder("Metall", 25, 35);

        t1.add(kreis);
        t1.add(kugel);
        t1.add(rechteck);
        t1.add(quadrat);
        t1.add(zylinder);

        t1.forEach(a -> System.out.println(a.getMaterial()));


        List<Integer> number = Arrays.asList(2,3,4,5,3);

        System.out.println(number.parallelStream().map(x -> x * x).filter(x -> x != 9).reduce(Integer::sum).get());

        number.forEach(System.out::println);

        number = number.stream().map(Test::power).filter(Test::not_nine).toList();

        number.forEach(System.out::println);

    }
}
