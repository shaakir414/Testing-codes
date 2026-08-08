import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class RadioButtonTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.selenium.dev/selenium/web/formPage.html");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement peasRadio = wait.until(
            ExpectedConditions.elementToBeClickable(By.id("peas"))
        );
        peasRadio.click();
        System.out.println("Peas radio selected: " + peasRadio.isSelected());

        WebElement cheeseRadio = driver.findElement(By.id("cheese"));
        cheeseRadio.click();
        System.out.println("Cheese radio selected: " + cheeseRadio.isSelected());
        System.out.println("Peas radio still selected: " + peasRadio.isSelected());
    }
}