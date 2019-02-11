public class BinaryIterativeSearch implements Practice03Search
{
	

	

    public int search( int arr[], int target)
    {
        int first = 0;
        int last = arr.length - 1;
        int mid = (first + last) / 2;
        
        while (first <= last)
        {
            
            if(arr[mid] < target)
            {
                first = mid + 1;
            }
            else if (arr[mid]==target)
            {
                break;
            }
            else
            {
                last = mid - 1;
            }
            mid = (first + last) / 2;
        }
        return -1;
    }
    
    public String searchName()
    {
        return ("Binary Iterative Search");
    }

}
