package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BaseTests {
    private WebDriver driver;

    public void setup(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com");
        System.out.println(driver.getTitle());

        List<WebElement> listOfLinks = driver.findElements(By.tagName("a"));
        System.out.println(listOfLinks.size());

        /*WebElement inputsLink  = driver.findElement(By.linkText("Inputs"));
        inputsLink.click();*/

        WebElement shiftingContentLink = driver.findElement(By.linkText("Shifting Content"));
        shiftingContentLink.click();
        WebElement example1Link = driver.findElement(By.linkText("Example 1: Menu Element"));
        example1Link.click();
        WebElement menuList = driver.findElement(By.tagName("ul"));
        List<WebElement> listItems = menuList.findElements(By.tagName("li"));
        System.out.println(listItems.size());

        driver.quit();
    }

    public static void main(String[] args) {
        BaseTests baseTests = new BaseTests();
        baseTests.setup();

    }
}
