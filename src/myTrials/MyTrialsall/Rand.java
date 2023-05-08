package myTrials.MyTrialsall;

import java.util.Random;

public class Rand {
    public static void main(String[] args) {
        Random random = new Random();
        int rand = random.nextInt(76,101);
        System.out.println(rand);
        int ja = random.nextInt(30,70);
        System.out.println(ja);
    }
}
