package testcase;



import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages2.LoginPage;

public class Tc_003_MergeLead extends ProjectSpecificMethod {
@Test
public void reunMergeLead() {
	LoginPage lp= new LoginPage(driver);
	lp.userName().password()
	.clickLogin()
	.clickcrmsfa()
	.clickLeads()
	.clickMergeLead()
	.from()
	.to()
	.merge();
}
}
