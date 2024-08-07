package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BaseTest {

    @BeforeClass
    public void setup() {
        System.out.println("[+] Test fixture set");
    }

    @Test
    public void testSum(){
        int value1 = Integer.parseInt(System.getProperty("value1"));
        int value2 = Integer.parseInt(System.getProperty("value2"));
        int sum = value1 + value2;
        System.out.println("[+] Sum: " + sum);
        Assert.assertEquals(sum, (value1 + value2), "Sum is incorrect");
    }

    @Test
    public void testMultiply(){
        int value1 = Integer.parseInt(System.getProperty("value1"));
        int value2 = Integer.parseInt(System.getProperty("value2"));
        int sum = value1 * value2;
        System.out.println("[+] Product: " + sum);
        Assert.assertEquals(sum, (value1 * value2), "Product is incorrect");
    }

    @Test
    public void testDivide(){
        int value1 = Integer.parseInt(System.getProperty("value1"));
        int value2 = Integer.parseInt(System.getProperty("value2"));
        int result = value1 / value2;
        System.out.println("[+] Quotient: " + result);
        Assert.assertEquals(result, (value1 / value2), "Quotient is incorrect");
    }


    @AfterClass
    public void tearDown() {
        System.out.println("[+] Test fixture closed");
    }
}
