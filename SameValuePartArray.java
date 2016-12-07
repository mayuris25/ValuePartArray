import java.util.Scanner;
import java.util.ArrayList;

public class SameValuePartArray extends ValuePartArray {
	
	// Inherit super class constructor.
	public SameValuePartArray() {
		super();
	}
	
	// Set same value array parts into link structures.
	@Override 
	void SetValuePartArray(Character[] cArray, int Len) {
		
		IncreasePart = new ArrayList<Character>();
		IncreasePart.add(cArray[0]);
		
		for(int inc=0; inc < Len-1; inc++){	
			
			if(Character.getNumericValue(cArray[inc])==Character.getNumericValue(cArray[inc+1])){
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
	    System.out.print("Enter binary array: ");
	    String ValueString = Scanner.next();
	    
	    // Validate input value.
	    if(!ValueString.matches("[01]+")){
	    	System.out.println("Input is not valid binary array.");
	    	System.exit(0);
	    }	    
		System.out.println("Binary array entered: " + ValueString);
		Scanner.close();
		
		// Fill values to character array.
		int Len = ValueString.length();
		Character[] cArray = new Character[Len];
		for (int index = 0; index < Len; index++) {
		    cArray[index] = new Character(ValueString.charAt(index));  		    
		}
		
		// Create object from SameValuePartArray 
		// and Pass input for longest same binary part selection.
		SameValuePartArray Object= new SameValuePartArray();
		Object.SetValuePartArray(cArray, Len);
		Object.GetValuePartArray();
				
	}

	

}
