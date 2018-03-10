import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n;
		n = input.nextInt();
		
		int[] num = new int[n];
		for(int i=0; i<n; i++) {
			num[i] = input.nextInt();
		}
		
		int counter = 0;
		for(int i=0; i<n-1; i++) {
			for(int j=i+1; j<n; j++) {
				if(num[i] + num[j] == 0) {
					counter++;
				}
			}
		}
		
		System.out.print(counter);
	}
}
