package ru.netology.sqr.javapackage.services;

public class SqrtService {

    public int calcSqrt(int min, int max) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= min && i * i <= max ) {
                count ++;
            }
        }
       return count;
    }
}

