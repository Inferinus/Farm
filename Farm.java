/**
Description:   Farm class that holds data for farm fields called Farm.
     
  Programmer:    Awwal Ahmed
        Date:    October 18, 2021    
    Modified:    October 27, 2021
*/

import java.util.ArrayList;

public class Farm
{
	private String farmID;											// the farm identifier
	private int year;												// the production year
	private ArrayList<Field> fields;								// the fields in the farm
	

	// 	CONSTRUCTORS
		
		public Farm() 
		{
			setYear(1900);
			setFarmID("");
			fields = new ArrayList<Field>();

		} 
		
		
	// METHODS
	
	/**
		Adds a Field object to the list
		@param the new Field object.
	*/
		public void addField(Field newField)
		{
			fields.add(newField);
		
		} // addField End
	
	
	/**
		Removes all Field objects from the list.
	*/
		public void clearFields()
		{
			fields.clear();
		
		} // clearFields End 
	
	
	/**
		Determines if the Field object is in the list.
		@param the Field object targeted in the search.
		@return true if found; false if otherwise.
	*/
		public boolean containsField(Field target)
		{
			return fields.contains(target);
		
		} // containsField​ End 


	/**
		Provides the list of fields growing the target crop.
		@return the list of fields growing the target crop.
	*/
		public String fieldRecordsForCrop(String target)
		{
		String record = "";
			
			for (Field field : fields)
			{
				if (target.equals(field.getCrop()))
				{
					record += field.toString() + "\n\n";
				}
			}
			return record;
		} // fieldRecordsForCrop End
		
		
	/** 
		Provides the farm identifier.
		@return the farm identifier.
	*/
		public String getFarmID()
		{
			return farmID;
			
		} // getFarmID End 
		
	
	/**
		Provides the production year.
		@return the production year.
	*/
		public int getYear()
		{
			return year;
			
		} // getYear End 
		
	
	/**
		Returns a Field object from the list.
		@param the location of the Field object in the list.
		@return a Field object from the list.
	*/
		public Field getField(int location)
		{
			return fields.get(location);
			
		} // getField End 
		
		
	/**
		Provides the location of the Field object in the list.
		@param the Field object targeted in the search.
		@return the location of the Field object or -1 if the found.
	*/
		public int indexOfField(Field target)
		{
			return fields.indexOf(target);
			
		} // indexOfField​ End 
		
	/** 
		Tests for an empty list.
		@return true if empty; false if otherwise.
	*/
		public boolean noFields()
		{
			return fields.isEmpty();
			
		} // noFields End 
		
		
	/**
		Provides the number of fields.
		@return the number of fields.
	*/
		public int numberOfFields()
		{
			return fields.size();
			
		} // numberOfFields End
		
		
	/**
		Provides the profit for the target crop.
		@param "target" the target crop.
		@return the profit for the target crop.
	*/
		public double profitForCrop(String target)
		{
			double cropProfit = 0;		 // the total profit for the target crop.
			
			for (Field field : fields)
			{
				if (target.equals(field.getCrop()))
				{
					cropProfit += field.totalProfit();
				}
			}
			return cropProfit;
			
		} // profitForCrop End
		
	/**
		Removes and returns a Field object from the list.
		@param "location" the location of the Field object in the list.
		@return a Field object from the list.
	*/
		public Field removeField(int location)
		{
			return fields.remove(location);
			
		} // removeField End 
		
	/**
		Assigns the farm identifier.
		@param "farm" the farm identifier.
	*/
		public void setFarmID(String farm)
		{
			farmID = farm;
			
		} // setFarmID​ End 
		
		
	/** 
		Assigns the production year.
		@param "yr" the production year.
		throws java.lang.IllegalArgumentException
	*/
		public void setYear (int yr)
		throws IllegalArgumentException
		{
			boolean valid = yr >= 1900;											// Tests for valid if year >= 1900 
			if (valid)
			{	
				year = yr;
			}
			else {
				throw new IllegalArgumentException("Year must be greater than or equal to 1900.");
			}
				
		} // setYear End 
		
	/**
		Provides the list of field on this farm as a string.
		@returns the list of fields on this farm.
	*/
		public String toString()
		{
			String record =  getFarmID() + "\n" + getYear() + "\n\n";
			
			for (Field field : fields)
			{
				record += field.toString() + "\n\n";
			}
			return record;
			
		} // toString End
		
		
	/**
		Provides the total acres for the target crop.
		@parm "target" the target crop.
		@return the total acres for the target crop.
	*/
		public double totalAcresForCrop(String target)
		{
			double totalAcres = 0;
			
			for (Field field : fields)
			{
				if (target.equals(field.getCrop()))
				{
					totalAcres += field.getAcres();
				}
			}
			return totalAcres;
			
		} // totalAcresForCrop End
		
	/** 
		Provides the total expenses for this farm.
		@return the total expenses for this farm.
	*/
		public double totalFarmExpenses()
		{
			double expenses = 0;
			
			for (Field field : fields)
			{
				expenses += field.getExpenses();
			}	
			return expenses;
			
		} // totalFarmExpenses End 
		
	/**
		Provides the total imcome for this farm.
		@return the total income for this farm.
	*/
		public double totalFarmIncome()
		{
			double totalFarmIncome = 0;    // Total farm income.
			
			for (Field field : fields)
			{
				totalFarmIncome += field.totalProfit() + field.getExpenses();
			}
			return totalFarmIncome;
			
		} // totalFarmIncome End 
		
		
	/**
		Provides the total profit for this farm.
		@return the total profit for this farm
	*/
		public double totalFarmProfit()
		{
			int totalProfit = 0;
			
			for (Field field : fields)
			{
				totalProfit += field.totalProfit();
			}
			return totalProfit;
			
		} // totalFarmProfit End 
		
		
	/**
		Provides the total yield for the target crop.
		@param "target" the target crop.
		@return the total yield for the target crop.
	*/
		public double totalYieldForCrop(String target)
		{
			int totalYieldForCrop = 0;
			
			for (Field field : fields)
			{
				if (target.equals(field.getCrop()))
				{
					totalYieldForCrop += field.getYield();
				}
			}
			return totalYieldForCrop;
			
		} // totalYieldForCrop End 
		
} // Program End