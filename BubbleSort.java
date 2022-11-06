package assignment_2;

import java.util.Arrays;

public class BubbleSort {
    
	public void sorting(int[]arr) {
		int n= arr.length;
		for(int i=0;i<n-1;i++) {
			//for Each Iteration of the loop moving the larger element at the End of the Loop.Then reduce the size of Array by 1 from right Side.
			for (int j = 0; j < n-1-i; j++) {
				if(arr[j]>arr[j+1]) { 
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		BubbleSort b=new BubbleSort();
		int[]arr= {7,6,5,4,3,2,1};
		b.sorting(arr);
		System.out.println(Arrays.toString(arr));

	}

}
