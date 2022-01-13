import java.util.Scanner;

public class Anagram {
	
	public static boolean isAnagram(String str1, String str2) 
	{
		if(str1.length()!=str2.length()) 
		{
			return false;
		}
		
		int count[] = new int[256];
		
		for(int i=0;i<str1.length();i++) 
		{
			count[str1.charAt(i)]++;
			count[str2.charAt(i)]--;
		}
		for(int j=0;j<count.length;j++) 
		{
			if(count[j]!=0) 
			{
				return false;
			} 
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st string : ");
		String str1 = sc.next();
		System.out.println("Enter the 2nd string : ");
		String str2 = sc.next();
		
		if(isAnagram(str1, str2))
			System.out.println("Anagram");
		else
			System.out.println("Not Anagram");
	}
}
