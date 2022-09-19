package com.bridgelabz.Day1Problems;
import java.util.Scanner;

public class StringEqualOrNot {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter First String:- ");
		String str1 = s.nextLine();
		
		System.out.println("Enter second String:- ");
		String str2 =  s.nextLine();
		
		if (str1.equals(str2))
			System.out.println("This strings are Equal");
		else
			System.out.println("This strings are not Equal");
	}

}
