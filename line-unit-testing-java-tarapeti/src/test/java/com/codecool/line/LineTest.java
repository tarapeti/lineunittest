package com.codecool.line;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LineTest {
    private Line testLine;

    @BeforeEach
    void setUp() {
        testLine = new Line(1.0,3.0,6.0,9.0);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getSlope() {
        assertEquals(1.2, testLine.getSlope());

    }

    @Test
    void getDistance() {
        assertEquals(7.810249675906654, testLine.getDistance());
    }

    @Test
    void parallelTo() {
        assertEquals(true, testLine.parallelTo(testLine));
    }
}
