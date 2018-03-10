import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n;
		
		// set the size of array
		//System.out.print("Please input n:");
		n = input.nextInt();
		
		// create array numbers
		int[] numbers = new int[n];
		
		// append elements
		for(int counter = 0; counter < n; counter++)
			numbers[counter] = input.nextInt();
		
		int mini = 10001;
		for(int i = 0; i < n; i++) {
			for(int j = i+1; j < n; j++) {
				int gap = Math.abs(numbers[i] - numbers[j]);
				if(mini > gap)
					mini = gap;
			}
		}
		
		System.out.print(mini);
		
	}

}
