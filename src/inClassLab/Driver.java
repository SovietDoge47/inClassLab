package inClassLab;

public class Driver
{
	public static void main(String[] args)
	{
		int[] numbers = new int[]{64, 25, 12, 22, 11};
							   //{11, 25, 12, 22, 64};
		int temp = 0;
		for(int i = 0; i < (numbers.length)-1; i++)
		{
			int min = numbers[i];
			for(int x = i + 1; x < numbers.length; x++)
			{
				if(numbers[x] < min)
				{
					min = numbers[x];
				}
				temp = numbers[i];
				numbers[i] = min;
				numbers[x] = temp;
			}
		}
		for(int y = 0; y < numbers.length; y++)
		{
			System.out.println(numbers[y]);
		}
	}
}
