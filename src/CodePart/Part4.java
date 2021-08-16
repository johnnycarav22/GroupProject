package CodePart;

public class Part4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		
		System.out.println("-----before swapping-----");
		System.out.println("First number is "+a);
		System.out.println("Second number is "+b);
		
		a=a-b;
		b=a+b;
		a=b-a;
		
		
		System.out.println("-------after swapping------");
		System.out.println("First number is "+a);
		System.out.println("Second number is "+b);
	}

}
