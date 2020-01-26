package basics;

import java.io.File;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

@SuppressWarnings("unused")

public class Initial {
	// Ýndirdiðimiz Chrome_driver.exe’nizin dizini
   protected static String ChromePath = "C:\\Users\\HAZAL\\Desktop\\chromedriver_win32\\chromedriver.exe";
   // Chrome Sürücülerinize ulaþmanýzý saðlayan servis
   protected static ChromeDriverService service;
  
   public static WebDriver driver;
   // Sizin için sürücünüzü bekletecek özellik(opsiyonel)
   public static WebDriverWait wait;
   
      public static void Start(){
	    // Chrome_driver.exe dizininden servisi oluþtur ve baþlat
	    service = new ChromeDriverService.Builder().
	              usingDriverExecutable(new File(ChromePath)).
	              usingAnyFreePort().
	              build();
	     try {
	         service.start();
	     } catch (Exception e) {
	         e.printStackTrace();
	     }
	    
	     System.setProperty("webdriver.chrome.driver", ChromePath);
	     // Driver nesnesini service bilgilerini kullanarak oluþtur
	     driver = new RemoteWebDriver(service.getUrl(),DesiredCapabilities.chrome());
	     // Bütün tarayýcýyý açarken 15ms bekletir
	     wait = new WebDriverWait(driver,15);
	     // Penceri Büyüt
	     driver.manage().window().maximize();
	}

	static void Stop(){
	    // Tarayýcýdan çýkýþ yapar
	    driver.quit();
	    // Servisi Durdurur
	    service.stop();
	}
	
	
	static void Scroll() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");

	}
}