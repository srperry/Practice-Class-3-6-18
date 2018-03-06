import java.util.Scanner;
public class ThreeNumbers {

	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter three numbers: \n");
	 int n1=scanner.nextInt();
	 int n2=scanner.nextInt();
	 int n3=scanner.nextInt();
	 
if((n1>n2)&(n2>n3)){
	System.out.println("The largest is "+n1);
	System.out.println("The smallest is "+n3);
}
else if((n2>n1)&(n1>n3)){
	System.out.println("The largest is "+n2);
	System.out.println("The smallest is "+n3);
} 
else if((n3>n2)&(n2>n1)){
	System.out.println("The largest is "+n3);
	System.out.println("The smallest is "+n1);
}
	 
	}
}
