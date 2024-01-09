public class Leaders {
  
    public static void LeaderinArray(int arr[], int n)
    {
        int i,maximum=0;
        for(i=n-1;i>=0;i--){
            if(arr[i]>maximum){           
                System.out.print(arr[i]+" "); 
                
                maximum = arr[i];    
            }
        }
    }
    public static void main(String[] args)
    {
        int arr[] = {2,4,6,3,1,2};
        int n = arr.length;
        LeaderinArray(arr, n);
    }
}