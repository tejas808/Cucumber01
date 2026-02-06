package com.vtiger.stepsdefinitions;

import com.vtiger.pages.AccountPage;
import com.vtiger.pages.HomePage;
import com.vtiger.pages.LeadPage;
import com.vtiger.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class basesteps {

    public static WebDriver driver;
    public static LoginPage lp;
    public static HomePage hp;
    public static LeadPage ldp;
    public static AccountPage ap;

    public void LaunchApp()
    {
        // ChromeOptions options = new ChromeOptions();

        // ===== Headless Configuration =====
        // options.addArguments("--headless=new");
        // driver = new ChromeDriver(options);
        driver = new ChromeDriver();
        driver.get("http://localhost:100");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

         lp = new LoginPage(driver);
         hp = new HomePage(driver);
         ldp = new LeadPage(driver);
         ap=new AccountPage(driver);

    }
}
