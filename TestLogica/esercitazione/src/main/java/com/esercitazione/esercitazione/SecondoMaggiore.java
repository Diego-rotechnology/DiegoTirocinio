package com.esercitazione.esercitazione;

import java.util.Arrays;

public class SecondoMaggiore {

    public static void main(String[] args) {

        int[] a = {1, 3, 2};

        Arrays.sort(a);

        int risultato = a[a.length - 2];

        System.out.println("Array ordinato: " + Arrays.toString(a));
        System.out.println("Secondo maggiore: " + risultato);
    }
}