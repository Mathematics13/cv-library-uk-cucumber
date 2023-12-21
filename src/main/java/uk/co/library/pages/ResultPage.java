package uk.co.library.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import uk.co.library.utility.Utility;

public class ResultPage extends Utility
{
    private static final Logger log = LogManager.getLogger(ResultPage.class.getName());

    //Step 1 Locators WebElement
    @CacheLookup
    @FindBy(xpath="//h1[normalize-space()='Permanent Tester jobs in Harrow on the Hill']")
    WebElement resultText;

    //Step 2 Method Creation
    public String verifyTheResults(String expected)
    {
      return getTextFromElement(resultText);
    }

}
