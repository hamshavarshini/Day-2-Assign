package asignment1.day2;

import java.util.Arrays;
public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String text1= "stops";
String text2="potss";
boolean stat= true;
if(text1.length()!=text2.length())
{
	stat= false;
	
}
else
{
	char[] ArrayText1= text1.toLowerCase().toCharArray();
	char[] ArrayText2= text2.toLowerCase().toCharArray();
	Arrays.sort(ArrayText1);
	Arrays.sort(ArrayText2);
	stat=Arrays.equals(ArrayText1,ArrayText2);
	
			}
	
	if(stat)
	{
		
	System.out.println(text1+ " and " +text2 +" are anagrams");
	}
	else
	{
		System.out.println(text1+ " and "+ text2+ " are not anagrams");
	}
	
	}}

