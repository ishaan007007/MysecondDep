package org.example;

public class HaltOrWait {

    public static void Halt() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}