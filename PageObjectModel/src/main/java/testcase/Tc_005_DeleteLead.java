package testcase;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import page4.LoginPage;

public class Tc_005_DeleteLead extends ProjectSpecificMethod {
@Test
public void runDelete() {
	LoginPage lp=new LoginPage(driver);
	lp.userName().password()
	.clickLogin()
	.clickcrmsfa()
	.clickLeads()
	.findLeads()
	.pnum()
	.delete();
}
}
