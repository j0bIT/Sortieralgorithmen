package com.pohlmann;

import java.util.concurrent.Callable;

public class Tools {

    public static void measureTime(Callable function) throws Exception {
        long startTime = System.nanoTime();
        function.call();
        long endTime = System.nanoTime();
        float totalTime = (float) (endTime - startTime) / 1000000000;
        System.out.println("Time: " + totalTime + " Seconds");
    }

}
