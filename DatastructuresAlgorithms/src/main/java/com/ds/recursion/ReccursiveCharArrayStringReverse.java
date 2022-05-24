package com.ds.recursion;

import java.util.Arrays;

//https://leetcode.com/explore/learn/card/recursion-i/250/principle-of-recursion/1440
public class ReccursiveCharArrayStringReverse {
	public static void main(String[] args) {
		//Output: ["o","l","l","e","h"]
		ReccursiveCharArrayStringReverse rs=new ReccursiveCharArrayStringReverse();
		String[] s = { "h", "e", "l", "l", "o" };//generally they will give " " here. but internally Leetcode website sends here '' only.
		char[] output=new char[s.length];
		System.out.println(Arrays.toString(rs.convertCharArrayToStringArray(rs.reverseString(rs.convertStringArrayToCharArray(s)))));;
	}

	// using recursive
	public char[] reverseString(char[] s) {
		char[] out = new char[s.length];

		int left = 0;
		int right = s.length-1;
		while (left-1 != s.length-1) {
			out[left] = s[right];
			left++;
            right--;
			
		}
		System.out.println("reverse : "+Arrays.toString(out));
		return out;
	}

	//in-place algorithm
	public void leetCodereverseString(char[] s) {
        int left = 0;
        int right = s.length-1;
        while(left <= right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }

	public char[] convertStringArrayToCharArray(String[] str) {
		char[] c = new char[str.length];
		for (int i = 0; i < c.length; i++) {
			char[] x = str[i].toCharArray();
			c[i] = x[0];
		}
		System.out.println("StrArray to CharArray : "+Arrays.toString(c));
		return c;
	}
	public String[] convertCharArrayToStringArray(char[] c) {
		String[] str=new String[c.length];
		for(int i=0; i<c.length; i++) {
			str[i]=Character.toString(c[i]);
		}
		System.out.println("CharArray to StringArray : "+Arrays.toString(str));
		return str;
	}
}
