package map_interface_realwebsite;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Map_Int_RW {
	
	WebDriver dr;
	public void setProperty() {
	
	HashMap<String, String> hp=new HashMap<>();
	List<WebElement> ellValues=dr.findElements(By.xpath("//tr/td"));
	for(int i=2; i<=ellValues.size(); i++) {
		String key=dr.findElement(By.xpath("//tr["+i+"]/td[1")).getText();
		String value=dr.findElement(By.xpath("//tr["+i+"]/td[2]")).getText();
		hp.put(key, value);
	}
	
	Iterator<Entry<String, String>> e=hp.entrySet().iterator();
	while(e.hasNext()) {
		Entry<String, String> x=e.next();
		System.setProperty("webdriver.chrome.driver","/Users/meghamapalagama/eclipse-workspace/"
				+ "map_interface/chromedriver");
		dr=new ChromeDriver();
		dr.get("http://www.target.com");
		dr.findElement(By.xpath("")).sendKeys(x.getKey());
		dr.findElement(By.xpath("")).sendKeys(x.getValue());
	}}}
