package org.cts;

import java.util.ArrayList;
import java.util.List;

public class Company {
	
	public static void main(String[] args) {
		
		 int arr[]={12, 17, 70, 15, 22, 65, 21, 90};
		  System.out.println("Original Array: ");
		  for (int i = 0; i < arr.length; i++) {
		   System.out.print(arr[i]+" ");
		  }
		  arr=separateEvenOddNumbers(arr);
		  System.out.println("nArray after separating even and odd numbers : ");
		  for (int i = 0; i < arr.length; i++) {
		   System.out.print(arr[i]+" ");
		  }
		}
		public static int[] separateEvenOddNumbers(int arr[])
		{
		  int left=0;
		  int right=arr.length-1;
		  for (int i = 0; i < arr.length; i++) {
		 
		   while(arr[left]%2==0)
		   {
		    left++;
		   }
		   while(arr[right]%2==1)
		   {
		    right--;
		   }
		 
		   if(left<right)
		   {
		    int temp=arr[left];
		    arr[left]=arr[right];
		    arr[right]=temp;
		   }
		  }
		  return arr;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

		
		
//		List <Integer> li = new ArrayList<Integer> ();
//		
//		
//		li.add(105);
//		li.add(205);
//		li.add(305);
//		li.add(405);
//		li.add(505);
//		li.add(605);
//		li.add(705);
//		li.add(805);
//		
//	System.out.println(li);	
//	
//	
//	for (int i = 0; i <li.size(); i++) {
//	
//		System.out.println(li.get(i));
//		
//	}
//	
//	
//	for (Integer x : li) {
//		
//		System.out.println(x);
//		
//		
//		
//		
//	}
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//	}
//
//}
