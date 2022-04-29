package javaProject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Day2 {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver","D:\\github folder\\javaselenium\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();

		driver.get("https://www.makemytrip.com/");

		driver.manage().window().maximize();

		WebElement login = driver.findElement(By.xpath("//li[@data-cy='account']"));

		login.click();
		
		WebElement search = driver.findElement(By.xpath("//a[text()='Search']"));

		search.click();
		
		WebElement okay = driver.findElement(By.xpath("//button[text()='OKAY, GOT IT!']"));

		okay.click();
		
		Actions act = new  Actions(driver);

		act.dragAndDrop(source, target).perform();

		WebElement source1 = driver.findElement(By.xpath("(//li[@data-id='2'])[1]"));

		WebElement target1 = driver.findElement(By.xpath("(//ol[@align='center'])[2]"));

		act.dragAndDrop(source1, target1).perform();

		WebElement source2 = driver.findElement(By.xpath("(//li[@data-id='6'])[1]"));

		WebElement target2 = driver.findElement(By.xpath("(//ol[@align='center'])[3]"));

		act.dragAndDrop(source2, target2).perform();


		WebElement source3 = driver.findElement(By.xpath("(//li[@data-id='2'])[1]"));


		WebElement target3 = driver.findElement(By.xpath("(//ol[@align='center'])[4]"));

		act.dragAndDrop(source3, target3).perform();




	}

}





