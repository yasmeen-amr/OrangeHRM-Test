package Tests;

import Pages.LoginPage;
import Pages.MyInfoPage;
import org.testng.annotations.Test;

public class MyInfoTest extends BaseTest
{
    @Test
    public void validPersonalDetails()
    {
        LoginPage login = new LoginPage(driver);
        login.Login("Admin" , "admin123");
        MyInfoPage MyInfo = new MyInfoPage(driver);
        MyInfo.clickMyInfo();
        MyInfo.clickPersonalDetails();
        MyInfo.enterFullName("yasmeen" , "Amr" , "hussein");
//        MyInfo.enterIds("muser" , "987654");
//        MyInfo.enterLicenseDetails("87654" , "2023-11-09");
//        MyInfo.selectNationality("American");
//        MyInfo.selectMaritalStatus("Single");
//        MyInfo.enterDOB("2002-03-12");
//        MyInfo.selectGender("Female");
//        MyInfo.savePp();
//        MyInfo.enterCustomFields("A+" , "445");
//        MyInfo.saveBd();

    }
}
