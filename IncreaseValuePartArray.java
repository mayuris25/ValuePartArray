import java.util.Scanner;
import java.util.ArrayList;

public class IncreaseValuePartArray extends ValuePartArray {
	
	// Inherit super class constructor.
	public IncreaseValuePartArray() {
		super();
	}
 
	// Set increasing array parts into link structures.
	@Override 
	void SetValuePartArray(Character[] cArray, int Len) {
					
		IncreasePart = new ArrayList<Character>();
		IncreasePart.add(cArray[0]);
		
		for(int inc=0; inc < Len-1; inc++){	
			
			if(Character.getNumericValue(cArray[inc])<Character.getNumericValue(cArray[inc+1])){
				IncreasePart.add(cArray[inc+1]);	
			}else{
				
				listOfIncreasePart.add(IncreasePart);
				//PrintList();
				IncreasePart = new ArrayList<Character>();
				IncreasePart.add(cArray[inc+1]);
				
			}
		}		
		listOfIncreasePart.add(IncreasePart);
		//PrintList();
		
	}
	

	public static void main(String[] args) {

		// Get user input.
		Scanner Scanner = new Scanner(System.in);
	    System.out.print("Enter integer array: ");
	    String ValueString = Scanner.next();
	    	    
	    // Validate input value.
	    if(!ValueString.matches("[0-9]+")){
	    	System.out.println("Input is not valid alphabetic letter array.");
	    	System.exit(0);
	    }	    
	    System.out.println("Ingeter array entered: " + ValueString);
		Scanner.close();
		
		// Fill values to character array.
		int Len = ValueString.length();
		Character[] cArray = new Character[Len];
		for (int index = 0; index < Len; index++) {
		    cArray[index] = new Character(ValueString.charAt(index));     
		}
		
		// Create object from IncreaseValuePartArray 
		// and Pass input for longest integer part selection.
		IncreaseValuePartArray Object= new IncreaseValuePartArray();
		Object.SetValuePartArray(cArray, Len);
		Object.GetValuePartArray();
				
	}
	

}
