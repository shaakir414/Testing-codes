import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;
public class SauceDemoTest {
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

	        username.sendKeys("standard_user");
	        password.sendKeys("secret_sauce");
	        loginButton.click();

	        wait.until(ExpectedConditions.urlContains("inventory"));
	        System.out.println("Login successful! Page title: " + driver.getTitle());

	    }
	}
