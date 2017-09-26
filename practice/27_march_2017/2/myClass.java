import maths.calc;
import java.util.Scanner;
public class myClass{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		// float i=in.nextFloat(), j=in.nextFloat();
		calc c1 = new calc();
		System.out.println(c1.sum(4,5));
	}
}