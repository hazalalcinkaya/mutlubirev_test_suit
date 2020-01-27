//Anasayfa ile ilgili id,class gibi web elementlerinin tutuldu�u yer
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends PageBase {
	// Consturctor
	public HomePage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		driver.get("https://mutlubiev.com/");
	}

	// WebElements
	public String btnSignUp = "Giri� Yap"; // id
	public String btnUsername = "Email"; // id
	public String btnPassword = "Password";
	public String btnDownSignUp = "LogIn"; //
	public String btnAccept = "KABUL ET"; // btn
	public String btnDownSignUp2 = "red-action-button submit-btn";

}
