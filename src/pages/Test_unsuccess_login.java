package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import basics.Initial;

public class Test_unsuccess_login {
	public static void main(String[] args) throws InterruptedException {
		Initial.Start();
		HomePage homePage = new HomePage(Initial.driver, Initial.wait);
		WebDriver driver = Initial.driver;

		String btnSignUp = homePage.btnSignUp;
		String btnUsername = homePage.btnUsername;
		String btnDownSignUp = homePage.btnDownSignUp;

		// Giriþ yap butonuna týklanýr
		driver.findElement(By.linkText(btnSignUp)).click();
		// username alanýna týklanýr
		driver.findElement(By.linkText(btnSignUp)).click();
		// username deðerler girilir
		driver.findElement(By.id("Email")).sendKeys("hazal.alcinkaya@gmail.com");
		// password alanýna týklanýr.
		driver.findElement(By.id(btnUsername)).click();
		// password alanýna yanlýþ deðerler gönderilir
		driver.findElement(By.id(btnUsername)).sendKeys("xxx");
		// sayfa ýlk acýldýgýnda giriþ yap butonu görülmediði için scroll yapýlýr

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)");

		// Giriþ yap butonuna týklanýr.
		driver.findElement(By.id(btnDownSignUp)).click();

		// ýlk açýldýðýnda çýkan çerez kullanýmý uyarýsý kabul et týklanýr.
		// Initial.driver.findElement(By.linkText(btnAccept)).click();

	}

}