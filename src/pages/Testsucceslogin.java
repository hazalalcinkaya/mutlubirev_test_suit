package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basics.Initial;

public class Testsucceslogin {
	public static void main(String[] args) throws InterruptedException
	{
   	 Initial.Start();
   	 HomePage homePage = new HomePage(Initial.driver, Initial.wait);
   	 WebDriver driver = Initial.driver;

   	 String btnSignUp = homePage.btnSignUp;
   	 String btnUsername = homePage.btnUsername;
   	 String btnPassword = homePage.btnPassword;

   	// String btnDownSignUp= homePage.btnDownSignUp;
   	 
   	 //PageBase pageBase = new PageBase(Initial.driver, Initial.wait);
   	 //Giriþ yap butonuna týklanýr
   	driver.findElement(By.linkText(btnSignUp)).click();
   	//username alanýna týklanýr
   	driver.findElement(By.linkText(btnSignUp)).click();
   	//username deðerler girilir
   	driver.findElement(By.id(btnUsername)).sendKeys("hazal.alcinkaya@gmail.com");
   	//password alanýna týklanýr.
   	driver.findElement(By.id(btnPassword)).click();
   	//password alanýna doðru deðerler gönderilir
   	driver.findElement(By.id(btnPassword)).sendKeys("sat12345");
   	//sayfa ýlk acýldýgýnda giriþ yap butonu görülmediði için scroll yapýlýr
   	JavascriptExecutor js = (JavascriptExecutor) driver;
   	js.executeScript("window.scrollBy(0,250)");
   	
   	//Giriþ yap butonuna týklanýr.
   	//Burada html içindeký tum locatorlarla ulasmayý denedým ancak baþarýlý olamadým
     driver.findElement(By.id(btnSignUp)).click(); 

}

	
}