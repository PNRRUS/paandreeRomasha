package Sabito_09_2023;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

import static Sabito_09_2023.Number3Digits.digitsMetode;

class Number3DigitsTest {

    @Test
    void testDigitsMetode() {
               assertEquals("YES", digitsMetode(999, 3), "Test 1 failed");
               assertEquals("YES", digitsMetode(1000, 4), "Test 2 failed");
               assertEquals("NO", digitsMetode(100, 2), "Test 3 failed");
               assertEquals("YES", digitsMetode(-100, 3), "Test 4 failed");
               assertEquals("NO", digitsMetode(-100, 2), "Test 5 failed");
               assertEquals("YES", digitsMetode(0, 1), "Test 6 failed");

               String a = "Хорошо";
               String b = "Хорошо";
               assertEquals(a, b, "не равные строки");

        String expected = "3.1415";
        String actual = "3";

        assertEquals(expected, actual);

    }
}