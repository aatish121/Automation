package Basics;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Mock_Letcode1 {
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://letcode.in/");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("adhawale78@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Aatish@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='LOGIN']")).click();
		Thread.sleep(2000);
        driver.findElement(By.linkText("Explore Workspace")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Edit']")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("fullName")).sendKeys("Aatish Vilas Dhawale");
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Drop-Down']")).click();
		Thread.sleep(2000);
		
		org.openqa.selenium.WebElement fr=driver.findElement(By.id("fruits"));
		Select s2=new Select(fr);
		s2.selectByVisibleText("Mango");
		
		Thread.sleep(2000);
        driver.navigate().back();
        
        driver.findElement(By.xpath("//a[text()='Click']")).click();
        Thread.sleep(2000);                
        
        Dimension ele = driver.findElement(By.id("home")).getSize();
        System.out.println(ele.getHeight());
		System.out.println(ele.getWidth());
		
		driver.findElement(By.linkText("Sign out")).click();
		
        
        }

}
