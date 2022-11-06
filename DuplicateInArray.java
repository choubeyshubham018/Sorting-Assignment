package assignment_2;
import java.util.Arrays;

public class DuplicateInArray {
   
	// This method is only works for Array having All the positive Elements.
	public void findDuplicates_1(int[]arr) {
		if(arr.length<=1){
			System.out.println("Duplicate values are not Present in the array");
		return;
		}
		int[]res=new int[arr.length];
		for(int i=0;i<arr.length;i++) { // Making a local clone of main Array so that all the changes performed, does not reflect in the main Array.
			res[i]=arr[i];
		}
		boolean b=true;
		for (int i = 0; i < res.length; i++) {
		for (int j = i+1; j < res.length; j++) {
	      		if(res[i]==res[j]) {
	      			System.out.println(res[i]+" is repeated at Index->"+ j); // changing the checked duplicate values to a unique 
	      			                                                         //  negative value so that it does not get checked Again. 
	      			res[j]=-j;
	      			b=false;
	      		}
		}
	}
		if(b) System.out.println("Duplicate values are not Present in the array");
	}
	
	//This method works for Any type of Array
	public void findDuplicates_2(int[]arr) {
		if(arr.length<=1){
			System.out.println("Duplicate values are not Present in the array");
		return;}
		boolean a=true;
	   Arrays.sort(arr);
	   for (int i = 0; i < arr.length-1; i++) {
		if(arr[i]==arr[i+1]) {
			System.out.println(arr[i]+" have Duplicates Value");
            a=false;			
			int j=i+1;
			while(j<arr.length && arr[j]==arr[i]) j++; //Passing all the duplicates of  arr[i]. 
			i=j-1;
		}
	}
	   if(a) System.out.println("Arrays DoesNot have any Duplicate value");
	
	}
	public static void main(String[] args) {
	int[]arr1= {7,1,6,2,7,9,1,6,0,2,2,6,9};
    DuplicateInArray d=new DuplicateInArray();
    System.out.println("Duplicate Details of arr1 Array");
    d.findDuplicates_1(arr1);
    System.out.println("Duplicate Details of arr Array");
//     int[]arr= {-7,1,6,2,-7,9,1,6,0,-2,-2,6,9};
//     d.findDuplicates_2(arr);
	}

}
