/**
Description:   Field class that holds data for farm fields called Field.
     
  Programmer:    Awwal Ahmed
        Date:    October 15, 2021    
    Modified:    October 15, 2021
*/

public class Field
{
	private String fieldID;				// the field identifier
	private String crop;		 		// the name of the crop
	private double acres;			    // the number of acres in the field
	private double yield;			    // the yield in bushels
	private double price;			    // the price per bushel
	private double expenses;		    // the total production expenses
	
	/**
	double yieldPerAcre;				// the yeild per acre
	double costPerAcre;					// the cost per acre
	double totalProfit;					// the total profit
	double profitPerAcre;				// the profit per acre
	*/
	
	// CONSTRUCTORS
	
	/** default constructor */
	public Field () 
	{
		acres = 0.1;
		yield = 0;
		price = 0;
		expenses = 0.1;
		fieldID = "";
		crop = "";
	} 
	
	
	// METHODS
	
	/**
		Provides the field record as a string.
		@return the field record
	*/
	public String toString() 
	{
		String record = "";
		
		record = "Field Identifier: " + fieldID + "\n\nAcres: " + acres + "\nCrop: " + crop + "\nYield: " + yield + "\nPrice per Bushel: " + price + "\nTotal Production Expenses: " + expenses;
		return record;
		
	} //toString End
	
	
	/**
		Provides the field identifier.
		@return the field identifier.
	*/
	public String getFieldID()
	{
		return fieldID;
		
	} // getFieldID End 
	
	
	/**
		Provides the number of acres in the field.
		@return the number of acres in the field.
	*/
	public double getAcres()
	{
		return acres;
		
	} // getAcres End
	
	
	/**
		Provides the yield for the field.
		@return the yield in bushels.
	*/
	public double getYield()
	{
		return yield;
		
	} // getYield End 
	
	
	/**
		Provides the price per bushel.
		@return the price per bushel.
	*/
	public double getPrice()
	{
		return price;
		
	}  // getPrice End 
	
	
	/**
		Provides the total production expenses.
		@return the total production expenses.
	*/
	public double getExpenses()
	{
		return expenses;
		
	} // getExpenses End


	/**
		Provides the crop.
		@return the crop.
	*/
	public String getCrop()
	{
		return crop;
		
	} // getCrop End 
	
	
	/**
		Assigns the field identifier.
		@return the field identifier.
	*/
	public void setFieldID(String fID)
	{
		fieldID = fID;
		
	} // setFieldID End 
	
	
	/**
		Assigns the acres in the field.
		@param "ac" the acres in the field.
		throws java.lang.IllegalArgumentException
	*/
	public void setAcres(double ac)
	throws IllegalArgumentException
	{
		boolean valid = ac > 0;						// Tests for valid if acre > 0 
			if (valid)
			{	
				acres = ac;
			}
			else {
				throw new IllegalArgumentException("Acres must be > 0.");
			}
		
	} // setAcres End 
	
	
	/**
		Assigns the yield of the field.
		@param "production" the yield of the field.
		throws java.lang.IllegalArgumentException
	*/
	public void setYield(double production) 
	throws IllegalArgumentException
	{
		boolean valid = production >= 0;				// Tests for valid if yield >= 0
			if (valid)
			{
				yield = production;
			}
			else {
				throw new IllegalArgumentException("Yield must be  greater than or equal to 0.");
			}
		
	} // setYield End 
	
	
	/**
		Assigns the price per bushel.
		@param "unit" the price per bushel.
		throws java.lang.IllegalArgumentException
	*/
	public void setPrice(double unit)
	throws IllegalArgumentException
	{
		boolean valid = unit >= 0; 					// Tests for valid if price >= 0
			if (valid)
			{
				price = unit;
			}
			else {
				throw new IllegalArgumentException("Price must be  greater than or equal to 0.");
			}
		
	} //setPrice End 
	
	
	/**
		Assigns the total field expenses.
		@param "expen" the total field expenses.
		throws java.lang.IllegalArgumentException
	*/
	public void setExpenses(double expen)
	throws IllegalArgumentException
	{
		boolean valid = expen > 0;					// Tests for valid if expenses > 0
			if (valid)
			{
				expenses = expen;
			}
			else {
				throw new IllegalArgumentException("Expenses must be  greater than 0.");
			}
		
	} // setExpenses End 
	
	
	/**
		Assigns the crop grown.
		@param "crp" the crop grown.
	*/
	public void setCrop(String crp)
	{
		crop = crp;
		
	} // setCrop End 
	
	
	/**
		Returns the yield per acre.
		@return yield per acre.
	*/
	public double yieldPerAcre()
	{
		double yieldPerAcre;							// the yeild per acre
		yieldPerAcre = yield / acres;
		return yieldPerAcre;
		
	} //yieldPerAcre End 
	
	
	/**
		Returns the cost per acre.
		@return the cost per acre.
	*/
	public double costPerAcre()
	{
		double costPerAcre;								// the cost per acre
		costPerAcre = expenses / acres;
		return costPerAcre;
		
	} //costPerAcre End 
	
	
	/**
		Returns the total profit.
		@return the total profit.
	*/
	public double totalProfit()
	{
		double totalProfit;								// the total profit
		totalProfit = (yield * price) - expenses;
		return totalProfit;
		
	} // totalProfit End 
	
	
	/**
		Returns the profit per acre.
		@return the profit per acre.
	*/
	public double profitPerAcre()
	{
		double totalProfit;								// the total profit
		double profitPerAcre;							// the profit per acre
		totalProfit = (yield * price) - expenses;
		profitPerAcre = totalProfit / acres;
		return profitPerAcre;
		
	} // profitPerAcre End 
	
	
	/**
		Tests for equality by comparing this field's ID to another field's ID.

		@param  other  the second field in the comparison
                   
		@return  true if the fields are the same; false otherwise
	*/
	public boolean equals(Object other)
	{
		Field field2 = (Field) other;
    
		return fieldID.equals(field2.getFieldID());
	} // equals End 

} // class end