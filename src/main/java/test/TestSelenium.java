package test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.lang.invoke.LambdaConversionException;

public class TestSelenium {
    @Test
    public void testcase1(){

        //设置驱动所在位置
        System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.iqiyi.com/");

        ((ChromeDriver) driver).findElementByXPath("//span[@id='nav_searchboxIn']/input").clear();
        ((ChromeDriver) driver).findElementByXPath("//span[@id='nav_searchboxIn']/input").sendKeys("汤森路透");
        WebDriverWait ww = new WebDriverWait(driver,5);
        ww.until((xx)->xx.findElement(By.xpath("//span[@id='nav_searchboxIn']/input")));


//        //抓取成功登录后的用户名信息
//        String text = driver.findElement(By.cssSelector("#siteNav > a:nth-child(4)")).getText();
//        //断言-校验是否登录成功
//        Assert.assertEquals(text,"懵");
//
//        try {
//            //页面等待
//            Thread.sleep(300);
//            } catch (InterruptedException e) {
//                        e.printStackTrace();
//            }
//        //关闭浏览器进程及驱动
//        driver.close();

            }

}
