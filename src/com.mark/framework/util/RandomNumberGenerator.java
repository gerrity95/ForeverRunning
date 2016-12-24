package com.mark.framework.util;

import java.util.Random;
/**
 * Created by gerrity95 on 12/12/16.
 */
public class RandomNumberGenerator {

    private static Random rand = new Random();

    public static int getRandInBetween(int lowerBound, int upperBound)
    {
        return rand.nextInt(upperBound - lowerBound) + lowerBound;
    }

    public static int getRandInt(int upperBound)
    {
        return rand.nextInt(upperBound);
    }
}
