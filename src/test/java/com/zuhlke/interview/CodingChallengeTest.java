package com.zuhlke.interview;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.test.testint.CodingChallenge;

public class CodingChallengeTest {
    @Test
    public void testSayHello() {
        Assertions.assertEquals("Hello", new CodingChallenge().sayHello());
    }
}
