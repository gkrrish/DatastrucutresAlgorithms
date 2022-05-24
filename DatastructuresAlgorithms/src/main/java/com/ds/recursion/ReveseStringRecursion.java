package com.ds.recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class ReveseStringRecursion {

	public static void main(String[] args) {
		System.out.println(recursiveString("Krishna"));

	}
	
	
	public static String recursiveString(String str) {
		StringBuilder sb = new StringBuilder();
		if ((str == null) || (str.length() <= 1))return "";
		else {
			sb.append(recursiveString(str.substring(0, str.length() - 1)));
		}
		return str;
	}
	

	// O(n)
	public static String usingCharAt(String str) {

		String rev = "";
		for (int i = 0; i < str.length(); i++) {
			rev = rev + str.charAt((str.length() - 1 - i));
		}
		return rev;
	}

	// O(n)
	public static String usingCharArray(String str) {
		char[] reverse = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			reverse[i] = str.charAt(str.length() - 1 - i);
		}
		return String.valueOf(reverse).toLowerCase();
	}

	// O(1)
	public static String usingStringBuilder(String str) {
		return new StringBuilder(str).reverse().toString();
	}

	// O(1)
	public static String usingStringBuffer(String str) {
		StringBuffer sbr = new StringBuffer(str);
		sbr.reverse();
		return sbr.toString();
	}

	// O(n²)
	public static String usingStack(String str) {
		if (str == null || str.equals("")) {
			return "Not a valid String!";
		}
		Stack<Character> stack = new Stack<>();

		char[] c = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			stack.push(c[i]);
		}
		int j = 0;
		while (!stack.isEmpty()) {
			// re-using above char array to save reverse values
			c[j++] = stack.pop();
		}
		return String.copyValueOf(c);
	}

	// O(n²)//to type sqaure alt+256 press.
	public static String usingStackStringBuilder(String str) {
		if (str == null || str.equals("")) {
			return "Not a valid String!";
		}
		Stack<Character> stack = new Stack<>();

		char[] c = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			stack.push(c[i]);
		}
		StringBuilder sb = new StringBuilder();
		while (!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		return sb.toString();
	}

	public static String usingCollections(String str) {
		List<Character> list = new ArrayList<>();
		for (char c : str.toCharArray()) {
			list.add(c);
		}
		Collections.reverse(list);
		StringBuilder sb = new StringBuilder();
		for(char c:list) {
			sb.append(c);
		}
		return sb.toString();
	}
}
//Recursion is an approach to solving problems using a function that calls itself as a subroutine. but it has a condition to terminate otherwise StackOverFlowException we will get
//https://www.techiedelight.com/10-ways-reverse-a-string-java/
//https://leetcode.com/explore/featured/card/recursion-i/250/principle-of-recursion/1439/
