package task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestBase {
    public static Properties prop;
    public static WebDriver driver;
    public static String turl;

    public TestBase(){
        prop = new Properties();
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(System.getProperty("user.dir") + "/src/main/java/config/config.properties");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            prop.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void initialization(){
        String browserName = prop.getProperty("browser");
        if(browserName.equals("chrome")){
            if(prop.getProperty("os") != null && prop.getProperty("os").equals("macos")){
                System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "/drivers/chromedrivermac");
           // } else {
            //    System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "/drivers/chromedriver.exe");
            }
            driver = new ChromeDriver();
        }
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }

    public static void openNavigator (String url) {
        turl = url;
        String urlDemo = new String("https://www.advantageonlineshopping.com/#/");
        if(url.equals("demo")){
            driver.get(urlDemo);
        }else {
            driver.close();
        }
    }

    public static void closeNavigator(){
        driver.close();
    }
}
