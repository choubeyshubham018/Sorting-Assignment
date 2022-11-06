package assignment_2;

import java.util.Arrays;

public class SelectionSort {
// In this Sorting , for every iteration we just move the smallest element in the initial index of the Array. 
//	and reduce the Size of the Array by 1, from left side for next Smaller Element..
	public void sorting(int[]arr) {
		int n=arr.length;
		int j=0;
		while(j<n-1) {
			int min=j;
		for (int i = j; i < n; i++) {	
			if(arr[min]>arr[i]) min=i;
		}
		// Swapping the minimum value to the Value present in the initial position.
		int temp=arr[j];
		arr[j]=arr[min];
		arr[min]=temp;
		j++;
		}
	}
	public static void main(String[] args) {
		SelectionSort s=new SelectionSort();
		int[]arr= {7,1,2,3,4,5,6};
		s.sorting(arr);
		System.out.println(Arrays.toString(arr));

	}

}
