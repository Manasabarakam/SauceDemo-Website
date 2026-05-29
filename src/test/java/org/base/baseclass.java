package org.base;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class baseclass {

	protected static WebDriver driver;

	public static void loadDriver() {
	    ChromeOptions options = new ChromeOptions();
	    
	    // This argument disables the Google password leak warning popup completely
	    // This new argument disables the Google password leak warning completely,now run
	   
	    options.addArguments("--incognito");
	    
	    // Optional: Also disables password saving prompts for automation stability
	    java.util.HashMap<String, Object> prefs = new java.util.HashMap<>();
	    prefs.put("credentials_enable_service", false);
	    prefs.put("profile.password_manager_enabled", false);
	    options.setExperimentalOption("prefs", prefs);

	    // Pass the options into your driver instance
	    driver = new ChromeDriver(options);
	    driver.manage().window().maximize();
	}

	public static void launchURL(String url) {
		driver.get(url);
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
	}
	
	public static WebElement findid(String id) {
		return driver.findElement(By.id(id));
	} 
	
	public static WebElement findname(String name) {
		return driver.findElement(By.name(name));
	}
	public static WebElement findXpath(String Xpath) {
		return driver.findElement(By.xpath(Xpath));
	}
	
	public static void clickbtn(WebElement btn) {
		btn.click();
	}
	
	public static void sendKeys(WebElement name, String username) {
		name.sendKeys(username);
	}
        
	public static void close() {
		driver.quit();
	}
}
