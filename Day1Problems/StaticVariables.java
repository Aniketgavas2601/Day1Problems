package com.bridgelabz.Day1Problems;

public class StaticVariables {
	static int x = 12;
	static int y;
	static void meth(int z) {
		System.out.println("x =" +x);
		System.out.println("y =" +y);
		System.out.println("z =" +z);
	}
	static {
		System.out.println("Static block initialized");
		y = x * 6;
	}

	public static void main(String[] args) {
		meth(10);

	}

}
