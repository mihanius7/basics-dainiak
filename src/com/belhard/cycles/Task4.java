package com.belhard.cycles;

public class Task4 {
    public static final int FIRST_PRINTABLE_CHAR = 33;
    public static final int LAST_PRINTABLE_CHAR = 128;

    public static void main(String[] args) {
        char ch;
        for (int i = FIRST_PRINTABLE_CHAR; i <= LAST_PRINTABLE_CHAR; i++) {
            ch = (char) i;
            System.out.printf("%03d -> %-2s\t", i, ch);
            if (i % 8 == 0)
                System.out.println();
        }
    }
}
