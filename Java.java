package Javaproblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class Java {
	
public static int MissingNumber(int [] arr) {
	int l = arr.length;
	
	int Required_Length = l + 1;
	
	int Actual_sum = (Required_Length*(Required_Length+1))/2;
	
	int Current_sum = 0;
	
	for(int i: arr) {
		Current_sum += i;
	}
	
	int Missing_Number = Actual_sum - Current_sum;
	
	return Missing_Number;
	
}

public static void FizzBuzz(int n) {
	
	for(int i = 1; i <= n; i++) {
		if(i % 3 == 0 && i % 5 == 0) {
			System.out.println("FizzBuzz");
			continue;
		}
		if(i % 3 == 0) {
			System.out.println("Fizz");
			continue;
		}
		if(i % 5 == 0) {
			System.out.println("Buzz");
			continue;
		}
		if(i != 3 || i != 5) {
			System.out.println(i);
		}
		
	}
}

public static ArrayList<String> LowestNumber(String [] arr) {
	int total_charlength = 0;
	int sum = 0;
	for(String s: arr) {
		total_charlength += s.length();
	}
	ArrayList<String> str = new ArrayList<>();
	StringBuilder builder = new StringBuilder();
	int index = 0;
	Permute(index,str,builder,total_charlength,arr,sum);
	return str;
}

private static void Permute(int index, ArrayList<String> str, StringBuilder builder, int total_charlength,String [] arr,int sum) {
	if(sum == total_charlength) {
		sum-= builder.charAt(builder.length()-1);
		str.add(builder.toString());
		return;
	}
	
	for(int i = index; i < arr.length; i++) {
		builder.append(arr[i]);
		sum+= arr[i].length();
		
		Permute(index+1,str,builder,total_charlength,arr,sum);
		builder.deleteCharAt(builder.length()-1);		
		
	}
}








public static void main(String[] args) {

	//int[] arr = {1,2,3,4,6,7,8,9};
    
	String arr[] = {"2","10"};
	ArrayList<String> s  = Java.LowestNumber(arr);
	System.out.println(s);
	
	//System.out.println(result);
}
}