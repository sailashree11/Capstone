package com.test;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class signup {
	public static String[] signup() {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String url ="http://localhost:8080/FlyAway/";
		driver.get(url);
		driver.findElement(By.linkText("Login/Signup")).click();
		driver.findElement(By.xpath("//input[@name=\"email_id\"]")).sendKeys("sailsiva@cisco.com");
		driver.findElement(By.xpath("//input[@name=\"pwd\"]")).sendKeys("1234");
		driver.findElement(By.xpath("//button")).click();
		driver.findElement(By.linkText("Logout")).click();
		Random random = new Random();
		int rnum = random.nextInt(1000);
		String exp_email = "sailsiva"+rnum+"@cisco.com";
		String exp_pwd = "1234";
		String exp_name = "sailsiva";
		String exp_adress = "Coimbatore";
		String exp_city = "TN";
		
		String [] exp_str = {exp_name.toString(), exp_city.toString(), exp_email.toString(), exp_adress.toString(), exp_pwd.toString()};


		driver.findElement(By.linkText("Login/Signup")).click();
		driver.findElement(By.linkText("Not a member? Signup")).click();
		driver.findElement(By.xpath("//input[@name=\"email_id\"]")).sendKeys(exp_email);
		driver.findElement(By.xpath("//input[@name=\"pwd\"]")).sendKeys(exp_pwd);
		driver.findElement(By.xpath("//input[@name=\"pwd2\"]")).sendKeys(exp_pwd);
		driver.findElement(By.xpath("//input[@name=\"name\"]")).sendKeys(exp_name);
		driver.findElement(By.xpath("//input[@name=\"address\"]")).sendKeys(exp_adress);
		driver.findElement(By.xpath("//input[@name=\"city\"]")).sendKeys(exp_city);

		driver.findElement(By.xpath("//button")).click();
		return exp_str;
	}
		
	
	public static void login(WebDriver driver) {

		String str_email="sailsiva@cisco.com";
		String str_pwd="1234";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("Login/Signup")).click();
		driver.findElement(By.xpath("//input[@name=\"email_id\"]")).sendKeys(str_email);
		driver.findElement(By.xpath("//input[@name=\"pwd\"]")).sendKeys(str_pwd);
		driver.findElement(By.xpath("//button")).click();
		driver.findElement(By.linkText("Home")).click();
		String str[] =new String[24];
		int i= 0;
		WebElement table = driver.findElement(By.xpath("//table[@border='1']"));
		List<WebElement> list = table.findElements(By.tagName("tr"));
		System.out.println("printing No of Rows " + list.size());

		for (WebElement ls : list) {

			List<WebElement> clist = ls.findElements(By.tagName("td"));

			for (WebElement wl : clist) {
				str[i] = wl.getText();
				i++;

			}
		}
		for (int j = 0; j < str.length; j++) {
			System.out.println(str[j]);

		}

		
	}
}
