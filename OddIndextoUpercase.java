package asignment1.day2;

public class OddIndextoUpercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String test = "changeme";
String[] chars = test.split("");
String out ="";
for( int i=0; i<chars.length;i++)
{
	if(i%2==0)
	{
		out= out + chars[i].toUpperCase();
		System.out.println("the upper case ="+out);
		
	}
	else
	{
		out = out+ chars[i].toLowerCase();
		System.out.println("the Lower case ="+out);
	}
		
	
}

	}

}
