package com.openmrs.testdata;

import org.testng.annotations.DataProvider;

public class RegisterPatient {
	@DataProvider(name="RegisterPatientHeader")
	public static Object[] VerifyRegisterPatientHeadere() 
	{
		Object[][] data= new Object[1][1];
		data[0][0]= "Register a patient";
		
				
		return data;
	}
	@DataProvider(name="RegisterPatientName")
	public static Object[] VerifyPatientName() 
	{
		Object[][] data= new Object[1][20];
		data[0][0]= "Test";
		data[0][1]= "Calab";
		data[0][2]=	"10";
		data[0][3]= "February";
		data[0][4]=	"1996";
		data[0][5]= "Test";
		data[0][6]= "Main Street";
		data[0][7]= "Newyork";
		data[0][8]= "NY";
		data[0][9]= "USA";
		data[0][10]= "10022";
		data[0][11]= "8877665544";
		data[0][12]= "Name: Test, Calab";
		data[0][13]= "Gender: Male";
		data[0][14]="Birthdate: 10, February, 1996";
		data[0][15]= "Address: Test, Main Street, Newyork, NY, USA, 10022";
		data[0][16]="Phone Number: 8877665544";
		data[0][17]="Test";
		data[0][18]="Testing";
		data[0][19]="TEST";
		
		
		return data;
	
	}
//	@DataProvider(name="ConfirmPatientDetails")
//	public static Object[] VerifyConfirmPatientDetails() 
//	{
//		Object[][] data= new Object[1][17];
//		data[0][0]= "Test";
//		data[0][1]= "Calab";
//		data[0][2]=	"10";
//		data[0][3]= "February";
//		data[0][4]=	"1996";
//		data[0][5]= "Test";
//		data[0][6]= "Main Street";
//		data[0][7]= "Newyork";
//		data[0][8]= "NY";
//		data[0][9]= "USA";
//		data[0][10]= "10022";
//		data[0][11]= "8877665544";
//		data[0][12]= "Name: Test, Calab";
//		data[0][13]= "Gender: Male";
//		data[0][14]="Birthdate: 10, February, 1996";
//		data[0][15]= "Address: Test, Main Street, Newyork, NY, USA, 10022";
//		data[0][16]="Phone Number: 8877665544";	
//		return data;
//	
//	}
//	@DataProvider(name="PatientDetails")
//	public static Object[] VerifyPatientDetails() 
//	{
//		Object[][] data= new Object[1][13];
//		data[0][0]= "Test";
//		data[0][1]= "Calab";
//		data[0][2]=	"10";
//		data[0][3]= "February";
//		data[0][4]=	"1996";
//		data[0][5]= "Test";
//		data[0][6]= "Main Street";
//		data[0][7]= "Newyork";
//		data[0][8]= "NY";
//		data[0][9]= "USA";
//		data[0][10]= "10022";
//		data[0][11]= "8877665544";
//		data[0][12]= "Test";
//		return data;
//	
//	}
}
