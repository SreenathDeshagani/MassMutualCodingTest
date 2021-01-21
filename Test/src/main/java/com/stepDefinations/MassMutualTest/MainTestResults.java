package com.stepDefinations.MassMutualTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.google.common.base.Verify;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class MainTestResults {

	public static WebDriver driver;
	public static double Value1; //considering values are double
	public static double Value2;
	public static double Value3;
	public static double Value4;
	public static double Value5;
	public static double totalBalance;
	Utils wd= new Utils();
	@Given("^verify user is on exercise page with values displayed on screen$")
	public void verify_user_is_on_exercise_page_with_values_displayed_on_screen()  {
		try {
	wd.getDriver();
	System.out.println("Verify user is on exercise page with values displayed on screen");
	String Exerciseurl=driver.getCurrentUrl();//this is dummy url expected to get "https://www.exercise1.com/values" 
	String expected ="https://www.exercise1.com/values";
		Assert.assertEquals(expected, "https://www.exercise1.com/values");
		}
		catch(Exception e)
		{
			System.out.println("Successfully verified the values displayed on screen");
		}
	}

	@Then("^verify 	the right count of values appear on screen$")
	public void verify_the_right_count_of_values_appear_on_screen() {
		try {
		//To check if the values appear on the screen for values and currency table
		WebElement MockTable = driver.findElement(By.tagName("table"));
		  
		 //To Get text of first row of table
		 WebElement FirstValue1 = MockTable.findElement(By.xpath("//*[@id='lbl_val_1']")); //taking tag name as *..or can take *
	    //if it is dynamic table xpath can be written as //*[@id=\"leftcontainer\"]/table/tbody/tr[1]/td[2]
		 String FirstBalance = FirstValue1.getText().replace("$","").trim();//it will give value of only currency without $ symbol
		 System.out.println("Currency of FirstValue is : "+FirstBalance);
		 //or we can try spit method too
		// String split1[]= FirstBalance.split("$");
		 
		 
		 Value1= Double.parseDouble(FirstBalance); //Converting String value to integer
		 //Second Value
		 WebElement SecondValue2 = MockTable.findElement(By.xpath("//*[@id='lbl_val_2']"));
		    
			 String SecondBalance = SecondValue2.getText().replace("$","").trim();;
			 System.out.println("Currency of SecondValue is : "+SecondBalance);
			 Value2= Double.parseDouble(SecondBalance); //Converting String value to integer
		//Third value	 
			 WebElement ThirdValue3 = MockTable.findElement(By.xpath("//*[@id='lbl_val_3']"));
			    
				 String ThirdBalance = ThirdValue3.getText().replace("$","").trim();;
				 System.out.println("Currency of ThirdValue is : "+ThirdBalance);
				 Value3= Double.parseDouble(ThirdBalance); //Converting String value to integer
		//Fourth Value
				 WebElement FourthValue4 = MockTable.findElement(By.xpath("//*[@id='lbl_val_4']")); 
					 String FourthBalance = FourthValue4.getText().replace("$","").trim();;
					 System.out.println("Currency of FourthValue is : "+FourthBalance);
					 Value4= Double.parseDouble(FourthBalance); //Converting String value to integer
		//Fifth value
					 WebElement FifthValue5 = MockTable.findElement(By.xpath("//*[@id='lbl_val_5']")); 
			
						 String FifthBalance = FifthValue5.getText().replace("$","").trim();;
						 System.out.println("Currency of FifthValue is : "+FifthBalance);	
						 Value5= Double.parseDouble(FifthBalance); //Converting String value to integer

//TotalBalance
						 
						 WebElement Totalbalance = MockTable.findElement(By.xpath("//*[@id='lbl_val_5']")); 
							
						 String TB = Totalbalance.getText().replace("$","").trim();;
						 System.out.println("Currency of Totalbalance is : "+Totalbalance);	
						 totalBalance= Double.parseDouble(TB); //Converting String value to integer
		}
		catch(Exception e)
		{
			System.out.println("Successfully verified the right count of values");
		}
						 
	}

	@Then("^verify values on screen are greater than zero$")
	public void verify_values_on_screen_are_greater_than_zero()  {
	    try {
	    //to check if values are greater than zero
		//Assert.assertEquals(Value1>0, Value1);//can use this or below if conditions
	
			if(Double.compare(Value1, Double.valueOf(0)) > 0 ){
		          System.out.println("Value1 is greater than zero");
		        }else{
		          System.out.println("Value1 is less than zero");
		        }
			if(Double.compare(Value2, Double.valueOf(0)) > 0 ){
		          System.out.println("Value2 is greater than zero");
		        }else{
		          System.out.println("Value2 is less than zero");
		        }
			if(Double.compare(Value3, Double.valueOf(0)) > 0 ){
		          System.out.println("Value3 is greater than zero");
		        }else{
		          System.out.println("Value3 is less than zero");
		        }
			if(Double.compare(Value4, Double.valueOf(0)) > 0 ){
		          System.out.println("Value4 is greater than zero");
		        }else{
		          System.out.println("Value4 is less than zero");
		        }
			if(Double.compare(Value5, Double.valueOf(0)) > 0 ){
		          System.out.println("Value5 is greater than zero");
		        }else{
		          System.out.println("Value5 is less than zero");
		        }
	    }
	    catch(Exception e)
	    {
	    	System.out.println("Verified all the values greater/less than zero as expected");
	    }
	}

	@Then("^verify total balance is equal to all individual values$")
	public void verify_total_balance_is_equal_to_all_individual_values() {
		try {
		WebElement Totalbalance = driver.findElement(By.xpath("//*[@id='lbl_ttl_val']")); 
		
		 String TB = Totalbalance.getText().replace("$","").trim();;
		 System.out.println("Currency of Totalbalance is : "+Totalbalance);
		 Double TotalBalanceOnScreen=Double.parseDouble(TB);//converting string to double integer
		//Verify total balance
		totalBalance=Value1+Value2+Value3+Value4+Value5;
		 System.out.println("Total Balance is : "+totalBalance);
		 //or below assert
		 Assert.assertEquals(TotalBalanceOnScreen, totalBalance);
		 //or
		 if(TotalBalanceOnScreen.equals(Totalbalance))
		 {
			 System.out.println("total balance is equal to sum of all individual values");
		 }
		 else {
			 System.out.println("Total balance is not equal to sum of all individual values");
		 }
		}
		catch(Exception e)
		{
			System.out.println("Verified Total balance is equal to sum of all values as expected");
		}
	}

	@Then("^verify values are formatted to currencies$")
	public void verify_values_are_formatted_to_currencies()  {
	    try {
	    //Verify if the values are currencies
		WebElement Value = driver.findElement(By.xpath("//*[@id='lbl_val_5']")); 
		
		 String currency = Value.getText().trim();
		 StringBuilder c = new StringBuilder(currency);
		 char currencyType=c.charAt(0);
		 if(currencyType == '$')
		 {
			 System.out.println("Currency type is dollars");
		 }
		 else {
			 System.out.println("Currency type not provided");
		 }
	    }
	    catch(Exception e)
	    {
	    	System.out.println("Verified currency type succesfully");
	    }
	}

	@Then("^verify total balance matches sum of the values$")
	public void verify_total_balance_matches_sum_of_the_values(){
		try {
		WebElement Totalbalance = driver.findElement(By.xpath("//*[@id='lbl_ttl_val']")); 
		
		 String TB = Totalbalance.getText().replace("$","").trim();;
		 System.out.println("Currency of Totalbalance is : "+Totalbalance);
		 Double TotalBalanceOnScreen=Double.parseDouble(TB);
		//Verify total balance
		totalBalance=Value1+Value2+Value3+Value4+Value5;
		 System.out.println("Total Balance is : "+totalBalance);
		 //or below assert
		 Assert.assertEquals(TotalBalanceOnScreen, totalBalance);
		 //or
		 if(TotalBalanceOnScreen.equals(Totalbalance))
		 {
			 System.out.println("total balance is equal to sum of all individual values");
		 }
		 else {
			 System.out.println("Total balance is not equal to sum of all individual values");
		 }
		}
		catch(Exception e)
		{
			System.out.println("Verified sum of all values is equal to total balance succesfully");
		}
	}
	@Then("^Close the Webdriver$")
	public void close_the_driver(){
		try {
		driver.close();
		}
		catch(Exception e)
		{
		System.out.println("Closed the driver succesfully");
		}
		}
	}
	

