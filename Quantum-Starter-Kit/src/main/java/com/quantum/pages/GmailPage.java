package com.quantum.pages;

import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebElement;
import com.qmetry.qaf.automation.util.PropertyUtil;

public class GmailPage extends WebDriverBaseTestPage<WebDriverTestPage> {
	
	PropertyUtil props = ConfigurationManager.getBundle();

	@Override
	protected void openPage(PageLocator locator, Object... args) {

	}
	
	@FindBy(locator = "email.id")
	private QAFExtendedWebElement emailid;
	@FindBy(locator = "next.button")
	private QAFExtendedWebElement nextbutton;
	@FindBy(locator = "password")
	private QAFExtendedWebElement password;
	@FindBy(locator = "next.password.button")
	private QAFExtendedWebElement nextpasswordbutton;
	
	public void enterId(String email)
	{
		emailid.sendKeys(email); // sending email as gmail id
		nextbutton.click(); // clicking next button on gmail after entering the id
		
		
	}

	public void enterPassword(String password)
	{
		emailid.sendKeys(password); // Entering password
		nextpasswordbutton.click(); // clicking next button on gmail after entering the password
		
	}
	
	
}
