import org.openqa.selenium.By;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class InvalidLogin {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement username = wait.until(
            ExpectedConditions.presenceOfElementLocated(By.id("user-name"))
        );
        WebElement password = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("login-button"));

        username.sendKeys("wrong_user");
        password.sendKeys("wrong_password");
        loginButton.click();

        WebElement errorMessage = wait.until(
            ExpectedConditions.presenceOfElementLocated(By.cssSelector("h3[data-test='error']"))
        );

        System.out.println("Test Passed! Error message shown: " + errorMessage.getText());

        
    }
}