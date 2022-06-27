package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity02 {
    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net");
        System.out.println("Title of the page " + driver.getTitle());
        WebElement idLocator = driver.findElement(By.id("about-link"));
        System.out.println("Text in element is "+ idLocator.getText());
        System.out.println("Text in element ClassName is "+driver.findElement(By.className("green")).getText());
        System.out.println("Text in element CssSelector is "+driver.findElement(By.cssSelector(".green")).getText());
        System.out.println("Text in element Link is "+driver.findElement(By.linkText("About Us")).getText());
        driver.close();
    }
}
