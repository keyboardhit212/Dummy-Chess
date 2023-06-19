package com.dummychess.screen;

public final class Screen {

    private Screen() {}

    public static void pause() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }
    }

    public static void clear() {
        System.out.println("\033\143");
    }
}
