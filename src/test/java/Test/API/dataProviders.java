package Test.API;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProviders {

	
	@Test(dataProvider="dataInputs")
	public void print(String a,String b)
	{
		System.out.println(a+"      "+b);
	}
	
	
	@DataProvider
	public Object[][] dataInputs()
	{
		
		Object[][] obs=new Object[2][2];
		
		obs[0][0]="abc";
		obs[0][1]="cde";
		obs[1][0]="abc";
		obs[2][0]="cad";
		return obs;
		
	}
}
