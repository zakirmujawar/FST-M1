package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity04_2 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.training-support.net/selenium/simple-form");
        System.out.println("Title of the Page is : " + driver.getTitle());


        driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("Zakir");
        driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("Mujawar");
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("zakr.mujawar@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"number\"]")).sendKeys("9432156789");
        driver.findElement(By.xpath("//*[@id=\"simpleForm\"]/div/div[5]/textarea")).sendKeys("This is my message");

        driver.findElement(By.xpath("//*[@id=\"simpleForm\"]/div/div[6]/div[1]/input")).click();

    }
}
