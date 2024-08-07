class Solution
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
       int maxSum=Integer.MIN_VALUE;
       int cursum=0;
       for(int num:arr)
       {
        cursum+=num;
        maxSum=Math.max(maxSum,cursum);
        if(cursum<0)
        cursum=0;
       }
      System.out.println(maxSum);
        
    }
}