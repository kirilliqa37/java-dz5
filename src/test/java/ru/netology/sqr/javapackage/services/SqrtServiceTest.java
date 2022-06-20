package ru.netology.sqr.javapackage.services;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SqrtServiceTest{

    @Test
    public void shouldCalcExact() {
        SqrtService service = new SqrtService();

        int min = 200;
        int max = 500;
        int expected = 8;
        int actual = service.calcSqrt(min, max);
        System.out.println(actual);

        assertEquals(expected, actual);
    }

}