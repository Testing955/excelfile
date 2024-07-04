import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class redirectportfoliolink {
    public static void main(String[] args) {
WebDriver driver = new ChromeDriver();

        String url = "https://voice-gpt.hestalabs.com/";

        driver.get("https://voice-gpt.hestalabs.com/");

        // Get the title of the page
        String pageTitle = driver.getTitle();

        // Check if the title contains "Service Unavailable"
        if (pageTitle.contains("Service Unavailable")) {
            System.out.println("Down");
        } else {
            System.out.println("Live");
        }

        // Close the browser
        driver.quit();
    }
}
