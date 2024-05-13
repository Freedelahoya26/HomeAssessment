/**
 * 
 */
package pageEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import base.BaseTest;
import pageObjects.LoadedPageElements;

/**
 * 
 */
public class LoadedPageEvents extends BaseTest {

	public void taskPageLoaded() {

		WebElement ele = driver.findElement(By.xpath(LoadedPageElements.taskPage));

		Assert.assertNotNull(ele,"HomePage Not Loaded");
	}
	
	public void contentLoaded() {

		WebElement ele = driver.findElement(By.xpath(LoadedPageElements.content));

		Assert.assertNotNull(ele,"HomePage Not Loaded");
	}

}
