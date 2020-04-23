import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class testfireHomePage {

    WebDriver driver;
    @FindBy(xpath="/html/body/table[2]/tbody/tr/td[2]/div/form/table/tbody/tr[2]/td/span/table/tbody/tr[1]/td/h2")
    WebElement homePageUserName;
    public testfireHomePage(WebDriver driver){
        this.driver = driver;
        //This initElements method will create  all WebElements
        PageFactory.initElements(driver, this);
    }
    //Get the User name from Home Page
    public String getHomePageDashboardUserName(){
        return	homePageUserName.getText();
    }
}
