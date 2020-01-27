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
   	 //Giri� yap butonuna t�klan�r
   	driver.findElement(By.linkText(btnSignUp)).click();
   	//username alan�na t�klan�r
   	driver.findElement(By.linkText(btnSignUp)).click();
   	//username de�erler girilir
   	driver.findElement(By.id(btnUsername)).sendKeys("hazal.alcinkaya@gmail.com");
   	//password alan�na t�klan�r.
   	driver.findElement(By.id(btnPassword)).click();
   	//password alan�na do�ru de�erler g�nderilir
   	driver.findElement(By.id(btnPassword)).sendKeys("sat12345");
   	//sayfa �lk ac�ld�g�nda giri� yap butonu g�r�lmedi�i i�in scroll yap�l�r
   	JavascriptExecutor js = (JavascriptExecutor) driver;
   	js.executeScript("window.scrollBy(0,250)");
   	
   	//Giri� yap butonuna t�klan�r.
   	//Burada html i�indek� tum locatorlarla ulasmay� dened�m ancak ba�ar�l� olamad�m
     driver.findElement(By.id(btnSignUp)).click(); 

}

	
}