package com.bridgelabz.Day1Problems;

public class CountInvalid {
	public static void main(String[] args) {
		int a;
		int cnt = 0;
		int sum = 0;
		for(int i=0; i<args.length; i++) {
			try {
				a=Integer.parseInt(args[i]);
				sum=sum+a;
			}
			catch (NumberFormatException e) {
				cnt++;
			}
		}
		System.out.println("sum of command-line integer arguments:- " +sum);
		System.out.println("count the invalid integers are "+cnt);
		
	}

}