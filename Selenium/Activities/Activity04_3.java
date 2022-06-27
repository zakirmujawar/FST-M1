package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity04_3 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.training-support.net/selenium/target-practice");
        System.out.println("Title of the Page is : " + driver.getTitle());
        String thirdHeader = driver.findElement(By.xpath("//h3[@id='third-header")).getText();
        System.out.println("Third Header : "+ thirdHeader);

        String fifthHeaderColor = driver.findElement(By.xpath("//h5")).getCssValue("color");
        System.out.println("Fifth Header Color is :" + fifthHeaderColor);

        String violetButtonClass = driver.findElement(By.xpath("//button[contains(text(),'Violet')]")).getAttribute("class");
        System.out.println("Violet button's classes are :" + violetButtonClass);

        //String greyButton = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]")).getText();
        //System.out.println("The grey button's text is: " + greyButton);
        //driver.close();
    }
}