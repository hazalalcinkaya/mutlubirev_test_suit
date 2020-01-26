package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
public class HomePage extends PageBase{
     // Consturctor
     public HomePage(WebDriver driver, WebDriverWait wait) {
           super(driver,   wait);
           driver.get("https://mutlubiev.com/");
     }
     // WebElements
     public String btnSignUp = "Giri� Yap"; //   id
     public String btnUsername = "Password"; //   id
     public String btnDownSignUp= "LogIn"; //
     public String btnAccept="KABUL ET"; //btn
    

   
     // This method will use in test class
     public String checkMenuLinks(String button){
        click(By.name(button));
        return driver.getCurrentUrl();
     }
     }
     
