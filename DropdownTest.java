import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class DropdownTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.selenium.dev/selenium/web/formPage.html");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement dropdownElement = wait.until(
            ExpectedConditions.presenceOfElementLocated(By.name("selectomatic"))
        );

        Select dropdown = new Select(dropdownElement);

        dropdown.selectByVisibleText("Four");
        System.out.println("Selected: " + dropdown.getFirstSelectedOption().getText());

        dropdown.selectByIndex(2);
        System.out.println("Selected by index: " + dropdown.getFirstSelectedOption().getText());
    }
}