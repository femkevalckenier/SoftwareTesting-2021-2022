package testclasses;

import org.testng.annotations.Test;
import appcode.SomeClassToTest;

public class TestNG_Demo {

    @Test
    public void testMethod() {
        SomeClassToTest test = new SomeClassToTest();
        int result = test.sumNumbers(1, 2);
        System.out.println("Running test -> testMethod");
    }

    @Test
    public void testMethod2() {
        System.out.println("Running test -> testMethod2");
    }

    @Test
    public void testMethod3() {
        System.out.println("Running test -> testMethod3");
    }
}
