package com.commonprograms;

public class SwapTwoNumWithThirdVariable {
	public static void main(String[] args) {
		int intFirstNum=34,intSecondNum=78,intTemp;
		System.out.println("Before swap "+intFirstNum+" "+intSecondNum);
		intTemp = intFirstNum;
		intFirstNum = intSecondNum;
		intSecondNum = intTemp;
		System.out.println("After swap "+intFirstNum+" "+intSecondNum);	
 }
	
}
