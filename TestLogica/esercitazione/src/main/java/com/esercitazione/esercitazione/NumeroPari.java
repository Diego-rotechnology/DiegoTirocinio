package com.esercitazione.esercitazione;

public class NumeroPari {

    public static void main(String[] args) {

        int[] numeri = {5, 7, 9, 12, 15};

        boolean contienePari = false;

        for (int i = 0; i < numeri.length; i++) {

            if (numeri[i] % 2 == 0) {
                contienePari = true;
                break;
            }
        }

        System.out.println(contienePari);
    }
}
