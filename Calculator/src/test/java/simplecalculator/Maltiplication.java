package simplecalculator;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import util.HelperMethod;

public class Maltiplication {
	WebDriver driver;
	HelperMethod hp;
	String actRes;
	String expRes;
  @Test
  public void f() {
	  hp.launchBrowser("chrome");
	  hp.openApp("https://www.calculator.net/");
	  
	  hp.clickBtn(By.xpath("//span[contains(text(),'4')]"));
	  hp.clickBtn(By.xpath("//span[contains(text(),'2')]"));
	  hp.clickBtn(By.xpath("//span[contains(text(),'3')]"));
	  
	  hp.clickBtn(By.xpath("//span[contains(text(),'×')]"));
	  
	  hp.clickBtn(By.xpath("//span[contains(text(),'5')]"));
	  hp.clickBtn(By.xpath("//span[contains(text(),'2')]"));
	  hp.clickBtn(By.xpath("//span[contains(text(),'5')]"));
	  
	  actRes=hp.elementText(By.xpath("//*[@id=\"sciOutPut\"]")).trim();
	  expRes="222075";
	  Assert.assertEquals(actRes, expRes);
	  
  
  }
  @BeforeMethod
	 public void setup() {
		  
		hp=new HelperMethod(driver);
		  
	  }
  
  
}
