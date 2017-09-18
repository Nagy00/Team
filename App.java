import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int x = 0; // team members.
		int y = 0;
		int z = 0;
		int counter = 0;
		for (int i = 0; i < n; i++) {
			x = scanner.nextInt();
			y = scanner.nextInt();
			z = scanner.nextInt();
			if ((x + y + z) >= 2) {
				counter++;
			}
		}
		System.out.println(counter);
		scanner.close();

	}

}
