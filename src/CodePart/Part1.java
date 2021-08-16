package CodePart;

public class Part1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sArry[][] = { { 1, 2 }, { 3, 4 }, };
		int sum = 0;
		for (int i = 0; i < sArry.length; i++) {
			for(int j=0; j<sArry[0].length; j++) 
				
			
			sum += sArry[i][j];
		}
		System.out.println("Total = " + sum);
	}

}
