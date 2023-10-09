/*Dada una función que inserta números aleatorios de manera uniforme entre el 1 y el 5, crear una función igual pero que
los números sean del 1 al 7 utilizando la función anterior */

import java.util.Random;

public class Problema {
    public static void main(String[] args) {
        int numSamples = 1000;
        int[] histogram = new int[7];

        for (int i = 0; i < numSamples; i++) {
            int randomNumber = generateRandomNumber1to7();
            histogram[randomNumber - 1]++;
        }

        System.out.println("Histograma:");
        for (int i = 0; i < histogram.length; i++) {
            System.out.println((i + 1) + ": " + histogram[i]);
        }
    }

    private static int generateRandomNumber1to5() {
        Random random = new Random();
        return random.nextInt(1,6);
    }

    public static int generateRandomNumber1to7() {
        int randomNumber1 = generateRandomNumber1to5();
        int randomNumber2 = generateRandomNumber1to5();

        int result = (randomNumber1 - 1) * 5 + randomNumber2;

        if (result <= 21) {
            return (result % 7) + 1;
        } else {
            return generateRandomNumber1to7();
        }
    }
    
}




