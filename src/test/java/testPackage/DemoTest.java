package testPackage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class DemoTest {

WebDriver driver;

    @Test
    public void test1(){
    System.out.println("Testing maven");

    System.setProperty("webdriver.chrome.driver", "C:\\Users\\mariy\\Desktop\\New folder\\Selenium\\browserDrivers\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
    driver.findElement(By.xpath("//input[@name='ctl00$MainContent$username']")).sendKeys("Tester");
    driver.findElement(By.xpath("//input[@name='ctl00$MainContent$password']")).sendKeys("test");
    driver.findElement(By.xpath("//input[@type='submit']")).click();
    driver.quit();
}

@Test
    public void test2(){
    List<Integer> list = new ArrayList<>();




}



}



