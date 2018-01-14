//Author: Nicole C.

package homework_week9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class search_button {

		WebDriver driver = null;
	
	public void searchButton() throws Throwable {
		
		driver = new ChromeDriver();
		
		driver.findElement(By.name("submit_search")).click();
		
		
	}
	
}
