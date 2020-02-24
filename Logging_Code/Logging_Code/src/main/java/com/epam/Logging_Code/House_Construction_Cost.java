package com.epam.Logging_Code;

import org.apache.logging.log4j.*;
import java.util.Scanner;
class House_Construction
{
	private static Logger myLogger=LogManager.getLogger(Simple_Interest.class);
	Scanner sc=new Scanner(System.in);
	private int construction_cost_per_sqft,total_area_house;
	public void get_house_information()
	{
		myLogger.info("Entry to get_house_information");
		myLogger.info("Select one of the materials standard:\n");
		myLogger.info("1=>standard material\n");
		myLogger.info("2=>above standard material\n");
		myLogger.info("3=>high standard material\n");
		int option=sc.nextInt();
		switch(option)
		{
		case 1:	construction_cost_per_sqft=1200;
				break;
		case 2:	construction_cost_per_sqft=1500;
				break;
		case 3:	construction_cost_per_sqft=1800;
				System.out.format("Do you want to construct fully automated home ??\n");
				System.out.print("Enter yes or no");
				String opt=sc.next();
				if(opt.equalsIgnoreCase("yes"))
					construction_cost_per_sqft=2500;
				break;
		}
		System.out.format("Enter the total area of house in sqft");
		total_area_house=sc.nextInt();
		myLogger.info("End of get_house_information");
	}
	public int cost_estimate()
	{
		myLogger.info("Returning cost estimation from cost_estimate method");
		return total_area_house*construction_cost_per_sqft;
	}
}
public class House_Construction_Cost 
{
	private static Logger myLogger=LogManager.getLogger(Simple_Interest.class);
    public static void main( String[] args )
    {
        House_Construction my_house_construction=new House_Construction();
        my_house_construction.get_house_information();
        myLogger.info("Estimated house construction cost : "+String.valueOf(my_house_construction.cost_estimate()));
    }
}
