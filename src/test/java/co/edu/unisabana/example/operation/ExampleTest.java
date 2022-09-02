package co.edu.unisabana.example.operation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExampleTest {

    private Example example = new Example();

    @Test
    void examplePolinomio() {
        int result = example.examplePolinomio(2, 3);
        assertEquals(43, result);

    }
}