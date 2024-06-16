package seleniumTestProject.seleniumTestProject;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;


public class App {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://app.xyicon.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement userName = driver.findElement(By.id("userName"));
        WebElement passWord = driver.findElement(By.id("pwInput"));

        userName.sendKeys("Xyicon Admin");
        passWord.sendKeys("Xyicon123");

        WebElement loginbtn = driver.findElement(By.name("submitButton"));
        loginbtn.click();
        Thread.sleep(10000);

        WebElement element = driver.findElement(By.xpath("//*[@id=\"body\"]/div/div[6]/div[2]/div/label"));
        element.isDisplayed();
        element.click();

        WebElement Icon = driver.findElement(By.xpath("//*[@id=\"appHolder\"]/header/div[1]/span[1]"));
        Icon.isDisplayed();
        Icon.click();

        WebElement space = driver.findElement(By.xpath("//*[@id=\"appHolder\"]/div[3]/div/div[1]/nav/ul/li[2]/div/span"));
        space.click();

        WebElement level1image = driver.findElement(By.xpath("//*[@id=\"appHolder\"]/div[3]/article/div/div[3]/div[1]/div[3]/div/div[2]"));
        new Actions(driver).doubleClick(level1image).perform();

        WebElement catalogpanel = driver.findElement(By.xpath("//*[@id=\"appHolder\"]/div[3]/article/div/div[1]/div[1]/div/div/div[1]/div[4]"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", catalogpanel);
        Thread.sleep(10000);
        
        WebElement hideIcon = driver.findElement(By.xpath("//*[@id=\"appHolder\"]/div[3]/article/div/div[1]/div[1]/div/div[1]/div[1]/div[2]/div"));
        js.executeScript("arguments[0].click();", hideIcon);    

        WebElement compuetr = driver.findElement(By.xpath("//*[@id=\"appHolder\"]/div[3]/article/div/div[1]/div[1]/div/div[3]/div[7]/div/div[1]/div[1]/div"));
         js.executeScript("arguments[0].click();", compuetr);
       
         WebElement computericon = driver.findElement(By.xpath("//*[@id=\"appHolder\"]/div[3]/article/div/div[1]/div[1]/div/div[3]/div[7]/div/div[1]/div[1]/div"));
         WebElement canvas = driver.findElement(By.xpath("//*[@id=\"canvas-div\"]"));
         Thread.sleep(3000);
         Actions actions = new Actions(driver);
         actions.dragAndDrop(computericon, canvas).build().perform();
         
                
         WebElement mouseicon = driver.findElement(By.xpath("//*[@id=\"appHolder\"]/div[3]/article/div/div[1]/div[1]/div/div[3]/div[11]/div/div[1]"));
         Thread.sleep(3000);
         actions.dragAndDrop(mouseicon, canvas).build().perform();
          

        //driver.quit();
    }
}
