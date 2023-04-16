package testcase;

import org.testng.annotations.Test;

import Page5.LoginPage;
import base.ProjectSpecificMethod;

public class Tc_006_DuplicateLead extends ProjectSpecificMethod{
	@Test
public void runDuplicate() {
	LoginPage lp=new LoginPage(driver);
	lp.userName().password().clickLogin()
	.clickcrmsfa().clickLeads()
	.findLeads().pnum().duplicate();
	
}
}
