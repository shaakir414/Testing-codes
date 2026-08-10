import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
public class ScreenshotTest {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        try {
            // 1. Navigate to target URL
            driver.get("https://the-internet.herokuapp.com/");

            // 2. Cast driver to TakesScreenshot interface
            TakesScreenshot ts = (TakesScreenshot) driver;

            // 3. Capture screenshot as a temporary file
            File sourceFile = ts.getScreenshotAs(OutputType.FILE);

            // 4. Define target path (saves screenshot in your project root)
            File destinationFile = new File("screenshot_example.png");

            // 5. Copy file to destination
            FileHandler.copy(sourceFile, destinationFile);

            System.out.println("Screenshot captured successfully! Saved at: " + destinationFile.getAbsolutePath());

        } catch (IOException e) {
            System.err.println("Failed to save screenshot: " + e.getMessage());
        }
        }
    
}

