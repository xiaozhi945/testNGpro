package test;


import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

;import java.io.File;

public class TestDemo {
    @BeforeClass
    public static void setup(){
        System.out.println("This is Before Method");
    }
    @Test
    public void testcase1(){
        Assert.assertTrue(false);
        System.out.println("testcase1");
    }
    @Test
    public void testcase2(){
        Assert.assertTrue(true);
        System.out.println("testcase2");
    }
    @Test
    public void testcase3(){
        File file = new File("c:/a");
        file.renameTo(new File("c:/b"));
        System.out.println("test massage");


    }
    @AfterClass
    public static void teardown(){System.out.println("This is Teardown Method");}
}
