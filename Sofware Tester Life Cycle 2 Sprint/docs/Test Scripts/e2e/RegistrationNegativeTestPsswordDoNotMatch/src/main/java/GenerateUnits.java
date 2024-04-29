package utils;

import java.util.Random;

public class GenerateUnits {
    public static String generateRandomEmail() {
        Random randomGenerator = new Random();
        return randomGenerator.nextInt(1000) + "vardas@one.lt";

    }
    public static String generateRandomPass() {
        Random randomGenerator = new Random();
        return randomGenerator.nextInt(1000) + "Vvv@1986.";

    }

    public static String generateRandomProjectName() {
        Random randomGenerator = new Random();
        return randomGenerator.nextInt(1500) + "Mano vardas Antanas Jonas Petraitis  32554898.!@1896 ";

    }

    public static String generateRandomProjectDescription() {
        Random randomGenerator = new Random();
        return randomGenerator.nextInt(2000) + "Pasak vienos populiarios nuomonės, naujam įpročiui susiformuoti reikia 21 dienos. Tačiau specialistai sako, jog vieni žmonės pasikeičia ir per trumpesnį laiką, o kitiems tai trunka gerokai ilgiau. Ar jus tai turėtų gąsdinti?";

    }
}
