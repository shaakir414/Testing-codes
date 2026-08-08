import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class AlertTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement alertButton = wait.until(
            ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Click for JS Alert']"))
        );
        alertButton.click();

        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        System.out.println("Alert text: " + alert.getText());
        alert.accept();

        WebElement result = driver.findElement(By.id("result"));
        System.out.println("Result after accepting: " + result.getText());
    }
}