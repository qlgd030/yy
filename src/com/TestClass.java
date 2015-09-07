package com;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestClass {
	@Test
	public void testBubble(){
		//从键盘输入数字组成数组
		int arr[] = new int[]{4,7,3,9,2,8,5,0,4};
		BubbleClass buClass = new BubbleClass();
		int list[] = buClass.bubbleSort(arr);
//		for(int n:list){
//			System.out.print(n+"  ");
//		}
//		String a="0  2  3  4  4  5  7  8  9  ";
		
		int list2[] = new int []{1 , 2  ,3 , 4 ,4 , 5,  7 , 8,  9}; 
		assertArrayEquals(list2, list);
		
	}
}
