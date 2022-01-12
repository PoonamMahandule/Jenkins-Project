package org.example.java_jenkins_in_docker;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class TestMain {

    @Test
    public void testInputIsEven(){
        assertTrue(Main.checkIfInputIsAnEvenNumber(22)); // Assertion
    }
}
