package com.labobedi.discount_calculator;
/*Author K Labobedi
 * 09 SEP 2021 10:32
 *kgethegolabobedi@gmail.com
 *(+267)77 599 020
 * */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


//Class responsible for calculations.
public class CalculateDiscount {

	//Declaring universal variables
	
	String customer;
	String customer_type;
	Date customer_since;
	double totalPayble = 0;
	
	public double calculateEmployeeDiscount(double totalPayable) {
		 double discount = totalPayable*0.30;
         
         return discount;
	}
	public double calculateAffiliateDiscount(double totalPayable) {
		double discount = totalPayable*0.10;
        //double newTotalSum = totalPayable-discount;
		 return discount;
	}
	public double calculateCustomerDiscount(double totalPayable) {
		double discount = totalPayable*0.05;
        //double newTotalSum = totalPayable-discount;
        return discount;
        		
	}
	public double calculateFiveOfHundredDiscount(double totalPayable) {
		      double discount1 = totalPayable%100;
	          double discount2 = totalPayable-discount1;
	          double discount3 = discount2*0.05;
	          //double newTotalSum = totalPayable-discount3;
	          return discount3;
        		
	}
	public String determineDiscount(String customerType, String customer_since, double price1,double price2,double price3,double price4) {
		
		
		if (customerType.equals("Employee")) {
			if (price1>0||price2>0||price3>0||price4>0) {
				String determineDiscount = "Five_Of_Hundred_Discount(included grocery)";
				return determineDiscount;
			}else {
			String determineDiscount = "Employee_Discount";
			return determineDiscount;
			}
		}
			
        if (customerType.equals("Affiliate")) {
        	if (price1>0||price2>0||price3>0||price4>0) {
    			String determineDiscount = "Five_Of_Hundred_Discount(included grocery)";
    			return determineDiscount;
    		}else {
        	String determineDiscount = "Affiliate_Discount";
        	return determineDiscount;
        	}
		}
        
        if (customerType.equals("Ordinary")) {
        	Date date1;
			try {
				date1 = new SimpleDateFormat("yyyy-MM-dd").parse(customer_since);
			
        	
         Date dateToday= new Date();
   		 @SuppressWarnings("deprecation")
   		  Date twoYearsAgoToday = new Date(dateToday.getYear()-2,dateToday.getMonth(),dateToday.getDay());
   		  System.out.println("Two Years Ago is: "+twoYearsAgoToday);    
   		  System.out.println("Customer Since: "+customer_since);
   		  if (date1.compareTo(twoYearsAgoToday)<0) {
   			if (price1>0||price2>0||price3>0||price4>0) {
   				String determineDiscount = "Five_Of_Hundred_Discount(included grocery)";
   				return determineDiscount;
   			}else {
   		      System.out.println("You have been a customer for more than 2 years.");
   		 	String determineDiscount = "Customer_Discount";
   		 return determineDiscount;
   		  }}
   		  else if (date1.compareTo(twoYearsAgoToday)>0) {
   		      System.out.println("Sorry you haven't been a customer for more than 2 years"); 
   		 	String determineDiscount = "No_Discount";
   		 return determineDiscount;
   	       
   		  }
   		  else {
   		      System.out.println("Both Dates are equal");
   		 	String determineDiscount = "Customer_Discount";
   		 return determineDiscount;
   	       
   		      } 
   		  } catch (ParseException e) {
   			// TODO Auto-generated catch block
   			e.printStackTrace();
   		
   		  }
        }
        String determineDiscount = "null";
        return determineDiscount;
        
		
	}
	
}
