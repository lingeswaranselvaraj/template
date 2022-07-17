package com.zuhlke.interview;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.test.testint.CodingChallenge;
import com.test.testint.cityClass;
import com.test.testint.jsonParserLogic;

public class CodingChallengeTest {
    @Test
    public void testSayHello() {
        Assertions.assertEquals("Hello", new CodingChallenge().sayHello());
    }

    @Test
    public void test() throws FileNotFoundException, IOException, ParseException{
      
        String expected = "Guangzhou";
        Assertions.assertEquals(expected, new jsonParserLogic().mainMethod());
    }
}
