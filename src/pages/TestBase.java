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
      // �ndirdi�imiz Chrome_driver.exe�nizin dizini
    protected static String ChromePath = "C:\\Users\\HAZAL\\Desktop\\chromedriver_win32\\chromedriver.exe";
      // Chrome S�r�c�lerinize ula�man�z� sa�layan servis
      protected static ChromeDriverService service;
      // As�l s�r�c�n�z ve Selenium size sa�lad��� en b�y�k nimet
      // olan bulundu�unuz internet sayfas�ndaki
      // elemanara(elementlere) ula�t���n�z ve tarac�y� kontrol 
      // etti�iniz arkada�
      protected static WebDriver driver;
      // Sizin i�in s�r�c�n�z� bekletecek �zellik(opsiyonel)
      protected static WebDriverWait wait;
      // Main fonksiyonumuz
      public TestBase(){
      }
      @BeforeClass
      public static void Setup(){
          // Chrome_driver.exe dizininden servisi olu�tur ve ba�lat
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
          // olu�tur
          driver = new  RemoteWebDriver(service.getUrl(),DesiredCapabilities.chrome());
          // B�t�n sayfalar� a�arken 15ms bekle
          wait = new WebDriverWait(driver,15);
          // Penceri B�y�t
          driver.manage().window().maximize();
       }
@AfterClass
       public static void Stop(){
           // Taray�c�dan ��k�� yapar
           driver.quit();
           // Servisi Durdurur
           service.stop();
       }
}