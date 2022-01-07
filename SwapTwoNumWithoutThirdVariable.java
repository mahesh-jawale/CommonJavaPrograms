package com.commonprograms;

public class SwapTwoNumWithoutThirdVariable {

	public static void main(String[] args) {
	
		int intFirstNum=34,intSecondNum=78;
		System.out.println("Before swap "+intFirstNum+" "+intSecondNum);
		intFirstNum=intFirstNum+intSecondNum;
		intSecondNum=intFirstNum-intSecondNum;
		intFirstNum=intFirstNum-intSecondNum;
		System.out.println("After swap "+intFirstNum+" "+intSecondNum);

	}

}
