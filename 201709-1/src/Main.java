import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int money;
		money = input.nextInt();
		
		int total = 0;
		total += money/50*7;
		money = money - money/50*50;
		total += money/30*4;
		money = money - money/30*30;
		total += money/10;
		
		System.out.print(total);
	}
}
