package com.commonprograms;

public class CommonNumbersFromThreeArray {
	
	
	public static void commonElements(int array1[],int array2[],int array3[])
	{
		int x=0,y=0,z=0;
		
		while(x<array1.length&&y<array2.length&&z<array3.length)
		{
			if(array1[x]==array2[y]&&array2[y]==array3[z])
			{
				System.out.println(array1[x]);
				x++;
				y++;
				z++;
			}else if(array1[x]>array2[y])
			{
				y++;
			}else if(array2[y]>array3[z])
			{
				z++;
			}else
			{
				x++;
			}
			
		}
	}
	

	public static void main(String[] args) {
		
		int array1[]={10,20,40,22,33,44};
		int array2[]={10,20,40,22,33,99,66};
		int array3[]={10,22,40,29,55,77,44,11};
		
		commonElements(array1,array2,array3);
	}

}
