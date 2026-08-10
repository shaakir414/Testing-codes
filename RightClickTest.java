import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RightClickTest {
	   public static void main(String[] args) {

	        // 1. Initialize Chrome Driver
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();

	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	        try {
	            // 2. Navigate to jQuery Context Menu Demo page
	            driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");

	            // 3. Locate the right-click target element
	            WebElement rightClickBtn = wait.until(
	                ExpectedConditions.visibilityOfElementLocated(
	                    By.xpath("//span[text()='right click me']")
	                )
	            );

	            // 4. Perform Right-Click Action
	            Actions actions = new Actions(driver);
	            actions.contextClick(rightClickBtn).perform();

	            // 5. Verify that the context menu option is visible after right-clicking
	            WebElement editOption = wait.until(
	                ExpectedConditions.visibilityOfElementLocated(
	                    By.cssSelector(".context-menu-icon-edit")
	                )
	            );

	            System.out.println("Right-click successful! Found menu option: " + editOption.getText());

	        } catch (Exception e) {
	            System.err.println("An error occurred: " + e.getMessage());
	        }
	        }
	    
	}

