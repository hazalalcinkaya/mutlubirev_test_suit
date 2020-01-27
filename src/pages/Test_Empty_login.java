//Bo� de�erlerle login denenir.
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

		// Giri� yap butonuna t�klan�r
		driver.findElement(By.linkText(btnSignUp)).click();
		// sayfa �lk ac�ld�g�nda giri� yap butonu g�r�lmedi�i i�in scroll yap�l�r
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)");

		// Username ve password girilmeden,Giri� yap butonuna t�klan�r.
		driver.findElement(By.linkText(btnSignUp)).click();

	}

}