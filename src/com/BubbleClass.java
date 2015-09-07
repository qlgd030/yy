package com;

public class BubbleClass {

	static int temp;
	public static int[] bubbleSort(int unsorted[]){
		for(int i=0;i<unsorted.length;i++){
			for(int j=i+1;j<unsorted.length;j++){
				if(unsorted[j]<unsorted[i]){
					temp = unsorted[j];
					unsorted[j] = unsorted[i];
					unsorted[i] = temp;
				}
			}
		}
		return unsorted;
	}
}
