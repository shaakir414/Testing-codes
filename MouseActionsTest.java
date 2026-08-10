import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseActionsTest {

    public static void main(String[] args) {
        
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            driver.get("https://the-internet.herokuapp.com/hovers");

            WebElement firstImage = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("(//div[@class='figure'])[1]")
                )
            );

            Actions actions = new Actions(driver);
            actions.moveToElement(firstImage).perform();

            WebElement caption = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("(//div[@class='figcaption'])[1]/h5")
                )
            );

            System.out.println("Hover successful! Caption text: " + caption.getText());

        } catch (Exception e) {
            System.err.println("An error occurred during execution: " + e.getMessage());
        }
    }
}

