package simplecalculator;

import org.testng.annotations.Test;

import util.HelperMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

public class Division {
	WebDriver driver;
	HelperMethod hp;
	String actres;
	String expres;
  @Test
  public void f() {
	  hp.launchBrowser("chrome");
	  hp.openApp("https://www.calculator.net/");
	  
	  hp.clickBtn(By.xpath("//span[contains(text(),'4')]"));
	  hp.clickBtn(By.xpath("//span[normalize-space()='0']"));
	  hp.clickBtn(By.xpath("//span[normalize-space()='0']"));
	  hp.clickBtn(By.xpath("//span[normalize-space()='0']"));
	  
	  hp.clickBtn(By.xpath("//span[@onclick=\"r('/')\"]"));
	  
	  hp.clickBtn(By.xpath("//span[contains(text(),'2')]"));
	  hp.clickBtn(By.xpath("//span[normalize-space()='0']"));
	  hp.clickBtn(By.xpath("//span[normalize-space()='0']"));
	  
	  actres=hp.elementText(By.xpath("//div[@id='sciOutPut']")).trim();
	  expres="20";
	  Assert.assertEquals(actres, expres);
	  
  }
  
  @BeforeMethod
  public void setup() {
	  
		hp=new HelperMethod(driver);
		}

}
