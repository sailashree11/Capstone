package com.test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class booking {
	public static int main() {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String url ="http://localhost:8080/FlyAway/";
		driver.get(url);
		signup.login(driver);
		driver.findElement(By.xpath("//select[@name='source']")).click();
		driver.findElement(By.xpath("//select[@name='source']//option[@value='1']")).click();
		String from_loc = driver.findElement(By.xpath("//select[@name='source']//option[@value='1']")).getText();
		System.out.println("From : "+ from_loc);
		driver.findElement(By.xpath("//select[@name='destination']")).click();
		driver.findElement(By.xpath("//select[@name='destination']//option[@value='8']")).click();
		String to_loc = driver.findElement(By.xpath("//select[@name='destination']//option[@value='8']")).getText();
		System.out.println("TO : "+to_loc);
		String str_list[] = new String[24];
		int k = 0;

		WebElement table1 = driver.findElement(By.xpath("//table[@border='1']"));
		List<WebElement> list1 = table1.findElements(By.tagName("tr"));
		System.out.println("No of Rows" + list1.size() + "\n");

		for (WebElement ls : list1) {

			List<WebElement> clist = ls.findElements(By.tagName("td"));

			for (WebElement wl : clist) {
				str_list[k] = wl.getText();
				k++;
				System.out.println(wl.getText() + "," +"\n");

			}

		}
		for (int j = 0; j < str_list.length; j++) {
			System.out.println(str_list[j]+"\n");

		}
		String from_table = str_list[6];
		String to_table = str_list[19];
		System.out.println("Verifying after Submission");
		System.out.println(from_table + "\n" + to_table +"\n");
		int ret=0;
		if ((from_loc.contains(from_table))) {
			ret++;
			System.out.println("Source Location Validated");

		} else {
			System.out.println("Source Location did not validation");

		}

		if ((to_loc.contains(to_table))) {
			ret++;
			System.out.println("Destination Location Validated");

		} else {
			System.out.println("Destination Location not Validated");

		}

		driver.findElement(By.xpath("//button")).click();
		driver.findElement(By.linkText("Book Flight")).click();
		driver.findElement(By.linkText("Click to complete booking")).click();
		driver.findElement(By.linkText("See Your Bookings")).click();		
	return ret;
	
	}
}