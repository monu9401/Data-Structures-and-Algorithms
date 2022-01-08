// { Driver Code Starts
import java.util.*;

class Merge_Sort
{
    //method to print the elements of the array
	static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    

	public static void main(String args[])
	{
	    //taking input using Scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking testcases
		int T = sc.nextInt();
		while(T>0)
		{
		    //taking elements count
			int n = sc.nextInt();
			
			//creating an object of class Merge_Sort
			Merge_Sort ms = new Merge_Sort();
			
			//creating an array of size n
			int arr[] = new int[n];
			
			//adding elements to the array
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();

            
			Solution g = new Solution();
			
			//calling the method mergeSort
			g.mergeSort(arr,0,arr.length-1);

            //calling the method printArray
			ms.printArray(arr);
		T--;
		}
	}
}


// } Driver Code Ends


class Solution
{
    int[] merge(int arr1[],int arr2[])
    {
         int i=0,j=0,k=0;
         int arr[]=new int[arr1.length+arr2.length];
         while(i<arr1.length && j<arr2.length)
         {
             if(arr1[i]<arr2[j])
             {
                 arr[k]=arr1[i];
                 i++;
                 k++;
             }
             else
             {
                 arr[k]=arr2[j];
                 j++;
                 k++;
             }
         }
         while(i<arr1.length)
         {
             arr[k]=arr1[i];
             k++;
             i++;
         }
         while(j<arr2.length)
         {
             arr[k]=arr2[j];
             k++;
             j++;
         }
         return arr;
    }
    void mergeSort(int arr[], int l, int r)
    {
        //code here
        int a[]=sort(arr,l,r);
        for(int i=0;i<a.length;i++)
        {
            arr[i]=a[i];
        }
    }
    int[] sort(int arr[],int l,int r)
    {
        if(l==r)
        {
            int x[]=new int[1];
            x[0]=arr[l];
            return x;
        }
        
        int mid = (l+r)/2;
        int fsh[] = sort(arr,l,mid);
        int ssh[] = sort(arr,mid+1,r);
        int full[] = merge(fsh,ssh);
        return full;
    }
}
