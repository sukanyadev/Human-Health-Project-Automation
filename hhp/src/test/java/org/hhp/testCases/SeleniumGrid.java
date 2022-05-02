package org.hhp.testCases;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.hhp.utilities.ReadConfig;

public class SeleniumGrid {
	ReadConfig readconfig=new ReadConfig();
	
	public String baseURL=readconfig.getApplicationURL();
	public String username=readconfig.getUsername();
	public String password=readconfig.getPassword();
	public static WebDriver webDriver;
	public static RemoteWebDriver driver;
	public static Logger logger;
	
	@Parameters("browser")
	@BeforeTest
	public void setup(String br) throws MalformedURLException
	{			
		logger = LogManager.getLogger("hhplog");
	//	PropertyConfigurator.configure("log4j.properties");
		
		if(br.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",readconfig.getChromePath());
//			WebDriverManager.chromedriver().setup();
			System.out.println("Env username:" + System.getenv().get("USERNAME"));
			
			ChromeOptions options = new ChromeOptions();
//			options.addArguments("--headless");
			options.addArguments("start-maximized");
			options.addArguments("--incognito");
//			options.addArguments("--disable-dev-shm-usage");
			
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability("platform", "Linux");
			capabilities.setCapability("browserName", "chrome");
			capabilities.setCapability("version", "94.0");
			capabilities.setCapability("build", "HHPSeleniumGRID");
			capabilities.setCapability("name", "HHPSeleniumGRIDTest");
			capabilities.setCapability("console", true);
			capabilities.setCapability("selenium_version", "3.14.0");
			capabilities.setCapability("chrome.driver", "94.0");
			capabilities.setCapability(ChromeOptions.CAPABILITY, options);
			
			driver = new RemoteWebDriver(new URL("http://localhost:4445/wd/hub"), capabilities);
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.get(baseURL);

	//		driver=new ChromeDriver();
		}
		else if(br.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",readconfig.getFirefoxPath());
			webDriver = new FirefoxDriver();
		}
		else if(br.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver",readconfig.getIEPath());
			webDriver = new InternetExplorerDriver();
		}
//		driver.manage().deleteAllCookies();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		driver.get(baseURL);
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
	
	
}
