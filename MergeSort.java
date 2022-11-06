package assignment_2;

import java.util.Arrays;
// Que->MergeSorting an Array
public class MergeSort {
	// First Dividing the array to the last Element then Merge them in Sorted Order
	public void divide(int[]arr,int strt,int end) {
		if(strt<end) {
			int mid=strt+(end-strt)/2;   //Finding the Middle Index of the Array. 
			divide(arr,strt,mid);    //then Divide the Array in left and Right Half Recursively  till every Element Become an  Array.
			divide(arr,mid+1,end);    
			merge(arr,strt,mid,end);  // At last merge all the Elements in Ascending order.
					}
	}
	
	// Now Merging all the elements again in sorting order
	public void merge(int[]arr,int strt,int mid,int end) {
		//Array 'res' to holds the element of the Array 'arr' in sorted order .
		int[]res=new int[end-strt+1];
		
		int i=strt,j=mid+1,k=0;
		while(i<=mid && j<=end) {
			if(arr[i]<arr[j]) {
				res[k++]=arr[i++];
			}
			else res[k++]=arr[j++];
		}
		while(i<=mid) {
			res[k++]=arr[i++];
		}
		while(j<=end) {
			res[k++]=arr[j++];
		}
		// Assigning all the elements back to the Array 'arr' in sorted order from Array 'res' in their proper position.
		for (int n = 0,m=strt; n < res.length; n++,m++) {
			arr[m]=res[n];
		}
		
	}
	public static void main(String[] args) {
		int[]arr= {9,5,7,3,1,8,4,2,6};
		
		MergeSort m=new MergeSort();
		m.divide(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));

	}

}
