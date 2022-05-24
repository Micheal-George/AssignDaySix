package com.Masai;

public class PrimeNum {
	
	public int[] findAndReturnPrimeNumbers(int[] inputArray){
		int[] newArr=new int[inputArray.length];
		
		for(int i=0;i<inputArray.length;i++)
		{
			int count=0;
			for(int j=1;j<=inputArray[i];j++)
			{
				if(inputArray[i]%j==0)
				{
					count++;
				}
			}
			if(count==2) {
				newArr[i]=inputArray[i];
			}
		}
		
		
		
		return newArr;
		}

	public static void main(String[] args) {
		
		int[] arr = {10,12,5,50,11,14,15};
		PrimeNum p=new PrimeNum ();
		int[] ans=p.findAndReturnPrimeNumbers(arr);
		int count=0;
		for(int i=0;i<ans.length;i++)
		{
			if(ans[i]==0)
				count++;
			
		}
		if(count==ans.length)
		{
			System.out.println("Prime number not found in the supplied Array");	
		}
		else
		{
			for(int i=0;i<ans.length;i++)
			{
				if(ans[i]==0)
					continue;
				System.out.println(ans[i]);
			}
		}
	}

}



