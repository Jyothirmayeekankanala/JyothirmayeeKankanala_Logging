package com.epam.Logging_Code;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
class Simple_Interest
{
	private static Logger myLogger=LogManager.getLogger(Simple_Compound_Interest.class);
	Scanner sc=new Scanner(System.in);
	private double principle_amt,time_period,rate_interest;
	public void read_input() 
	{
		myLogger.info("Entry of read_input method\n");
		myLogger.info("\nSIMPLE INTEREST :\n");
		myLogger.info("Enter the principal amount");
		principle_amt=sc.nextDouble();
		myLogger.info(principle_amt);
		myLogger.info("Enter the rate of interest");
		rate_interest=sc.nextDouble();
		myLogger.info(rate_interest);
		myLogger.info("Enter the time period(years)");
		time_period=sc.nextDouble();
		myLogger.info(time_period);
		myLogger.info("Exit of read_input method\n");
	}
	public double calculate_interest()
	{
		//A=P(1+r*t)
		double int_res=(rate_interest/100)*time_period;
		myLogger.info("returning amount from calculate_interest method\n");
		return (principle_amt*(1+int_res));
	}
}
class Compound_Interest
{
	private static Logger myLogger=LogManager.getLogger(Simple_Compound_Interest.class);
	private double principle_amt,time_period,rate_interest,no_times_compounded;
	Scanner sc=new Scanner(System.in);
	public void read_input()
	{
		myLogger.info("Entry of read_input method\n");
		myLogger.info("\n\nCOMPOUND INTEREST :\n");
		myLogger.info("Enter the principal amount");
		principle_amt=sc.nextDouble();
		myLogger.info(principle_amt);
		myLogger.info("Enter the rate of interest");
		rate_interest=sc.nextDouble();
		myLogger.info(rate_interest);
		myLogger.info("Enter the time period(years)");
		time_period=sc.nextDouble();
		myLogger.info(time_period);
		myLogger.info("Enter no. of times the interest is compounded per year");
		no_times_compounded=sc.nextDouble();
		myLogger.info(no_times_compounded);
		myLogger.info("Exit of read_input method\n");
	}
	public double calculate_interest()
	{
		//A=P(1+r/n)^(nt)
		myLogger.info("Entry of calculate_interest method\n");
		double exp=no_times_compounded*time_period;
		double int_res=Math.pow(1+(rate_interest/100)/no_times_compounded,exp);
		myLogger.info("Exit of calculate_interest method\n");
		return int_res*principle_amt;
		
	}
}
public class Simple_Compound_Interest 
{
	private static Logger myLogger=LogManager.getLogger(Simple_Compound_Interest.class);
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Simple_Interest s_i=new Simple_Interest();
		s_i.read_input();
		myLogger.info("Future value by applying Simple Interest : "+String.valueOf(s_i.calculate_interest()));
		Compound_Interest c_i=new Compound_Interest();
		c_i.read_input();
		myLogger.info("Future value by applying Compound Interest : "+String.valueOf(c_i.calculate_interest()));
	}
}