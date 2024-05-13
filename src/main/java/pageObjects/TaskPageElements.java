/**
 * 
 */
package pageObjects;

/**
 * 
 */
public interface TaskPageElements {
	
	String selection = "//a[@href='#Methodologies']//div[@class='vector-toc-text']";
	
	String title = "//span[@id='Test-driven_development']";
	
	String content = "//p[contains(text(),'Test automation, mostly using unit testing, is a k')]";
}
