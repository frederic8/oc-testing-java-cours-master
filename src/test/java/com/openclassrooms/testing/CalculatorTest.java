package com.openclassrooms.testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
@Test
    void testAddTwoPositiveNumbers() {

        //Arrange
        int a = 2;
        int b = 3;
        Calculator calculator = new Calculator();

        //Act
        int somme = calculator.add(a,b);
        int somme1 = calculator.multiply(a,b);

        //Assert
        assertEquals(5, somme);
        assertEquals(6, somme1);

}

}