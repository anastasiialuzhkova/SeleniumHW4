package org.example.lesson4;

import org.junit.jupiter.api.*;
import static org.example.lesson4.FunctionsTriangle.square;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static org.junit.jupiter.api.Assertions.*;


public class FunctionsTriangleTest {
    private static Logger logger = LoggerFactory.getLogger("FunctionsTriangleTest");

    @BeforeAll
    static void beforeAll() {
        System.out.println("Метод выполнится 1 раз перед всеми тестами");
        logger.info("info log");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("Метод выполнится перед каждым тестами");
    }


    @Test
    @DisplayName("Вычисление площади треугольника")

    void givenThreeSidesTriangleThenSquare() throws Exception {
        assertEquals(6.d, square(3,4, 5));
        Assertions.assertThrows(Exception.class, () -> {
            square(-1,4, 5);
        });
    }

}