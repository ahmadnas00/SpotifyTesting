//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.NoSuchElementException;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//
//public class LibraryPageTest {
//    WebDriver driver;
//
//    private static final String baseURL = "http://localhost:8082";
//    private static final String expectedPageTitle = "Spotify Clone";
//    private static final String expectedPageMessage = "Oops.... Not Available";
//
//
//    @BeforeEach
//    public void setup() {
//        driver = new ChromeDriver();
//    }
//
//    @Test
//    void testPageTitle() {
//        driver.get(baseURL);
//
//        String pageTitle = driver.getTitle();
//        assertEquals(expectedPageTitle, pageTitle);
//    }
//
//    @Test
//    void testPageMessage() {
//        driver.get(baseURL);
//
//        WebElement libraryLink = driver.findElement(By.cssSelector("a[href='/library']"));
//        libraryLink.click();
//
//        WebElement pageMessage = driver.findElement(By.cssSelector("div.content h1"));
//        String pageMessageText = pageMessage.getText();
//
//        assertEquals(expectedPageMessage, pageMessageText);
//    }
//
//    @AfterEach
//    public void teardown() {
//        driver.quit();
//    }
//}
