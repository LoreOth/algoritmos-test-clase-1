package com.redbee.academy.clase1;

public class MCMyMCD {


    /**
     * Generar un algoritmo que resuelva el mínimo común múltiplo entre 2 números
     *
     * @param num1
     * @param num2
     * @return
     */
    public static Integer mcm(int num1, int num2) {
        Integer mcm = 1;
        int i = 2;
        while (i <= num1 || i <= num2) {
            if (num1 % i == 0 || num2 % i == 0) {
                mcm = mcm * i;
                if (num1 % i == 0) num1 = num1 / i;
                if (num2 % i == 0) num2 = num2 / i;
            } else
                i = i + 1;
        }
        return mcm;

    }


    /**
     * Generar un algoritmo que resuelva el máximo común divisor entre 2 números
     *
     * @param num1
     * @param num2
     * @return
     */
    public static Integer mcd(int num1, int num2) {
        while (num1 != num2)
            if (num1 > num2)
                num1 = num1 - num2;
            else
                num2 = num2 - num1;

        return num1;

    }
}