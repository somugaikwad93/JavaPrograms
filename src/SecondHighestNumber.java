
public class SecondHighestNumber {

	public static void main(String[] args) {
		int[] arr = {12, 1, -1, 4, 3, 9, 7};
		int n = arr.length;
		
		int highest = Integer.MIN_VALUE; //12
		int secondHighest = Integer.MIN_VALUE; //4
		
		for(int i=0;i<n;i++) 
		{
			if(arr[i] > highest) 
			{
				secondHighest = highest;
				highest=arr[i];
				
			}
			if(arr[i]<highest && arr[i]>secondHighest) 
			{
				secondHighest=arr[i];
			}
		}
		
		System.out.println(secondHighest);
	}
}
