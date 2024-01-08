public class Maxmin
{
	public static void main(String[] args) {
		System.out.println("find min and max in an array");
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
		System.out.println("max element of an array ");
		System.out.println(arr[0]);
		
			System.out.println("min element of an array ");
		System.out.println(arr[6]);
	}
}