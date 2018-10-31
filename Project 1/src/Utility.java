
import java.util.ArrayList;

public class Utility
{	
	public static float findSumOfList(ArrayList<Float> list)
	{
		float sum = 0;
		for(int i = 0; i < list.size(); i++)
		{
			sum += list.get(i);
		}
		return sum;
	}
	
	public static float findMeanOfList(ArrayList<Float> list)
	{
		return findSumOfList(list) / list.size();
	}
	
	public static ArrayList<Float> buildList(int size, float initValue)
	{
		ArrayList<Float> tmpIntList = new ArrayList<Float>();
		for(int i = 0; i < size; i++)
		{
			tmpIntList.add(initValue);
		}
		return tmpIntList;
	}
	
	public static float maxFloatInList(ArrayList<Float> list)
	{
		float max = 0;
		for(int i = 0; i < list.size(); i++)
		{
			if(max < list.get(i))
			{
				max = list.get(i);
			}
		}
		
		return max;
	}	
	
	public static int maxIntInList(ArrayList<Integer> list)
	{
		int max = 0;
		for(int i = 0; i < list.size(); i++)
		{
			if(max < list.get(i))
			{
				max = list.get(i);
			}
		}
		return max;
	}	
}
