package com.openmrs.testdata;
import org.testng.annotations.DataProvider;


public class LoginTestData {
	@DataProvider(name="DashboardTitle")
	public static Object[] VerifyDashboardTitle() 
	{
		Object[][] data= new Object[1][1];
		data[0][0]= "Home";
		return data;
	}
}
