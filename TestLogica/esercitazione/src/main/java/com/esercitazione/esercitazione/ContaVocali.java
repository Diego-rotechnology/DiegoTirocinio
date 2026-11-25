package com.esercitazione.esercitazione;

public class ContaVocali {

 public static void main(String[] args) {

        String testo = "programmazione";

        int risultato = contaVocali(testo);

        System.out.println(risultato);
    }

    // Conta quante vocali sono presenti nella stringa.
    public static int contaVocali(String testo) {

        int conteggio = 0;

        // Controlla ogni carattere della stringa.
        for (int i = 0; i < testo.length(); i++) {

            char carattere = testo.charAt(i);

            // Verifica se il carattere è una vocale.
            if (carattere == 'a' || carattere == 'e' ||
                carattere == 'i' || carattere == 'o' ||
                carattere == 'u') {

                conteggio++;
            }
        }

        return conteggio;
    }
}
