package com.pscmr.dao;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		
	
Scanner sc=new Scanner(System.in);
	
	int sum=0;
	int sum1=0;
	int n = sc.nextInt();
	int [] arr=new int[n];
	
	for(int i=0;i<n;i++) {
		 arr[i]= sc.nextInt();
		 
	}
	for(int i=0;i<n;i++) {
	if(arr[i]%2==0) {
		sum=arr[i];
	}
	else {
		
		sum1=arr[i];
	}
	
	}
	
	System.out.println(sum);
	System.out.println(sum1);
	
	
	
	}
}
