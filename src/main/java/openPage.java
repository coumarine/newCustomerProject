import drivers.driverGenerator;
import org.openqa.selenium.WebDriver;
import sample.checking;

public class openPage {
    public static void openBrowser(String browserType){
//        System.setProperty("webdriver.chrome.driver","/Users/SKDK/Documents/Learning/AWSGIT/src/main/drivers/chromedriver");
        System.out.println("Browser is : " + browserType);
        WebDriver getDriver = driverGenerator.newDriver(browserType);
        getDriver.get("https://www.google.com");
        getDriver.quit();
    }
}
