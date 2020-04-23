import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class testDemo {

    WebDriver driver;
    testfireLogin objLogin;
    testfireHomePage objHomePage;

    @Before
    public void setup(){
        // 如果你的 FireFox 没有安装在默认目录，那么必须在程序中设置
        System.setProperty("webdriver.gecko.driver", "D:\\Maven\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://testfire.net/bank/main.jsp");
    }

    /**
     * This test go to http://testfire.net/bank/main.jsp
     * Login to application
     * Verify the home page using Dashboard message
     */
    @Test
    public void test_Home_Page_Appear_Correct(){
        //Create Login Page object
        objLogin = new testfireLogin(driver);
        //Verify login page title
//        String loginPageTitle = objLogin.getLoginTitle();
//        Assert.assertTrue(loginPageTitle.toLowerCase().contains("Congratulations!"));
        //login to application
        objLogin.logintestfire("admin", "admin");
        // go the next page
        objHomePage = new testfireHomePage(driver);
        //Verify home page
        Assert.assertTrue(objHomePage.getHomePageDashboardUserName().contains("Congratulations!"));
    }

}
