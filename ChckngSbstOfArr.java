package assignment_2;
// Ques> Checking that the Array-2 is Subset of Array-1 or not
public class ChckngSbstOfArr {
    
	public void CheckingSubset(int[]arr1,int[]arr2) {
		// if the length of Subset is greater then main array then condition fails.
		if(arr2.length>arr1.length) {System.out.println("No arr2 is not a Subset of arr1") ;
		return;
		}
		boolean ans=false;
		for (int i = 0; i < arr2.length; i++) {
			ans=false;  // Changing 'ans' Value to false to check each Element of Sub array in the Main Array.. 
			for (int j = 0; j < arr1.length; j++) {
				if(arr2[i]==arr1[j]) {  // for every element checking and updating booleans ans value.
				ans=true;
				break;
				}
			}
			if(ans==false)break; // ans is false after the inner loop that means that element is not find in the main Array
		}
		if(ans) System.out.println("Yes arr2 is Subset of arr1");
		else System.out.println("No arr2 is not a Subset of arr1");
		
		
		
	}
	public static void main(String[] args) {
		int[]arr1= {7,6,2,8,1,4,9,3,5,10};
		int[]arr2= {7,1,1,10};
		ChckngSbstOfArr c=new ChckngSbstOfArr();
		c.CheckingSubset(arr1, arr2);
		

	}

}
