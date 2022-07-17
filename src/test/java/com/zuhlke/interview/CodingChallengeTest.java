package com.zuhlke.interview;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.test.testint.CodingChallenge;
import com.test.testint.laptopclas;

public class CodingChallengeTest {
    @Test
    public void testSayHello() {
        Assertions.assertEquals("Hello", new CodingChallenge().sayHello());
    }
    @Test
    public void testArithatic(){
    Assertions.assertEquals(3, new CodingChallenge().test(1,2));
    }

    

}
