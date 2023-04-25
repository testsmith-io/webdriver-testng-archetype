#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ${package}.properties.Environment;

import static org.assertj.core.api.Assertions.assertThat;

public class HomePage extends AbstractPage<HomePage> {

    @FindBy(css = "[data-test='nav-sign-in']")
    private WebElement signInButton;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @Step("Open the Practice Software Testing homepage")
    @Override
    protected void load() {
        driver.get(Environment.getProperties().url());
    }

    @Override
    protected void isLoaded() throws Error {
        assertThat(driver.getTitle()).isEqualTo("Practice Software Testing - Toolshop - v5.0");
    }

    @Step("Is Sign In button displayed")
    public boolean isSignInButtonDisplayed() {
        return signInButton.isDisplayed();
    }

}
