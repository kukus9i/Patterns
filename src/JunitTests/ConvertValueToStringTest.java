package JunitTests;

import codeForUnitTest.ConvertValueToString;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConvertValueToStringTest {
    @Test
    public void testGetWordFromNumber() {
        ConvertValueToString convert = new ConvertValueToString();

        Assert.assertEquals("zero", convert.getWordFromNumber(0));
        Assert.assertEquals("one", convert.getWordFromNumber(1));
        Assert.assertEquals("two", convert.getWordFromNumber(2));
        Assert.assertEquals("three", convert.getWordFromNumber(3));
        Assert.assertEquals("four", convert.getWordFromNumber(4));
        Assert.assertEquals("five", convert.getWordFromNumber(5));
        Assert.assertEquals("six", convert.getWordFromNumber(6));
        Assert.assertEquals("seven", convert.getWordFromNumber(7));
        Assert.assertEquals("eight", convert.getWordFromNumber(8));
        Assert.assertEquals("nine", convert.getWordFromNumber(9));
        Assert.assertEquals("ten", convert.getWordFromNumber(10));
        Assert.assertEquals("Unexpected value", convert.getWordFromNumber(11));
        Assert.assertEquals("Unexpected value", convert.getWordFromNumber(-1));

    }

}