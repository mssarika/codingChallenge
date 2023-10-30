package codingchallenge;

import java.util.Arrays;
import java.util.List;

public class CountingSumPairs {
	
	public static void main(String[] args)
	{
		CountingSumPairs coundsumpair=new CountingSumPairs();
		int[] array= {3, 4, 5, 6};
		coundsumpair.findSumPairs(array,1);
	}
	
	public void findSumPairs(int array[],int sum)
	{
		int count=0;
		List numbers=Arrays.asList(array);
		for(int i=0;i<numbers.size();i++)
		{
			int pairFirstElement=(Integer.valueOf((Integer)numbers.get(i)));
			for(int j=i+1;j<numbers.size();j++)
			{
				if(pairFirstElement+(Integer.valueOf((Integer)numbers.get(i)))==sum)
				{
					count++;
					numbers.remove(j);
				}
			}
		}
		System.out.println("Number of pairs for Sum "+sum+" is "+count);
	}
	
}
