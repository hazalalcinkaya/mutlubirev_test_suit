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

		// Giri� yap butonuna t�klan�r
		driver.findElement(By.linkText(btnSignUp)).click();
		// username alan�na t�klan�r
		driver.findElement(By.linkText(btnSignUp)).click();
		// username de�erler girilir
		driver.findElement(By.id("Email")).sendKeys("hazal.alcinkaya@gmail.com");
		// password alan�na t�klan�r.
		driver.findElement(By.id(btnUsername)).click();
		// password alan�na yanl�� de�erler g�nderilir
		driver.findElement(By.id(btnUsername)).sendKeys("xxx");
		// sayfa �lk ac�ld�g�nda giri� yap butonu g�r�lmedi�i i�in scroll yap�l�r

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)");

		// Giri� yap butonuna t�klan�r.
		driver.findElement(By.id(btnDownSignUp)).click();

		// �lk a��ld���nda ��kan �erez kullan�m� uyar�s� kabul et t�klan�r.
		// Initial.driver.findElement(By.linkText(btnAccept)).click();

	}

}