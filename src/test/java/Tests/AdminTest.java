package Tests;

import Pages.AdminPage;
import Pages.LoginPage;
import org.testng.annotations.Test;

import java.time.Duration;

public class AdminTest extends BaseTest
{
    @Test
    public void TestAdminSearch() throws InterruptedException
    {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.Login("Admin", "admin123");
        AdminPage adminPage = new AdminPage(driver);
        adminPage.AdminLoginbutton();
        adminPage.SetUsername("Admin");
        adminPage.SearchButton();

    }

    @Test
    public void AddPageTest() throws InterruptedException
    {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.Login("Admin", "admin123");
        AdminPage adminPage = new AdminPage(driver);
        adminPage.AdminLoginbutton();
        adminPage.AddButton();
        adminPage.SetUserRole("Admin");
        adminPage.SetEmployeeName("yasminnn");
        adminPage.SetStatus("Enabled");
        adminPage.SetUsernameAdd("Yasooo");
        adminPage.SetPasswordAdd("Admin1112");
        adminPage.SetConfirmPasswordAdd("Admin1112");
        adminPage.SaveButton();

    }



}
