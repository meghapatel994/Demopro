package currencycalculator;

import org.testng.annotations.Test;

import util.HelperMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

public class Currencycal {
	WebDriver driver;
	HelperMethod hp;
	String actres;
	String expres;
	
  @Test
  public void f() {
	  hp.launchBrowser("chrome");
	  hp.openApp("https://www.calculator.net/currency-calculator.html");
	  
	  hp.enterText(By.xpath("//*[@id=\"eamount\"]"), "500");
	  
	  hp.selectdropDown(By.xpath("//*[@id=\"efrom\"]"), 9);
	  hp.selectdropDown(By.xpath("//*[@id=\"eto\"]"), 15);
	
	  hp.clickBtn(By.xpath("//tbody/tr[5]/td[2]/input[2]"));
	  
	  actres=hp.elementText(By.xpath("//b[normalize-space()='6.72189']")).trim();
	  expres="6.72189";
	  Assert.assertEquals(actres, expres);
  }
  @BeforeMethod
  public void setup() {
	  hp=new HelperMethod(driver);
  }
  

}
