package com.esercitazione.esercitazione;

public class MaggioreDiZero {

     public static void main(String[] args) {

        int[] numeri = {5, 8, 3, 2, 9};
//int[] numeri = {5, 8, -3, 2, 9}; false
        boolean tuttiPositivi = true;

        for (int i = 0; i < numeri.length; i++) {

            if (numeri[i] <= 0) {

                tuttiPositivi = false;
                break; // Interrompe il ciclo
            }
        }

        System.out.println(tuttiPositivi);
    }
}
