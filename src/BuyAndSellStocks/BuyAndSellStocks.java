package BuyAndSellStocks;

import java.util.Scanner;

public class BuyAndSellStocks {
	
	public static int profit(int[] arr)
	{
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int index = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] < min)
			{
				min = arr[i];
				index = i;
			}
		}
		for(int i=index+1;i<arr.length;i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
			}
		}
		return max- min;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); 
		System.out.println("Enter Size of the Array :");
		int number = scan.nextInt();
		System.out.println("Enter elements of the Array :");
		int[] arr = new int[number];
		for(int i =0;i<number;i++)
		{
			arr[i]=scan.nextInt();
		}	
		int result = profit(arr);
		System.out.println(result);

	}

}
