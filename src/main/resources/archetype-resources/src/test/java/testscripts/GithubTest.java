#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.testscripts;

import ${package}.pages.HomePage;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

@Test
public class GithubTest extends TestBase {

    public void verifyGithubSlogan() {
        HomePage homePage = new HomePage(getDriver());
        homePage.get();
        assertThat(homePage.getSloganText()).isEqualTo("Make your contribution");
    }

    public void verifyGithubSloganWithTypo() {
        HomePage homePage = new HomePage(getDriver());
        homePage.get();
        assertThat(homePage.getSloganText()).isEqualTo("Make your contributions");
    }
}
