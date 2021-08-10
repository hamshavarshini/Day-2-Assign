package asignment1.day2;

public class CharacterOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="welcome to chennai";
int count=0;
for(char i= 'a';i<='z';i++)
{
	for(int j=0; j<str.length()-1;j++)
	{
		if(str.charAt(j)==i)
		{
			count++;
		}
	}
	if(count!=0)
	{
		System.out.println(i+ " = "+count);
		count=0;
	}
}
}

	}


