package macysPrep;

public class ScrollByPage {
    WebDriver driver;
    @Test
    public void byPage() {
        
        System.setProperty("webdriver.chrome.driver", "E://Selenium//Selenium_Jars//chromedriver.exe");
        driver = new ChromeDriver();
        
        javascriptExecutor js = (javaScriptExecutor)driver;
        driver.get("google.com");
        js.executeScript("window.scrollTo(0,document.body.scrollHeigh)");
    }
    
}