import java.io.File;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class FileUploadTest {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            // 1. Navigate to File Upload demo page
            driver.get("https://the-internet.herokuapp.com/upload");

            // 2. Prepare a dummy file path to upload
            File uploadFile = new File("screenshot_example.png"); 

            // 3. Locate the file input element (<input type='file'>)
            WebElement fileInput = wait.until(
                ExpectedConditions.presenceOfElementLocated(By.id("file-upload"))
            );

            // 4. Send the absolute path of the file to the input
            fileInput.sendKeys(uploadFile.getAbsolutePath());

            // 5. Click the Upload button
            WebElement uploadButton = driver.findElement(By.id("file-submit"));
            uploadButton.click();

            // 6. Verify successful upload message
            WebElement successHeader = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.tagName("h3"))
            );

            System.out.println("File upload result: " + successHeader.getText());

        } catch (Exception e) {
            System.err.println("An error occurred during file upload: " + e.getMessage());
        
        }
    }
}


