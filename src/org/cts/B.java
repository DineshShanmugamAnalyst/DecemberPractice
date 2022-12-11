package org.cts;

import java.util.HashMap;
import java.util.Scanner;

public class B {
	
	public static void main(String[] args) {
		
		int sum = 0;
		public int getNumberSum(int number){
		if(number == 0){
		return sum;
		} else {
		sum += (number%10);
		getNumberSum(number/10);
		}
		return sum;
		
		}
		public static void main(String a[]){
		MyNumberSumRec a = new MyNumberSumRec();
		System.out.println("Sum is: "+a.getNumberSum(5678));
		}
		}