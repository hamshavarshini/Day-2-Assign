package asignment1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculator mycal = new calculator();
		mycal.add();
		mycal.sub();
		mycal.mul();
		mycal.div();
		
		int sum = mycal.add();
		System.out.println("sum = "+ sum);
		int sub = mycal.sub();
		System.out.println("sub = "+ sub);
		int mul = mycal.mul();
		System.out.println("mul = "+ mul);
		int div = mycal.div();
		System.out.println("div = "+ div);
										

	}

}
