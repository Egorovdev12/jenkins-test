package com.example.jenkproj;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class FunctionalTest {

    @Test
    public void correctSum() {
        final int n1 = 12;
        final int n2 = -7;

        Service testService = new Service();
        final int result = testService.calculate(n1, n2);
        Assertions.assertEquals(n1 + n2, result);
    }
}
