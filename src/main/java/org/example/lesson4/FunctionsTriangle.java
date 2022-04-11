package org.example.lesson4;

import static java.lang.Math.sqrt;

public class FunctionsTriangle {
    public static double square(int a, int b, int c) throws Exception {
        if(a <= 0|| b <= 0 || c <= 0){
            throw new Exception("Ошибка");
        }

        double p = (a  + b + c)/2.d;
        return sqrt(p*(p- a)*(p - b)*(p - c));
    }
}
