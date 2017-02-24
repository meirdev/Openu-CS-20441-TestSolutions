package Test_2012_82;

public class Question_1 {
	public static boolean isSumOf(int[] a, int n)
    {
        int[] history = new int[n];
        return isSumOf(a,n,0,history,0);
    }
    
    private static boolean isSumOf(int[] a, int n, int i, int[] history, int ind)
    {
        if(n == 0)
        {
            return true;
        }
        
        if(n < 0 || i == a.length)
        	return false;
        
        history[ind] = a[i];
        
        if(isSumOf(a, n-a[i], i, history, ind+1))
        	return true;
        
        return isSumOf(a,n,i+1,history,ind);
    }
}
