package asignment1.day2;

public class calculator {
public int add()
{
	int a=10, b=5;
	int c= a+b;
	return c;
}
public int sub()
{
	int d=12, e=4;
	int f=d+e;
	return f;
}
 public int div()
 {
	 int a=10, b=2;
	 int  c=a/b;
	 return c;
	 
 }
 public int mul()
 {
	 int d=10, e=3;
	 int f= d*e;
	 return f;
 }
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
calculator cal= new calculator();
int add= cal.add();
System.out.println("the sum = "+add);
int sub= cal.sub();
System.out.println("the sub = "+sub);
int mul= cal.mul();
System.out.println("the mul = "+mul);
int div= cal.div();
System.out.println("the div = "+div);

	}

}
