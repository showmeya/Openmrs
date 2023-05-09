package com.openmrs.testcase;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.openmrs.testdata.LoginTestData;

public class TC_Login01 extends BaseClass{
@BeforeMethod
public void loginTo() throws Exception {
	loginToOpenMRS();
}
@AfterMethod
public void logOut() throws Exception {
	logout();
}
@Test(priority = 1, enabled = true, dataProvider = "DashboardTitle", dataProviderClass = LoginTestData.class)
public void Dashboard(String DashboardTitle) {
	if (driver.getTitle().equals(DashboardTitle)) {
		Assert.assertTrue(true);
	}
	else {
		Assert.assertTrue(false);
	}
}
}