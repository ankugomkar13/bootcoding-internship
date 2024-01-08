public class SecNum
{
	public static void main(String[] args) {
		int arr[]={2,4,56,78,23,1,2};
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
		System.out.println("second largest  element of an array ");
		System.out.println(arr[1]);
		
	}
}