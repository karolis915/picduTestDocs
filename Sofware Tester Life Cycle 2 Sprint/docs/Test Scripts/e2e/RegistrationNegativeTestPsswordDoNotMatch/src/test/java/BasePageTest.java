import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class BasePageTest {
    protected WebDriver driver;
    @BeforeEach
    void setup() {
        driver = new ChromeDriver();
        driver.get("http://localhost:5173/");
    }
   //@AfterEach
   // void turnDown(){
     //   driver.quit();
  //  }
}
