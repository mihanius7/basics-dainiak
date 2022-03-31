package com.belhard.cycles;

public class Task4 {

    public static void main(String[] args) {
        char ch;
        for (int i = 33; i <= 128; i++) {
            ch = (char) i;
            System.out.printf("%3d -> %-2s\t", i, ch);
            if (i % 8 == 0)
                System.out.println();
        }
    }
}
