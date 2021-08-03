package com.redbee.academy.clase1;

public class Potencia {


    /**
     * Generar un algoritmo para elevar un número (base) a una potencia dada
     *
     * @param base
     * @param potencia
     * @return
     */
    public static Integer resolver(Integer base, Integer potencia) {
        Integer resul=1;
        if (potencia != 0) {
            for (int i = 1; i <= potencia; i++) {
                 resul = resul * base;
            }
        } else {
            return 1;
        }
        return resul;
    }
}