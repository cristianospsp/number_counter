package com.robertHalf.src.app;

public class ChallengeOne {

    public static void main(String[] args) {

        for (int i = 1; i <= 20; i++) {
            // by both 3 and 5
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("C");
            }
            // by 3
            else if (i % 3 == 0) {
                System.out.println("A");
            }
            // by 5
            else if (i % 5 == 0) {
                System.out.println("B");
            }
            else {
                System.out.println(i);
            }
        }
    }

}
