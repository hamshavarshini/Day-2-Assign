package asignment1.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String test = "i am a software tester";
String[] word = test.split(" ");
String rev="";
for(int i=0; i<word.length; i++)
{
	String words  = word[i];
	String revword="";
	for (int j=words.length()-1;j>=0; j--)
	{
		revword=revword+words.charAt(j);
		
	}
	rev= rev+revword+" ";
	
	
}
System.out.println(test);
System.out.println(rev);
		
	}

}
