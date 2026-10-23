package com.codealpha.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {
    @Test
    void addsTwoNumbers() {
        App app = new App();
        assertEquals(15, app.add(10, 5));
        assertEquals(0, app.add(-3, 3));
    }
}