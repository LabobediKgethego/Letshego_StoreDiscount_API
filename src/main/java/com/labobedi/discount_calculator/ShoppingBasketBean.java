package com.labobedi.discount_calculator;
/*Author K Labobedi
 * 09 SEP 2021 10:32
 *kgethegolabobedi@gmail.com
 *(+267)77 599 020
 * */
public class ShoppingBasketBean {
	CalculateDiscount calculateDiscount = new CalculateDiscount();
	String youBought = "YOU BOUGHT:;";
	double totalPayable= 0;
	double  price1=0,
			price2=0,
			price3=0,
			price4=0,
			price5=0,
			price6=0,
			price7=0,
			price8=0,
			price9=0;
	String  item1 = "",
			item2 = "",
			item3 = "",
			item4 = "",
			item5 = "",
			item6 = "",
			item7 = "",
			item8 = "",
			item9 = "";
	String Bakery_and_Bread = "null"
	,Meat_and_Seafood = "null",
	Pasta_and_Rice="null",
	Oils_Sauces_Salad_Dressings_and_Condiment="null";
	
	String trying = "null";
	
	
	public String getTrying() {
		return trying;
	}

	public void setTrying(String trying) {
		this.trying = trying;
	}
	String Channel_Home_Theater_System="null",
		Mirror_Microwave="null",
		Slow_Cooker="null",
		cc_Air_Conditioner="null";
	
	
	String customer_type="null";
	
	String customer_username = "null";
	
	
	public String getCustomer_username() {
		return customer_username;
	}

	public void setCustomer_username(String customer_username) {
		this.customer_username = customer_username;
	}

	public String getCustomer_type() {
		return customer_type;
	}

	public void setCustomer_type(String customer_type) {
		this.customer_type = customer_type;
	}
	String customer_since ="null";
	
	public String getCustomer_since() {
		return customer_since;
	}

	public void setCustomer_since(String customer_since) {
		this.customer_since = customer_since;
	}

	public String getCustomerType() {
		return customer_type;
	}

	public void setCustomerType(String customerType) {
		this.customer_type = customerType;
	}

	public String getChannel_Home_Theater_System() {
		return Channel_Home_Theater_System;
	}

	public void setChannel_Home_Theater_System(String channel_Home_Theater_System) {
		Channel_Home_Theater_System = channel_Home_Theater_System;
	}

	public String getMirror_Microwave() {
		return Mirror_Microwave;
	}

	public void setMirror_Microwave(String mirror_Microwave) {
		Mirror_Microwave = mirror_Microwave;
	}

	public String getSlow_Cooker() {
		return Slow_Cooker;
	}

	public void setSlow_Cooker(String slow_Cooker) {
		Slow_Cooker = slow_Cooker;
	}

	public String getCc_Air_Conditioner() {
		return cc_Air_Conditioner;
	}

	public void setCc_Air_Conditioner(String cc_Air_Conditioner) {
		this.cc_Air_Conditioner = cc_Air_Conditioner;
	}

	public String getBakery_and_Bread() {
		return Bakery_and_Bread;
	}

	public void setBakery_and_Bread(String bakery_and_Bread) {
		this.Bakery_and_Bread = bakery_and_Bread;
	}

	public String getMeat_and_Seafood() {
		return Meat_and_Seafood;
	}

	public void setMeat_and_Seafood(String meat_and_Seafood) {
		this.Meat_and_Seafood = meat_and_Seafood;
	}

	public String getPasta_and_Rice() {
		return Pasta_and_Rice;
	}

	public void setPasta_and_Rice(String pasta_and_Rice) {
		this.Pasta_and_Rice = pasta_and_Rice;
	}

	public String getOils_Sauces_Salad_Dressings_and_Condiment() {
		return Oils_Sauces_Salad_Dressings_and_Condiment;
	}

