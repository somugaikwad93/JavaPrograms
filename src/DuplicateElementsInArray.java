
public class DuplicateElementsInArray {

	public static void main(String[] args) {
		int[] arr = {2, 4, 6, 6, 7, 2, 1};
		
		for(int i =0; i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++) 
			{
				if(arr[i]==arr[j]) 
				{
					System.out.println(arr[i]);
				}
			}
		}

	}
}
