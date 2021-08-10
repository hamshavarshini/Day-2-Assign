package asignment1.day2;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String value= "madam", rev=""; 

int length = value.length();
for (int i= length-1; i>=0; i--)
{
	rev = rev+ value.charAt(i);
}
	if(value.equalsIgnoreCase(rev))
	{

	System.out.println(value+ " is palindrome");
	}
	else
	{
		
		System.out.println(value+ " is not palindrome");
}}


	}


