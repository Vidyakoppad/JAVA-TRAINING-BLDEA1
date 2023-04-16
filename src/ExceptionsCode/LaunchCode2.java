package ExceptionsCode;
import java.util.Scanner;
class Operations{

	void function1() throws ArithmeticException{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the numerator:");
		int num=sc.nextInt();
		System.out.println("enter the denominator:");
		int deno=sc.nextInt();
		int res=num/deno;
		System.out.println(res);
	}
}

public class LaunchCode2 {

	public static void main(String[] args){

		try {
			Operations op=new Operations();
			op.function1();
		}
		catch(ArithmeticException e) {
			System.out.println("Exception handled in main method");
		}

	}

}
