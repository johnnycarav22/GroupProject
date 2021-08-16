package CodePart;

public class Part8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int largest = 0;
		int secondLargest = 0;
		int[] num = { 55, 77, 88, 100 };
		for (int i = 0; i < num.length; i++) {
			if (num[i] > largest) {
				secondLargest = largest;
				largest = num[i];
			} else if (num[i] > secondLargest) {
				secondLargest = num[i];
			}
		}
		System.out.println("The 2nd largest number is: " + secondLargest + ".");
	}

}
