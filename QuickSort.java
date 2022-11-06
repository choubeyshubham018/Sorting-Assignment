package assignment_2;

import java.util.Arrays;

public class QuickSort {
// In QuickSort we just assume a pivot element in the array ,And in each iteration all the elements Smaller then
// pivot moved to forward ahead of pivot and all elements greater then pivot moved behind the pivot.   
	 
	public void sortRec(int[]arr,int strt,int end) {
// Calling the method until our start is smaller then end index Using recursion,
		
		if(strt<end) {
		int div=sorting(arr,strt,end);// Calling the sorting method for array between index strt to end. 
		sortRec(arr,strt,div-1); //Calling the same method for left half of the Array Recursively.
		sortRec(arr,div+1,end);  //Calling the same method for left half of the Array Recursively.
			}
		}
	
	public void sortIterative(int[]arr,int strt,int end) {
		//Using Iterative Method for Quick Sort
		//Creating a ref array to keep the record of all the sorted part
		// and an index i to iterate that array
		int[]ref=new int[end-strt+1];
		int i=-1;
        ref[++i]=strt;
        ref[++i]=end;
        while(i>=0) {
            end=ref[i--];
        	strt=ref[i--];
        int p=sorting(arr,strt,end);
        if(p-1>strt) {
        	ref[++i]=strt;
        	ref[++i]=p-1;
        }
        if(p+1<end) {
        	ref[++i]=p+1;
        	ref[++i]=end;
        }
        
        }
					
	}
	
	// sorting all the element smaller then piv(pivot) index ahead of it and greater then piv  index after piv.
	public int sorting(int[]arr,int strt,int end) {
	int piv=arr[end];
	int i=strt; // for keeping the track of the index , whose value is greater then the pivot to swap it with the next smaller element..
	while(strt<=end) { 
		if(arr[strt]<=piv) { // Moving all the Elements smaller then pivot to the index ahead of the Pivot in the Array.
			int temp=arr[i];
			arr[i]=arr[strt];
			arr[strt]=temp;
			i++;
		}
		strt++;
	}
    return i-1;
}
	public static void main(String[] args) {
	QuickSort q=new QuickSort();
	int[]arr= {7,6,5,2,3,4,1};
	int []ar= {6,2,7,4,3,1,8,5,2};
	q.sortIterative(ar, 0, ar.length-1);
    System.out.println(Arrays.toString(ar));
	
	q.sortRec(arr, 0, arr.length-1);
    System.out.println(Arrays.toString(arr));
	}

}
