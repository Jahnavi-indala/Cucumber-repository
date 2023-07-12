package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Profile_Loginpage {

public static final By profileloginbtn=By.xpath("//div[@id='loginSection']//a[@id='HlLogin']");
public static final By clcikprofileDropdownBtn=By.xpath("//i[@class='fa fa-chevron-down']");
public static final By clickMyInformation=By.xpath("//ul[@id='drop1']//a[@id='MyInformationTab']"); 







    public static WebElement profileLoginButton()
    {
    	return Driver.getDriver().findElement(profileloginbtn);

    }
    public static WebElement profileDropdownBtn()
    {
    	return Driver.getDriver().findElement(clcikprofileDropdownBtn);

    }
    public static WebElement clickMyInfoFromProDpdwn()
    {
    	return Driver.getDriver().findElement(clickMyInformation);

    }
    
    
    
    
    
    
    
    
    
    
    public static void profile_login() throws Exception 
    {

    	profileLoginButton().click();
    	Thread.sleep(3000);
        
    }
    public static void clickProfileDropdown() throws Exception 
    {

    	profileDropdownBtn().click();
    	Thread.sleep(3000);

    }
    
    public static void clickMyInformationFromProfileDrpdwn() throws Exception 
    {

    	clickMyInfoFromProDpdwn().click();
    	Thread.sleep(3000);

    }
    
    
    
    
    
    
    
    
}
