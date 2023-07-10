package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Profile_Loginpage {

public static final By profileloginbtn=By.xpath("//div[@id='loginSection']//a[@id='HlLogin']");

	

    public static WebElement profileLoginButton()
    {
    	return Driver.getDriver().findElement(profileloginbtn);

    }

    public static void profile_login() throws Exception {

    	profileLoginButton().click();
        
    }
}
