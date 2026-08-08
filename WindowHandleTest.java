import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;
import java.util.Set;
import java.util.Iterator;

public class WindowHandleTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/windows");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        String mainWindow = driver.getWindowHandle();
        System.out.println("Main window handle: " + mainWindow);

        WebElement newTabLink = wait.until(
            ExpectedConditions.elementToBeClickable(By.linkText("Click Here"))
        );
        newTabLink.click();

        Set<String> allWindows = driver.getWindowHandles();
        System.out.println("Total windows open: " + allWindows.size());

        for (String handle : allWindows) {
            if (!handle.equals(mainWindow)) {
                driver.switchTo().window(handle);
                System.out.println("Switched to new tab. Title: " + driver.getTitle());
            }
        }

        driver.switchTo().window(mainWindow);
        System.out.println("Back to main window. Title: " + driver.getTitle());
    }
}