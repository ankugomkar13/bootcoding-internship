public class Avgarray
{
	public static void main(String[] args) {
		int arr[]={2,4,0,56,78,23,0,1,2};
		int sum =0;
	    for(int i=0;i<7;i++)
	    {
	        for(int j=0;j<6;j++)
	        {
	            if(arr[j]<arr[j+1])
		        {
		            int temp = arr[j];
		            arr[j]=arr[j+1];
		            arr[j+1]=temp;
		        }
	        }
	    }
	    for(int i=1;i<6;i++)
	    {
	        sum=sum+arr[i];
	    }
	    System.out.println("Sum of Array element except the largest and smallest element");
        System.out.println(sum);
}
}