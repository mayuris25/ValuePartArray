import java.util.ArrayList;

abstract class ValuePartArray {
	
	// ArrayList data structures for saving selected value parts.
	public ArrayList<ArrayList<Character>> listOfIncreasePart;
	public ArrayList<Character> IncreasePart;

	// Initialize data structure.
	public ValuePartArray() {
		listOfIncreasePart = new ArrayList<ArrayList<Character>>();
	}

	// Abstract method for setting selected array part.
	abstract void SetValuePartArray(Character[] cArray, int Len) ;
		
	// Retrieve longest array part.
	// Multiple longest parts are retrieved. 
	protected void GetValuePartArray() {
		int[] LongestPartindex = new int[listOfIncreasePart.size()];
		int LongestPartlength=0;
		int LongestLengthMul=0;
				
		for(int len=0; len < listOfIncreasePart.size(); len++){			
			if(listOfIncreasePart.get(len).size() > LongestPartlength){
				LongestPartlength = listOfIncreasePart.get(len).size();
				LongestPartindex[0]=len;
				LongestLengthMul=0;
			}else if(listOfIncreasePart.get(len).size() == LongestPartlength){
				LongestLengthMul++;
				LongestPartindex[LongestLengthMul]=len;
			}
		}
		
		int MultiplesID=1;
		while(LongestLengthMul >= 0){
			IncreasePart = listOfIncreasePart.get(LongestPartindex[LongestLengthMul]);
			
			System.out.print("Longest Increasing Array Part "+ MultiplesID + ": ");
			for(int inc=0; inc < IncreasePart.size(); inc++){
				System.out.print("" + IncreasePart.get(inc) + "");
			}
			System.out.println(" ");
			LongestLengthMul--;	
			MultiplesID++;
		}
		
	}
		
	// Print selected array part.
	protected void PrintList(){
		System.out.print("Part: ");
		for(int len=0; len < IncreasePart.size(); len++){			
			System.out.print(IncreasePart.get(len));
		}
		System.out.println("");
	}
			
}
