package testNGpackagestephen;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenFrameworkwithTestNG {
	@Test(dataProvider="samsung")
	public static void Login(String name,String password)
	{
		System.out.println("Name is "+name+ "and Password is" +password);
	}
	
	
	@DataProvider(name="samsung")
	public Object[][] datasuppliermethod(){
		
	Object[][] obj= {{"stephen","j45"},{"sigma","j15"},{"roger","f56"}};
	
		return obj;
	}
	
	

}
