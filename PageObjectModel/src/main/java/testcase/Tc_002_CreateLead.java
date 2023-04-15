package testcase;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class Tc_002_CreateLead extends ProjectSpecificMethod {
	@Test
public void runCreateLead() {
	LoginPage lp= new LoginPage(driver);
	lp.userName().password()
	.clickLogin()
	.clickcrmsfa()
	.clickLeads()
	.createLead()
	.fname()
	.lname()
	.companyName()
	.clickCreateLead()
	.findFname();
	
}
}
