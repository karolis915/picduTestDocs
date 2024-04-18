package utils;

import java.util.Random;

public class GenerateUnits {
    public static String generateRandomEmail() {
        Random randomGenerator = new Random();
        return randomGenerator.nextInt(1000) + "vardas@one.lt";

    }
  /*  public static String generateRandomPass() {
        Random randomGenerator = new Random();
        return randomGenerator.nextInt(1000) + "vvV@1986";

    } */
}
