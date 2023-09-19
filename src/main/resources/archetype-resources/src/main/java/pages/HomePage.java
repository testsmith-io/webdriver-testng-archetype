#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import ${package}.properties.Environment;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPageBase {

    @FindBy(css = "[data-test='nav-sign-in']")
    private WebElement signInButton;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @Step("Open the Practice Software Testing homepage")
    protected HomePage open() {
        driver.get(Environment.getProperties().url());
        return this;
    }

    @Step("Is Sign In button displayed")
    public boolean isSignInButtonDisplayed() {
        return signInButton.isDisplayed();
    }

}
