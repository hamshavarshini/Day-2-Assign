package asignment1.day2;

public class FindDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr1[]= {14,12,13,11,15,14,18,16,17,19,18,17,20};
System.out.println("the duplicate elements are");
for(int i=0; i<arr1.length;i++)
{
	for(int j= i+1;j<arr1.length;j++)
	{
		if(arr1[i]==arr1[j])
		{
		System.out.println(arr1[j]);
		}
	}
}
	}

}
