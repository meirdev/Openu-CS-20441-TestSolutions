package Test_2015_91_460;

public class Question_1 {
	public static int makeSum (int[] length, int k, int num)
	{
		if (num == 0)
			return 0;
		if (k == 0)
			return 0;
		int i = 0;
		
		return makeSum (length, k , num, i);
	}

	public static int makeSum (int[] length, int k, int num, int i)
	{
		if (i > length.length-1 || num==0)
		{
			return 0;
		}
		if (k-length[i] ==0)
		{
			return (1+ makeSum (length,k,num,i+1));
		}
		if (k-length[i]>0)
		{
			int sum1 = 0;
			int sum2 = 0;
			sum1 = makeSum (length,k-length[i],num-1,i);
			sum2 = makeSum(length,k,num,i+1);
			return (sum1+sum2);
		}
		else
		{
			return (makeSum (length,k,num,i+1));
		}
	}

	public static void main (String []args)
	{
		int[] a = {2,5,10,20,50};
		int k = 40;
		int num = 4;
		System.out.println (makeSum (a,k,num));
	}
}
