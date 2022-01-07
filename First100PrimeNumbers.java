package com.commonprograms;

public class First100PrimeNumbers {
	
	 public static void main(String[] args) {

	        int i;
	        int num = 0;
	        int maxNumber = 100;
	        boolean isPrime = true;

	       
	        String primeNumbersFound = "";

	        
	        for (i = 2; i <= maxNumber; i++) {
	            isPrime = CheckPrime(i);
	            if (isPrime) {
	                primeNumbersFound = primeNumbersFound + i + " ";
	            }
	        }
	        System.out.println("Prime numbers from 1 to " + maxNumber + " are:");
	        System.out.println(primeNumbersFound);
	    }
	    public static boolean CheckPrime(int numberToCheck) {
	        int remainder;
	        for (int i = 2; i <= numberToCheck / 2; i++) {
	            remainder = numberToCheck % i;
	           
	            if (remainder == 0) {
	                return false;
	            }
	        }
	        return true;

	    }
	
	
	

}
