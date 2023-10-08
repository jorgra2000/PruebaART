/*Dada una función que inserta números aleatorios de manera uniforme entre el 1 y el 5, crear una función igual pero que
los números sean del 1 al 7 utilizando la función anterior */

import java.util.Random;

public class Problema {
    public static void main(String[] args) {
        for(int i = 0; i < 50; i++)
            System.out.println(generateRandomNumber1to7());
    }

    private static int generateRandomNumber1to5() {
        Random random = new Random();
        return random.nextInt(1,6);
    }

    public static int generateRandomNumber1to7() {
        return generateRandomNumber1to5() + (generateRandomNumber1to5() % 3);
    }
}
