package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity03 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://training-support.net/selenium/simple-form");
        System.out.println("Title of the page " + driver.getTitle());

        WebElement firstName = driver.findElement(By.id("firstName"));
        WebElement lastName = driver.findElement(By.id("lastName"));

        firstName.sendKeys("Zakir");
        lastName.sendKeys("Mujawar");

        driver.findElement(By.id("email")).sendKeys("zakirmujawar@gmail.com");
        driver.findElement(By.id("number")).sendKeys("9888888812");

        driver.findElement(By.cssSelector(".ui.green.button")).click();

        driver.close();

    }

}
