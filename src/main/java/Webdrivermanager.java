import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Webdrivermanager {
	public void driverInstance() {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		String URL = "https://www.amazon.in/";
		driver.navigate().to(URL);
		driver.quit();
	}
	public static void main(String[] args) {
		Webdrivermanager obj = new Webdrivermanager();
		obj.driverInstance();
	}
}
