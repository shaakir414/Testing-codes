import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;
import java.util.List;

public class CheckboxTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/checkboxes");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        List<WebElement> checkboxes = driver.findElements(By.cssSelector("#checkboxes input[type='checkbox']"));

        System.out.println("Total checkboxes found: " + checkboxes.size());

        for (int i = 0; i < checkboxes.size(); i++) {
            WebElement checkbox = checkboxes.get(i);
            boolean wasChecked = checkbox.isSelected();
            checkbox.click();
            System.out.println("Checkbox " + (i + 1) + " was " + wasChecked + ", now " + checkbox.isSelected());
        }
    }
}