package testNGpackagestephen;

import org.testng.annotations.Test;

public class DependenciesManagement {
@Test
 public void highschool()
 {
	 System.out.println("HighSchool");
 }
@Test(dependsOnMethods="highschool")
 public void Engineering()
 {
	 System.out.println("ECE");
 }
 @Test(dependsOnMethods="Engineering")
 public void Imarticus()
 {
	 System.out.println("InvestmentBanking Course Training");
}
 @Test(dependsOnMethods="Imarticus")
 public void SocieteGenerale()
 {
	 System.out.println("Analyst at Societe Generale");
 }
 @Test(dependsOnMethods="Engineering")
 public void Selenium()
 {
	 System.out.println("Selenium Training");
 }
 @Test(dependsOnMethods="Selenium")
 public void AutomationEngineer()
 {
	System.out.println("Got Placed"); 
 }
 
}
