package steps;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.UserPage;

public class UserPageDef {
    UserPage userPage = new UserPage();

    @Then("Click on user icon")
    public void clickOnUserIcon() {
        userPage.clickOnUserIcon();
    }

    @Then("Check user name")
    public void checkUserName() {
        String expect = ("Zareh10");
        String actual = userPage.getUserName();
        Assert.assertEquals(expect,actual);
    }

}
