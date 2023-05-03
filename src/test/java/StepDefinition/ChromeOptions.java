package StepDefinition;

import org.openqa.selenium.WebDriver;

public class ChromeOptions {
	public WebDriver driver1;

ChromeOptions options = new ChromeOptions();
options.addArguments("--proxy-server=http://proxyserver.com:port");
WebDriver driver = new ChromeDriver(options);
}