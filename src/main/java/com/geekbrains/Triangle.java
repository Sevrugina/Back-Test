package com.geekbrains;

import java.util.Arrays;

public class Triangle {
    //  Метод проверки валидности сторон треугольника

    public static boolean isTriangleValid(String s) {
        String[] strArr = s.split(",");
        double[] numArr = new double[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            numArr[i] = Double.parseDouble(strArr[i]);
        }
        Arrays.sort(numArr);
        return !(numArr[0] <= 0) && !(numArr[2] >= numArr[0] + numArr[1]);
    }
}
