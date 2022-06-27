package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity04_1 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.training-support.net");
        System.out.println("Title of the Page is : " + driver.getTitle());

        driver.findElement(By.xpath("//*[@id=\"about-link\"]")).click();

        System.out.println("Title of the new page is : " + driver.getTitle());

        driver.close();
    }
}
