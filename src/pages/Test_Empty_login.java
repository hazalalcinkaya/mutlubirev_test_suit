//Boþ deðerlerle login denenir.
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import basics.Initial;

public class Test_Empty_login {
	public static void main(String[] args) throws InterruptedException {
		Initial.Start();
		HomePage homePage = new HomePage(Initial.driver, Initial.wait);
		WebDriver driver = Initial.driver;

		String btnSignUp = homePage.btnSignUp;

		// Giriþ yap butonuna týklanýr
		driver.findElement(By.linkText(btnSignUp)).click();
		// sayfa ýlk acýldýgýnda giriþ yap butonu görülmediði için scroll yapýlýr
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)");

		// Username ve password girilmeden,Giriþ yap butonuna týklanýr.
		driver.findElement(By.linkText(btnSignUp)).click();

	}

}