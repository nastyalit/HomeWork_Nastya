import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TelRan extends TestBase {
    @Test
    public void testTopMenu() throws InterruptedException {
        openSite("https://www.tel-ran.com/");
        pause(5000);
        String menuTitle = getMenuTitle(7);
        clickOnMenuByIndex(7);
        pause(5000);
        String pageTitle = getPageTitle();
        System.out.println("menu: " + menuTitle + "; page: " + pageTitle);
        Assert.assertEquals(pageTitle, menuTitle);
        back();

    }

}
