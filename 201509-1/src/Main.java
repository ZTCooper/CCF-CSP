
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
		
		int counter = 1;
		for(int i=0; i<n-1; i++) {
			if (num[i] == num[i+1])
				continue;
			else
				counter++;
		}
		
		System.out.print(counter);
	}
}
