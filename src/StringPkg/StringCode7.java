package StringPkg;
import java.util.Scanner;
public class StringCode7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//step-1
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String:");
		String str = sc.nextLine();

		//step-2
		//We Love RCB
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ' || i==str.length()-1) {
				count++;




			}
		}
		System.out.println("word count:"+count);


	}
}







