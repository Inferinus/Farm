/**
     Description: The definition of the FarmTester class.
    
          Author: William Crum
     
            Date: October 13, 2020
        Modified: April 10, 2021
*/

public class FarmTester {

   public static void main(String args[])
   {
   
      // Set up fields
     
      int fieldIdNumber = 0;              // ID number of the field
      int position;
     
      Field field = new Field();    // a field using default constructor
      Field field2 = new Field();   // a field using default constructor
      Field field3 = new Field();   // a field using default constructor
      Field field4 = new Field();   // a field using default constructor
      Field field5 = new Field();   // a field using default constructor
      Field field6 = new Field();   // a field using default constructor
      
      /******************************************************************
     
           Test 1: 
	   
	          creating a new FarmField object
          
      ******************************************************************/
      
      Farm aFarm = new Farm();
     
      /******************************************************************
     
           Test 2: 
	   
	           display the default field using the toString method
          
      ******************************************************************/
      
      System.out.println("\n******************************************************************");
      System.out.println("\n     Test 1: Test constructors");
      System.out.println("     Test 2: Display the dates using the toString method");
      
      System.out.println("\n******************************************************************");
      System.out.println("                           Expected Result:");
      System.out.println("******************************************************************\n");
      
      System.out.println("\nDefault Farm Record\n\n\n1900\n\n");

      
      System.out.println("\n******************************************************************");
      System.out.println("                           Result");
      System.out.println("******************************************************************\n");
         
      System.out.println("\nDefault Farm Record\n\n" + aFarm.toString());
                    
     /******************************************************************
     
           Test 3: 
	   
	   	  Test setFamrID, setYear, getFarmID, and addField methods
          
      ******************************************************************/
      
      aFarm.setFarmID("MDFred14056");
      aFarm.setYear(2020);  
      
      //Adding two fields

      fieldIdNumber++;
      
      field.setFieldID(aFarm.getFarmID() + "#" + fieldIdNumber);
      field.setAcres(23.45);  
      field.setYield(1055.5);  
      field.setPrice(10.50);    
      field.setExpenses(9863.35);      
      field.setCrop("Soybeans");
      
      aFarm.addField(field);
      
      fieldIdNumber++;
      
      field2.setFieldID(aFarm.getFarmID() + "#" + fieldIdNumber);
      field2.setAcres(20.5);  
      field2.setYield(2374.15);  
      field2.setPrice(3.92);    
      field2.setExpenses(8236.36);      
      field2.setCrop("Corn");
      
      aFarm.addField(field2);
      
      
      System.out.println("\n******************************************************************");
      System.out.println("\n     Test 3: Test setFamrID, setYear, and addField methods");
      System.out.println("               Display the farm record using the toString method");
      
       System.out.println("\n******************************************************************");
      System.out.println("                           Expected Result:");
      System.out.println("******************************************************************\n");
      
      System.out.println("\nFarm Record:\n");

      System.out.println("MDFred14056");
      System.out.println("2020\n");

      System.out.println("Field Identifier: MDFred14056#1");

      System.out.println("\nAcres: 23.45");
      System.out.println("Crop: Soybeans");
      System.out.println("Yield: 1055.5");
      System.out.println("Price Per Bushel: 10.5");
      System.out.println("Total Production Expenses: 9863.35");

      System.out.println("\nField Identifier: MDFred14056#2");

      System.out.println("Acres: 20.5");
      System.out.println("Crop: Corn");
      System.out.println("Yield: 2374.15");
      System.out.println("Price Per Bushel: 3.92");
      System.out.println("Total Production Expenses: 8236.36\n");
      
      
      System.out.println("\n******************************************************************");
      System.out.println("                           Result");
      System.out.println("******************************************************************\n");
         
      System.out.println("Farm Record:\n\n" + aFarm.toString());
      
      /******************************************************************
     
           Test 4: 
	   
	   	  Tests totalFarmExpenses, totalFarmIncome, totalFarmProfit, noFields, and numberOfFields methods
          
      ******************************************************************/

      System.out.println("\n******************************************************************");
      System.out.println("\n     Test 4: Tests totalFarmExpenses, totalFarmIncome, totalFarmProfit, noFields, and numberOfFields methods");
      
       System.out.println("\n******************************************************************");
      System.out.println("                           Expected Result:");
      System.out.println("******************************************************************\n");
      
      System.out.println("Total Farm Expenses: $18,099.71\n");
      System.out.println("Total Farm Income: $20,389.42\n");
      System.out.println("Total Farm Profit: $2,289.71\n");
      System.out.println("There are 2 fields.\n");
      
      
      System.out.println("\n******************************************************************");
      System.out.println("                           Result");
      System.out.println("******************************************************************\n");
         
      System.out.printf("Total Farm Expenses: $%,8.2f\n\n", aFarm.totalFarmExpenses());   
      System.out.printf("Total Farm Income: $%,8.2f\n\n", aFarm.totalFarmIncome());   
      System.out.printf("Total Farm Profit: $%,8.2f\n\n", aFarm.totalFarmProfit());
      
      if(aFarm.noFields())
        System.out.println("No Fields");
      else
        System.out.println("There are " + aFarm.numberOfFields() + " fields.\n");
    
    
    /******************************************************************
     
           Test 5: 
	   
	   	  Tests containsField method
          
      ******************************************************************/
      System.out.println("\n******************************************************************");
      System.out.println("\n     Test 5: Tests containsField method");
      
      System.out.println("\n******************************************************************");
      System.out.println("                           Expected Result:");
      System.out.println("******************************************************************\n");
      
      System.out.println("Adding field to record.\n");
      System.out.println("Farm Record:\n");
      System.out.println("MDFred14056");
      System.out.println("2020\n");
      System.out.println("Field Identifier: MDFred14056#1\n");
      System.out.println("Acres: 23.45");
      System.out.println("Crop: Soybeans");
      System.out.println("Yield: 1055.5");
      System.out.println("Price Per Bushel: 10.5");
      System.out.println("Total Production Expenses: 9863.35\n");
      System.out.println("Field Identifier: MDFred14056#2\n");
      System.out.println("Acres: 20.5");
      System.out.println("Crop: Corn");
      System.out.println("Yield: 2374.15");
      System.out.println("Price Per Bushel: 3.92");
      System.out.println("Total Production Expenses: 8236.36\n");
      System.out.println("Field Identifier: MDFred14056#3\n");
      System.out.println("Acres: 30.0");
      System.out.println("Crop: Corn");
      System.out.println("Yield: 3750.0");
      System.out.println("Price Per Bushel: 3.92");
      System.out.println("Total Production Expenses: 13110.0\n");
      
      
      System.out.println("\n******************************************************************");
      System.out.println("                           Result");
      System.out.println("******************************************************************\n");
      
      fieldIdNumber++;
      
      field3.setFieldID(aFarm.getFarmID() + "#" + fieldIdNumber);
      field3.setAcres(30);  
      field3.setYield(3750);  
      field3.setPrice(3.92);    
      field3.setExpenses(13110);      
      field3.setCrop("Corn");
      
      if(aFarm.containsField(field3))
        System.out.println("Field already in record.\n");
      else
        {
         System.out.println("Adding field to record.\n");
         aFarm.addField(field3);
        }
         
      System.out.println("Farm Record:\n\n" + aFarm.toString());
      
      /******************************************************************
     
           Test 6: 
	   
	           Tests indexOfField and getField methods.
          
      ******************************************************************/    
      
      System.out.println("\n******************************************************************");
      System.out.println("       Test 6: Tests indexOfField and getField methods");
      
      System.out.println("\n******************************************************************");
      System.out.println("                           Expected Result:");
      System.out.println("******************************************************************\n");
      
      System.out.println("Field Record:\n");
      System.out.println("Field Identifier: MDFred14056#2\n");
      System.out.println("Acres: 20.5");
      System.out.println("Crop: Corn");
      System.out.println("Yield: 2374.15");
      System.out.println("Price Per Bushel: 3.92");
      System.out.println("Total Production Expenses: 8236.36\n");
      
     
      System.out.println("\n******************************************************************");
      System.out.println("                           Result");
      System.out.println("******************************************************************\n");
       
      position = aFarm.indexOfField(field2);
      
      if(position != -1)
        {
         field6 = aFarm.getField(position);
         System.out.println("Field Record:\n");       
         System.out.println(field6.toString() + "\n");
        }
      else
        System.out.println("Field not in the list.\n");
                    
      /******************************************************************
     
           Test 7: 
	   
	   	  Adds a field.
          
      ******************************************************************/ 
      
      fieldIdNumber++;
      
      field4.setFieldID(aFarm.getFarmID() + "#" + fieldIdNumber);
      field4.setAcres(10);  
      field4.setYield(450);  
      field4.setPrice(10);    
      field4.setExpenses(3600);      
      field4.setCrop("Soybeans");
      
      aFarm.addField(field4);
      
      
      System.out.println("\n******************************************************************");
      System.out.println("\n     Test 7: adds a field");
      
      System.out.println("\n******************************************************************");
      System.out.println("                           Expected Result:");
      System.out.println("******************************************************************\n");
      
      System.out.println("Farm Record:\n");
      System.out.println("MDFred14056");
      System.out.println("2020\n");
      System.out.println("Field Identifier: MDFred14056#1\n");
      System.out.println("Acres: 23.45");
      System.out.println("Crop: Soybeans");
      System.out.println("Yield: 1055.5");
      System.out.println("Price Per Bushel: 10.5");
      System.out.println("Total Production Expenses: 9863.35\n");
      System.out.println("Field Identifier: MDFred14056#2");
      System.out.println("Acres: 20.5");
      System.out.println("Crop: Corn");
      System.out.println("Yield: 2374.15");
      System.out.println("Price Per Bushel: 3.92");
      System.out.println("Total Production Expenses: 8236.36\n");
      System.out.println("Field Identifier: MDFred14056#3\n");
      System.out.println("Acres: 30.0");
      System.out.println("Crop: Corn");
      System.out.println("Yield: 3750.0");
      System.out.println("Price Per Bushel: 3.92");
      System.out.println("Total Production Expenses: 13110.0\n");
      System.out.println("Field Identifier: MDFred14056#4\n");
      System.out.println("Acres: 10.0");
      System.out.println("Crop: Soybeans");
      System.out.println("Yield: 450.0");
      System.out.println("Price Per Bushel: 10.0");
      System.out.println("Total Production Expenses: 3600.0\n");

      
      System.out.println("\n******************************************************************");
      System.out.println("                           Result");
      System.out.println("******************************************************************\n");
                      
      
      System.out.println("Farm Record:\n\n" + aFarm.toString());
 
 
      /******************************************************************
     
           Test 8: 
	   
	          Tests removeField method.
          
      ******************************************************************/
      
      System.out.println("\n******************************************************************");
      System.out.println("\n     Test 8: Tests removeField method.");
      
      System.out.println("\n******************************************************************");
      System.out.println("                           Expected Result:");
      System.out.println("******************************************************************\n");
      
      System.out.println("No field 2:\n");
      System.out.println("MDFred14056");
      System.out.println("2020\n");
      System.out.println("Field Identifier: MDFred14056#1\n");
      System.out.println("Acres: 23.45");
      System.out.println("Crop: Soybeans");
      System.out.println("Yield: 1055.5");
      System.out.println("Price Per Bushel: 10.5");
      System.out.println("Total Production Expenses: 9863.35\n");
      System.out.println("Field Identifier: MDFred14056#3\n");
      System.out.println("Acres: 30.0");
      System.out.println("Crop: Corn");
      System.out.println("Yield: 3750.0");
      System.out.println("Price Per Bushel: 3.92");
      System.out.println("Total Production Expenses: 13110.0\n");
      System.out.println("Field Identifier: MDFred14056#4\n");
      System.out.println("Acres: 10.0");
      System.out.println("Crop: Soybeans");
      System.out.println("Yield: 450.0");
      System.out.println("Price Per Bushel: 10.0");
      System.out.println("Total Production Expenses: 3600.0\n");
  
      
      System.out.println("\n******************************************************************");
      System.out.println("                           Result");
      System.out.println("******************************************************************\n");
      
     aFarm.removeField(aFarm.indexOfField(field2));
      
     System.out.println("No field 2:\n\n" + aFarm.toString());
     
     
      /******************************************************************
     
           Test 9: 
	   
	          Adds back field 2.
          
      ******************************************************************/
      
      System.out.println("\n******************************************************************");
      System.out.println("\n     Test 9: Adds back field 2.");
      
      System.out.println("\n******************************************************************");
      System.out.println("                           Expected Result:");
      System.out.println("******************************************************************\n");

      System.out.println("Field 2 back in:\n");
      System.out.println("MDFred14056");
      System.out.println("2020\n");
      System.out.println("Field Identifier: MDFred14056#1\n");
      System.out.println("Acres: 23.45");
      System.out.println("Crop: Soybeans");
      System.out.println("Yield: 1055.5");
      System.out.println("Price Per Bushel: 10.5");
      System.out.println("Total Production Expenses: 9863.35\n");
      System.out.println("Field Identifier: MDFred14056#3\n");
      System.out.println("Acres: 30.0");
      System.out.println("Crop: Corn");
      System.out.println("Yield: 3750.0");
      System.out.println("Price Per Bushel: 3.92");
      System.out.println("Total Production Expenses: 13110.0\n");
      System.out.println("Field Identifier: MDFred14056#4\n");
      System.out.println("Acres: 10.0");
      System.out.println("Crop: Soybeans");
      System.out.println("Yield: 450.0");
      System.out.println("Price Per Bushel: 10.0");
      System.out.println("Total Production Expenses: 3600.0\n");
      System.out.println("Field Identifier: MDFred14056#2");
      System.out.println("Acres: 20.5");
      System.out.println("Crop: Corn");
      System.out.println("Yield: 2374.15");
      System.out.println("Price Per Bushel: 3.92");
      System.out.println("Total Production Expenses: 8236.36\n");
      
      
      System.out.println("\n******************************************************************");
      System.out.println("                           Result");
      System.out.println("******************************************************************\n");
      
      aFarm.addField(field2);
      
     System.out.println("Field 2 back in:\n\n" + aFarm.toString());
      
            
      /******************************************************************
     
           Test 10: 
	   
	          Tests getYear, fieldRecordsForCrop, totalYieldForCrop, totalAcresForCrop, and profitForCrop methods.
          
      ******************************************************************/
      
      fieldIdNumber++;
      
      field5.setFieldID(aFarm.getFarmID() + "#" + fieldIdNumber);
      field5.setAcres(12);  
      field5.setYield(525);  
      field5.setPrice(10);    
      field5.setExpenses(4300);      
      field5.setCrop("Soybeans");
      
      aFarm.addField(field5);
      
      System.out.println("\n******************************************************************");
      System.out.println("\n     Test 10: Tests getYear, fieldRecordsForCrop, totalYieldForCrop, totalAcresForCrop, and profitForCrop methods.");
      
      System.out.println("\n******************************************************************");
      System.out.println("                           Expected Result:");
      System.out.println("******************************************************************\n");

      System.out.println("     Soybean Report\n");
      System.out.println("     Year: 2020\n");
      System.out.println("Soybean Field Details\n");
      System.out.println("Field Identifier: MDFred14056#1\n");
      System.out.println("Acres: 23.45");
      System.out.println("Crop: Soybeans");
      System.out.println("Yield: 1055.5");
      System.out.println("Price Per Bushel: 10.5");
      System.out.println("Total Production Expenses: 9863.35\n");
      System.out.println("Field Identifier: MDFred14056#4\n");
      System.out.println("Acres: 10.0");
      System.out.println("Crop: Soybeans");
      System.out.println("Yield: 450.0");
      System.out.println("Price Per Bushel: 10.0");
      System.out.println("Total Production Expenses: 3600.0\n");
      System.out.println("Field Identifier: MDFred14056#5\n");
      System.out.println("Acres: 12.0");
      System.out.println("Crop: Soybeans");
      System.out.println("Yield: 525.0");
      System.out.println("Price Per Bushel: 10.0");
      System.out.println("Total Production Expenses: 4300.0\n\n");
      System.out.println("Total Yield: 2,030.50 Bushels\n");
      System.out.println("Total Acres:    45.45\n");
      System.out.println("Total Profit: $3,069.40\n\n");
      
      System.out.println("     Corn Report\n");
      System.out.println("     Year: 2020\n");
      System.out.println("Corn Field Details\n");
      System.out.println("Field Identifier: MDFred14056#3\n");
      System.out.println("Acres: 30.0");
      System.out.println("Crop: Corn");
      System.out.println("Yield: 3750.0");
      System.out.println("Price Per Bushel: 3.92");
      System.out.println("Total Production Expenses: 13110.0\n");
      System.out.println("Field Identifier: MDFred14056#2\n");
      System.out.println("Acres: 20.5");
      System.out.println("Crop: Corn");
      System.out.println("Yield: 2374.15");
      System.out.println("Price Per Bushel: 3.92");
      System.out.println("Total Production Expenses: 8236.36\n\n");
      System.out.println("Total Yield: 6,124.15 Bushels\n");
      System.out.println("Total Acres:    50.50\n");
      System.out.println("Total Profit: $2,660.31\n");
      
      System.out.println("\n******************************************************************");
      System.out.println("                           Result");
      System.out.println("******************************************************************\n");
      
      System.out.println("     Soybean Report");  
      System.out.println("\n     Year: " + aFarm.getYear() + "\n"); 
      System.out.println("Soybean Field Details\n" + aFarm.fieldRecordsForCrop("Soybeans"));
      System.out.printf("\nTotal Yield: %,8.2f Bushels\n", aFarm.totalYieldForCrop("Soybeans"));
      System.out.printf("\nTotal Acres: %,8.2f\n", aFarm.totalAcresForCrop("Soybeans"));
      System.out.printf("\nTotal Profit: $%,8.2f\n\n", aFarm.profitForCrop("Soybeans"));
      
            
      System.out.println("\n     Corn Report");  
      System.out.println("\n     Year: " + aFarm.getYear() + "\n"); 
      System.out.println("Corn Field Details\n" + aFarm.fieldRecordsForCrop("Corn"));
      System.out.printf("\nTotal Yield: %,8.2f Bushels\n", aFarm.totalYieldForCrop("Corn"));
      System.out.printf("\nTotal Acres: %,8.2f\n", aFarm.totalAcresForCrop("Corn"));
      System.out.printf("\nTotal Profit: $%,8.2f\n\n", aFarm.profitForCrop("Corn"));
      
      /******************************************************************
     
           Test 11: 
	   
	          Tests clearFields method.
          
      ******************************************************************/
      
      System.out.println("\n******************************************************************");
      System.out.println("\n     Test 11: Tests clearFields method.");
      
      System.out.println("\n******************************************************************");
      System.out.println("                           Expected Result:");
      System.out.println("******************************************************************\n");
      
      System.out.println("Farm Record:\n");
      System.out.println("MDFred14056");
      System.out.println("2020\n");
  
      
      System.out.println("\n******************************************************************");
      System.out.println("                           Result");
      System.out.println("******************************************************************\n");
      
      aFarm.clearFields();
      
      System.out.println("Farm Record:\n\n" + aFarm.toString());
      
      /******************************************************************
     
           Test 12: 
	   
	          Test for IllegalArgumentException for year.
          
      ******************************************************************/
      
      System.out.println("\n******************************************************************");
      System.out.println("\n     Test 12: Test for IllegalArgumentException for year");
      System.out.println("\n     Expected result:\n");
      System.out.println("Exception in thread \"main\" java.lang.IllegalArgumentException: Year must be greater than or equal to 1900.");
      System.out.println("        at Farm.setYear(Farm.java:214)");
      System.out.println("        at FarmTester.main(FarmTester.java:566)");
  
      System.out.println("\n     Result\n");
      
      aFarm.setYear(1898);  
      
   } // main
  
}// FarmTester