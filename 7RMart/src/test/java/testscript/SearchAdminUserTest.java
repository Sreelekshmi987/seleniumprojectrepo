package testscript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import constant.Constant;
import pages.AdminUserPage;
import pages.HomePage;
import pages.LoginPage;
import pages.SearchAdminUser;
import utilities.ExcelUtilities;
public class SearchAdminUserTest extends Base
{
	HomePage home;
	AdminUserPage admin;
	SearchAdminUser search;
  @Test
  public void verifyuserisabletosearchadminuser() throws IOException {
String username=ExcelUtilities.getStringName(1, 0,"Loginpage");
	  String password=ExcelUtilities.getStringName(1, 1,"Loginpage");
	  /*LoginPage login=new LoginPage(driver);
	  login.enterUsernameField(username);
	  login.enterPasswordField(password);
	  home=login.clickLoginButton();*/
//AdminUserPage admin=new AdminUserPage(driver);
	  admin=home.clickadminuserbutton();
	  
	  String username2=ExcelUtilities.getStringName(1, 0,"Searchadmin");
//SearchAdminUser search=new SearchAdminUser(driver);
	  search.clicksearch();
	  search.enterusername(username2);
	  search.clicksearchbutton();
	  
	  boolean isResultloaded=search.isResultload();
	  assertTrue(isResultloaded,Constant.ERRORMSG4);
  }
}