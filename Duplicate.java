public class Duplicate
{
	public static void main(String[] args) {
		int arr[]={2,4,56,78,23,1,2};
	    for(int i=0;i<7;i++)
	    {
	        for(int j=i+1;j<7;j++)
	        {
	            if(arr[i] == arr[j])  
                System.out.println(arr[i]);  
	        }
	    }

}
}