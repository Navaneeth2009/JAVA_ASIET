import java.util.*;
class pali
{
	public static void main(String args[])
	{
		Scanner s1=new Scanner(System.in);
		String str;
		String rev="";
		System.out.println("Enter string : ");
		str=s1.nextLine();
		int len=str.length();
		for(int i=len-1;i>=0;i--)
			{
				rev=rev+str.charAt(i);
			}
		System.out.println("Reverse of string is : "+rev);
		
		s1.close();

	}	
}
