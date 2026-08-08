import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class IframeTest2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://selenium.dev/selenium/web/iframes.html");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Switch into the first iframe on the page (index 0)
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0));

        WebElement iframeContent = driver.findElement(By.tagName("p"));
        System.out.println("Text found inside iframe: " + iframeContent.getText());

        driver.switchTo().defaultContent();
        System.out.println("Switched back to main page.");

        
    }
}