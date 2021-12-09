package testclasses;

import appcode.SomeClassToTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_Asserts {

    @Test
    public void testSum() {
        System.out.println("Running test -> testSum");
        SomeClassToTest test = new SomeClassToTest();
        int result = test.sumNumbers(1, 2);
        Assert.assertEquals(result, 3);
    }

    @Test
    public void testStrings() {
        System.out.println("Running test -> testStrings");
        String expectedString = "Hello World";
        SomeClassToTest test = new SomeClassToTest();
        String result = test.addStrings("Hello", "World");
        Assert.assertEquals(result, expectedString);
    }

    @Test
    public void testArrays() {
        System.out.println("Running test -> testArrays");
        int[] expectedArray = {1, 2, 3};
        SomeClassToTest test = new SomeClassToTest();
        int[] result = test.getArray();
        Assert.assertEquals(result, expectedArray);
    }
}
