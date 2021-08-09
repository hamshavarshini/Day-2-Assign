package asignment1.day2;
import java.util.Arrays;
public class MissingElementArray {
	
	
	public static void main(String[] args) {
		
		int arr[]= {0,1,2,4,7,6,8};
		Arrays.sort(arr);
		System.out.println("sorted array= ");
		
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i]!=i)
			{
				System.out.println("missing" +i);
				break;
			}
			}
			
			}
		
	

}
