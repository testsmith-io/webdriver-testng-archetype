#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.pages;

import io.qameta.allure.Step;
import org.example.properties.Environment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ${package}.properties.Environment;

import static org.assertj.core.api.Assertions.assertThat;

public class HomePage extends AbstractPage<HomePage> {

    private final By signInButton = By.cssSelector("[data-test='nav-sign-in']");;

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
        return driver.findElement(signInButton).isDisplayed();
    }

}
