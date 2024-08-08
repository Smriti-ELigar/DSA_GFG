//{ Driver Code Starts
import java.util.*;

class GFG
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n]; 
			for(int i=0;i<n;i++)
			{
				arr[i] = sc.nextInt();
			}
		
			Solution obj = new Solution();
			obj.selectionSort(arr, n);
			
			for(int i=0;i<n;i++)
		    	System.out.print(arr[i]+" ");
		    System.out.println();
			t--;
		}
		
	}
}

// } Driver Code Ends

class Solution
{
    int select(int arr[], int i, int n)
    {
        int imin = i;  // Initialize imin to the starting index i

        // Iterate through the array starting from i+1 to find the minimum element
        for(int j = i + 1; j < n; j++)
        {
            if(arr[j] < arr[imin])
            {
                imin = j;  // Update imin if a smaller element is found
            }
        }

        return imin;  // Return the index of the minimum element
    }

    void selectionSort(int arr[], int n)
    {
        // Iterate through the array to sort it
        for(int i = 0; i < n - 1; i++)
        {
            int imin = select(arr, i, n);  // Find the index of the minimum element

            // Swap the found minimum element with the current element
            int temp = arr[imin];
            arr[imin] = arr[i];
            arr[i] = temp;
        }
    }
}


