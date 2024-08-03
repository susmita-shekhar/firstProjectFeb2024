package launchBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
	public static void main(String[] args){
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.khanacademy.org/science/hs-chemistry/x2613d8165d88df5e:chemical-bonding/x2613d8165d88df5e:covalent-bonds/v/covalent-bonds");
		driver.manage().window().maximize();
		driver.close();
	}
}
