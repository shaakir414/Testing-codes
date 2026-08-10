import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class DragAndDropTest {
    public static void main(String[] args) {

        // 1. Initialize Chrome Driver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            // 2. Navigate to jQuery UI Drag and Drop demo page
            driver.get("https://jqueryui.com/resources/demos/droppable/default.html");

            // 3. Locate source (draggable) and target (droppable) elements
            WebElement draggable = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("draggable"))
            );
            WebElement droppable = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("droppable"))
            );

            // 4. Perform Drag and Drop action
            Actions actions = new Actions(driver);
            actions.dragAndDrop(draggable, droppable).perform();

            // 5. Verify text changes inside the target element after dropping
            String droppedText = droppable.getText();
            System.out.println("Drag and Drop successful! Target box text: " + droppedText);

        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
        } 
        }
    
}


