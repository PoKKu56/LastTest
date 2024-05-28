package ru.glazunov.classesTest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SummaryTest {

    @Test
    void sumException() {
        Summary sum = new Summary(4, 4);
        IncorrectNum exception = assertThrows(IncorrectNum.class, () -> sum.sum());
        assertTrue(exception.getMessage().contains("Введено неправильное число"));
    }

    @Test
    void sum() throws IncorrectNum {
        Summary sum = new Summary(3, 4);
        assertEquals(7, sum.sum());
    }
}