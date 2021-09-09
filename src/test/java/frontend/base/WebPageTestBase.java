package frontend.base;

import Base.LoggedInBase;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class WebPageTestBase extends LoggedInBase {

    public void websiteTitleShouldMatch() {

        String title = driver.getTitle();
        Assert.assertEquals(title, "ParaBank | Welcome | Online Banking");
    }
}