	public void setOils_Sauces_Salad_Dressings_and_Condiment(String oils_Sauces_Salad_Dressings_and_Condiment) {
		this.Oils_Sauces_Salad_Dressings_and_Condiment = oils_Sauces_Salad_Dressings_and_Condiment;
	}
	public String youBought() {
		if (getBakery_and_Bread() != "null") {
			youBought +="Bakery_and_Bread"+";";
			item1 = "Bakery_and_Bread $195.00;";
			price1=195.00;
		}
		if (!getMeat_and_Seafood().equals("null")) {
			youBought +="Meat_and_Seafood"+";";
			item2 = "Meat_and_Seafood $459.50;";
			price2=459.50;
		}
		if (getPasta_and_Rice() != "null") {
			youBought +=Pasta_and_Rice+";";
			item3 = "Pasta_and_Rice $250.95;";
			price3=250.95;
			
		}
		if (getOils_Sauces_Salad_Dressings_and_Condiment() != "null") {
			youBought +=Oils_Sauces_Salad_Dressings_and_Condiment;
			item4 = "Oils_Sauces_Salad_Dressings_and_Condiment $ 2540.95;";
			price4=2540.95;
			
		}
		
		if (getChannel_Home_Theater_System() != "null") {
			youBought +="Channel_Home_Theater_System"+";";
			item5 = "5.1 Channel_Home_Theater_System $ 1195.00;";
			price5= 1195.00;
		}
		if (getMirror_Microwave() != "null") {
			youBought +="Mirror_Microwave"+";";
			item6 = "Mirror_Microwave $ 809.90;";
			price6=809.90;
		}
		if (getSlow_Cooker() != "null") {
			youBought +="Slow_Cooker"+";";
			item7 = "Slow_Cooker $ 595.00;";
			price7= 595.00;
		}
		if (getCc_Air_Conditioner() != "null") {
			youBought +="cc_Air_Conditioner"+";";
			item8 = "48 cc_Air_Conditioner$ 7440.40;";
			price8=7440.40;
		}
		
		
		return youBought;
	}
	public double calculateDiscount() {
		
		String determineDiscount = calculateDiscount.determineDiscount(customer_type,customer_since,price1,price2,price3,price4);
		
		System.out.println(determineDiscount.toUpperCase());
		trying="determineDiscount.toUpperCase()";
		if (determineDiscount.toUpperCase().equals("CUSTOMER_DISCOUNT")) {
			
			return calculateDiscount.calculateCustomerDiscount(totalPayable);
		}
       if (determineDiscount.toUpperCase().equals("AFFILIATE_DISCOUNT")) {
			
    	   return calculateDiscount.calculateAffiliateDiscount(totalPayable);
    			
       }
       if (determineDiscount.toUpperCase().equals("EMPLOYEE_DISCOUNT")) {
			
    	   return calculateDiscount.calculateEmployeeDiscount(totalPayable);
       		
       }
       if (determineDiscount.toUpperCase().equals("FIVE_OF_HUNDRED_DISCOUNT(INCLUDED GROCERY)")) {
			
    	   return calculateDiscount.calculateFiveOfHundredDiscount(totalPayable);
       		
       }
       return 0;
	}
	public String[] getResults() {
		totalPayable = price1+price2+price3+price4+price5+price6+price7+price8+price9;
		Double totalPayableAfterDiscount = totalPayable-calculateDiscount();
		String ShoppingList = item1+item2+item3+item4+item5+item6+item7+item8+item9+"TOTAL PAYABLE: $"+totalPayable+";"+"DISCOUNT: $"+calculateDiscount()+";"+"TOTAL PAYABLE AFTER DISCOUNT: "+totalPayableAfterDiscount;
		
		String[] values = ShoppingList.split(";");
		
		return values;
		
	}
	public String message() {
		return "Hey "+ customer_username + " Here Is Your Bill";
		
	}
	public String message2() {
		String determineDiscount = calculateDiscount.determineDiscount(customer_type,customer_since,price1,price2,price3,price4);
		return "Discount Type: "+determineDiscount;
		
	}
	public String total() {
		Double totalPayableAfterDiscount = totalPayable-calculateDiscount();
		return "TOTAL PAYABLE AFTER DISCOUNT: $"+totalPayableAfterDiscount;
	}
}