package com.epam.Clean_Code;
import java.util.Scanner;
class Simple_Interest
{
	Scanner sc=new Scanner(System.in);
	private double principle_amt,time_period,rate_interest;
	public void read_input() 
	{
		System.out.format("\nSIMPLE INTEREST :\n");
		System.out.format("Enter the principal amount");
		principle_amt=sc.nextDouble();
		System.out.format("Enter the rate of interest");
		rate_interest=sc.nextDouble();
		System.out.format("Enter the time period(years)");
		time_period=sc.nextDouble();
	}
	public double calculate_interest()
	{
		//A=P(1+r*t)
		double int_res=(rate_interest/100)*time_period;
		return (principle_amt*(1+int_res));
	}
}
class Compound_Interest
{
	private double principle_amt,time_period,rate_interest,no_times_compounded;
	Scanner sc=new Scanner(System.in);
	public void read_input()
	{
		System.out.format("\n\nCOMPOUND INTEREST :\n");
		System.out.format("Enter the principal amount");
		principle_amt=sc.nextDouble();
		System.out.format("Enter the rate of interest");
		rate_interest=sc.nextDouble();
		System.out.format("Enter the time period(years)");
		time_period=sc.nextDouble();
		System.out.format("Enter no. of times the interest is compounded per year");
		no_times_compounded=sc.nextDouble();
	}
	public double calculate_interest()
	{
		//A=P(1+r/n)^(nt)
		double exp=no_times_compounded*time_period;
		double int_res=Math.pow(1+(rate_interest/100)/no_times_compounded,exp);
		return int_res*principle_amt;
	}
}
public class Simple_Compound_Interest 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Simple_Interest s_i=new Simple_Interest();
		s_i.read_input();
		System.out.format("Future value by applying Simple Interest : %f",s_i.calculate_interest());
		Compound_Interest c_i=new Compound_Interest();
		c_i.read_input();
		System.out.format("Future value by applying Compound Interest : %f",c_i.calculate_interest());
	}
}
