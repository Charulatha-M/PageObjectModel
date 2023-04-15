package testcase;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages3.LoginPage;

public class Tc_004_EditLead extends ProjectSpecificMethod {
	@Test
public void runEditLead() {
	LoginPage lp= new LoginPage(driver);
	lp.userName().password()
	.clickLogin()
	.clickcrmsfa()
	.clickLeads()
	.findLeads()
	.findLead()
	.editLead()
	.clickOk();
}
}
