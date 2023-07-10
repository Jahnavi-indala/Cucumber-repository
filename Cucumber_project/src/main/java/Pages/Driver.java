package Pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Driver {

	public static WebDriver driver;

	public static FileInputStream file;
	public static Properties pro;

	public static void properties_file() throws IOException 
	{

		file=new FileInputStream("C:\\GIT_workspace\\Cucumber-repository\\Cucumber_project\\Cong.properties");
		pro= new Properties();
		pro.load(file);
		file.close();

	}

	public static void  driverInstallization() throws Exception 
	{

		driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		properties_file();
		driver.get(pro.getProperty("url"));
		driver.manage().window().maximize();

	}

	public static WebDriver getDriver() 
	{
		return driver;

	}

	public static void 	quit() {

		driver.quit();

	}












}
