package com.redbee.academy.clase1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SumaRangoTests {

    @Test
    @DisplayName("Test suma números impares entre rango 0 y 10")
    void testSumaRango() {
        Integer resultado = SumaRango.resolver(0, 5);

        Assertions.assertEquals(15, resultado);
    }

    @Test
    @DisplayName("Test en suma de números impares donde el primer parámetro es mayor al segundo")
    void testSumaNum1MayorANum2() {
        Integer resultado = SumaRango.resolver(10, 2);

        Assertions.assertEquals(0, resultado);
    }

    @Test
    @DisplayName("Test en suma de números pares donde el primer parámetro es mayor al segundo")
    void testSumaRangoNumerosPares() {
        Integer resultado = SumaRango.resolverPares(0, 10);

        Assertions.assertEquals(30, resultado);
    }

    @Test
    @DisplayName("Test num1 > num2")
    void testSumaNumerosParesNum1MayorANum2() {
        Integer resultado = SumaRango.resolverPares(10, 2);

        Assertions.assertEquals(0, resultado);
    }

    @Test
    @DisplayName("Test suma números impares entre rango 0 y 10")
    void testSumaRangoNumerosImpares() {
        Integer resultado = SumaRango.resolverImpares(0, 10);

        Assertions.assertEquals(25, resultado);
    }

    @Test
    @DisplayName("Test en suma de números impares donde el primer parámetro es mayor al segundo")
    void testSumaNumerosImparesNum1MayorANum2() {
        Integer resultado = SumaRango.resolverImpares(10, 2);

        Assertions.assertEquals(0, resultado);
    }
}
