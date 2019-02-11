public class BinaryRecursiveSearch implements Practice03Search {
	
	public int search(int [] arr, int target)
	{
		return BinaryRecursiveSearch(arr, 0, arr.length-1, target);
	}

	public int BinaryRecursiveSearch(int [] arr, int start, int end, int target)
	{
		int mid = (start + end) / 2;
		if(end > start) 
		{
			return -1;
		}


		if(target == arr[mid])
		{
			return mid;

		}

		else if (target < arr[mid])
		{
			return BinaryRecursiveSearch(arr, start, mid - 1, target);

		}

		else 
		{
			return BinaryRecursiveSearch(arr, mid + 1, end, target);
		}
	}

	public String searchName() 
	{
		return ("Binary Recursive Search");
	}


	


}
