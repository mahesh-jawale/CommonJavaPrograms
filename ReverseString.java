package com.commonprograms;

public class ReverseString {

	public static void main(String[] args) {
		String strName="mahesh";
		int intI;
		String strRev="";
		for(intI=strName.length()-1;intI>=0;intI--)
		{
			strRev=strRev+strName.charAt(intI);
		}
		System.out.println(strRev);

	}

}
