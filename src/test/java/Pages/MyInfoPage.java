package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MyInfoPage extends BasePage
{
    WebDriverWait wait = BasePage.wait;


    public MyInfoPage(WebDriver driver)
    {
        super(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[6]/a")
    WebElement MyInfoLink;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[1]/a")
    WebElement PersonalDetails;
    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > div > div.orangehrm-edit-employee-content > div.orangehrm-horizontal-padding.orangehrm-vertical-padding > form > div:nth-child(1) > div > div > div > div.--name-grouped-field > div:nth-child(1) > div:nth-child(2) > input")
    WebElement FirstName;
    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > div > div.orangehrm-edit-employee-content > div.orangehrm-horizontal-padding.orangehrm-vertical-padding > form > div:nth-child(1) > div > div > div > div.--name-grouped-field > div:nth-child(2) > div:nth-child(2) > input")
    WebElement MiddleName;
    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > div > div.orangehrm-edit-employee-content > div.orangehrm-horizontal-padding.orangehrm-vertical-padding > form > div:nth-child(1) > div > div > div > div.--name-grouped-field > div:nth-child(3) > div:nth-child(2) > input")
    WebElement LastName;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[1]/div[1]/div/div[2]/input")
    WebElement EmployeeId;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[1]/div[2]/div/div[2]/input")
    WebElement OtherId;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[2]/div[1]/div/div[2]/input")
    WebElement Driverlicense;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[2]/div[2]/div/div[2]/div/div/input")
    WebElement LicenseExpiryDate;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[1]/div/div[2]/div/div/div[1]")
    WebElement Nationality;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[2]/div/div[2]/div/div/div[1]")
    WebElement MaritalStatus ;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[1]/div/div[2]/div/div/input")
    WebElement DateofBirth;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[2]/div/div[2]/div[1]/div[2]/div/label")
    WebElement Male;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/label")
    WebElement Female;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[4]/button")
    WebElement SaveProfile;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div/form/div[1]/div/div[1]/div/div[2]/div/div/div[1]")
    WebElement BloodType;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div/form/div[1]/div/div[2]/div/div[2]/input")
    WebElement TestField;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div/form/div[2]/button")
    WebElement saveBlood;

    public void clickMyInfo()
    {
        wait.until(ExpectedConditions.elementToBeClickable(MyInfoLink));
        MyInfoLink.click();
    }
    public void clickPersonalDetails()
    {
        wait.until(ExpectedConditions.elementToBeClickable(PersonalDetails));
        PersonalDetails.click();
    }
    public void enterFullName(String fName, String mName, String lName)
    {
        FirstName.sendKeys(fName);
        MiddleName.sendKeys(mName);
        LastName.sendKeys(lName);
    }
    public void enterIds(String empId , String othId)
    {
        EmployeeId.clear();EmployeeId.sendKeys(empId);
        OtherId.clear();OtherId.sendKeys(othId);
    }
    public void enterLicenseDetails(String license , String expiryDate)
    {
        Driverlicense.clear();Driverlicense.sendKeys(license);
        LicenseExpiryDate.clear();LicenseExpiryDate.sendKeys(expiryDate);
    }
    public void selectDropdown(By dropdown, String value)
    {
        wait.until(ExpectedConditions.elementToBeClickable(dropdown));
        driver.findElement(dropdown).click();
        By optionLocator = By.xpath("//div[@role='option']/span[text()='" + value + "']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(optionLocator)).click();
    }
    public void selectNationality(String nationality)
    {
        Nationality.click();
        selectDropdown(By.xpath("//label[text()='Nationality']/../following-sibling::div//div[@class='oxd-select-text']"), nationality);
    }
    public void selectMaritalStatus(String status)
    {
        MaritalStatus.click();
        selectDropdown(By.xpath("//label[text()='Marital Status']/following::div[@class='oxd-select-text'][1]"), status);
    }
    public void enterDOB(String dob)
    {
        DateofBirth.clear(); DateofBirth.sendKeys(dob);
    }
    public void selectGender(String gender)
    {
        if (gender.equalsIgnoreCase("Male")) {
            Male.click();
        } else if (gender.equalsIgnoreCase("Female")) {
            Female.click();
        }
    }
    public void savePp()
    {
        SaveProfile.click();
    }
    public void enterCustomFields(String blood, String custom)
    {
        new Select(BloodType).selectByVisibleText(blood);
        TestField.clear();
        TestField.sendKeys(custom);
    }
    public void saveBd ()
    {
        saveBlood.click();
    }



}
