package simplecalculator;

import org.testng.annotations.Test;

import util.HelperMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

public class Addition {
	WebDriver driver;
	HelperMethod hp;
	String actres;
	String expres;
  @Test
  public void f() {
	  hp.launchBrowser("chrome");
	  hp.openApp("https://www.calculator.net/");
	  
	  hp.clickBtn(By.xpath("//span[contains(text(),'–')]"));
	  hp.clickBtn(By.xpath("//span[normalize-space()='2']"));
	  hp.clickBtn(By.xpath("//span[normalize-space()='3']"));
	  hp.clickBtn(By.xpath("//span[normalize-space()='4']"));
	  hp.clickBtn(By.xpath("//span[normalize-space()='2']"));
	  hp.clickBtn(By.xpath("//span[normalize-space()='3']"));
	  hp.clickBtn(By.xpath("//span[normalize-space()='4']"));
	  
	  hp.clickBtn(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[1]/span[4]"));
	  
	  hp.clickBtn(By.xpath("//span[normalize-space()='3']"));
	  hp.clickBtn(By.xpath("//span[normalize-space()='4']"));
	  hp.clickBtn(By.xpath("//span[normalize-space()='5']"));
	  hp.clickBtn(By.xpath("//span[normalize-space()='3']"));
	  hp.clickBtn(By.xpath("//span[normalize-space()='4']"));
	  hp.clickBtn(By.xpath("//span[normalize-space()='5']"));
	  
	  actres=hp.elementText(By.xpath("//div[@id='sciOutPut']")).trim();
	  expres="111111";
	  Assert.assertEquals(actres, expres);
	  
  }
  @BeforeMethod
  public void setup() {
	  hp=new HelperMethod(driver);
  }
     
}
