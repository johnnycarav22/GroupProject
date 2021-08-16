package CodePart;

public class Part2 {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3, 4 }, { 11, 22, 33, 44 }, { 101, 202, 333, 444 } };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0;j< 4; j++) {
				if (arr[i][j]%2==0)
				System.out.println(arr[i][j]);
			}
			}
	}
}
