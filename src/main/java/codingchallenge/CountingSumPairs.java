package codingchallenge;

import java.util.ArrayList;
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
		List<Integer> numbers = new ArrayList<Integer>(array.length);
		for (int i : array)
		{
			numbers.add(i);
		}

		for(int i=0;i<numbers.size();i++)
		{
			int pairFirstElement=(numbers.get(i)).intValue();
			for(int j=i+1;j<numbers.size();j++)
			{
				if(pairFirstElement+(numbers.get(i)).intValue()==sum)
				{
					count++;
					numbers.remove(j);
				}
			}
		}
		System.out.println("Number of pairs for Sum "+sum+" is "+count);
	}
}