package pages;
import java.io.File;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
public abstract class TestBase {
      // Ýndirdiðimiz Chrome_driver.exe’nizin dizini
    protected static String ChromePath = "C:\\Users\\HAZAL\\Desktop\\chromedriver_win32\\chromedriver.exe";
      // Chrome Sürücülerinize ulaþmanýzý saðlayan servis
      protected static ChromeDriverService service;
      // Asýl sürücünüz ve Selenium size saðladýðý en büyük nimet
      // olan bulunduðunuz internet sayfasýndaki
      // elemanara(elementlere) ulaþtýðýnýz ve taracýyý kontrol 
      // ettiðiniz arkadaþ
      protected static WebDriver driver;
      // Sizin için sürücünüzü bekletecek özellik(opsiyonel)
      protected static WebDriverWait wait;
      // Main fonksiyonumuz
      public TestBase(){
      }
      @BeforeClass
      public static void Setup(){
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
          // Driver nesnesini service bilgilerini kullanarak  
          // oluþtur
          driver = new  RemoteWebDriver(service.getUrl(),DesiredCapabilities.chrome());
          // Bütün sayfalarý açarken 15ms bekle
          wait = new WebDriverWait(driver,15);
          // Penceri Büyüt
          driver.manage().window().maximize();
       }
@AfterClass
       public static void Stop(){
           // Tarayýcýdan çýkýþ yapar
           driver.quit();
           // Servisi Durdurur
           service.stop();
       }
}