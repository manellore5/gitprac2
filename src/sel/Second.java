package sel;

import org.openqa.selenium.chrome.ChromeDriver;

public class Second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "E:\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		System.out.println("third");
		driver.get("https://opensource-demo.orangehrmlive.com/");

	}

}
