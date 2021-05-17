import java.util.ArrayList;
import java.util.Scanner;

public class ShoeApp {
	
	public ShoeApp(boolean onApp) {
		Scanner scan = new Scanner(System.in);
		ShoeController sc = new ShoeController();
		ArrayList<Shoe> shoes = new ArrayList<Shoe>();
		
		
		while(onApp) {
			System.out.println("Shoe Shop");
			System.out.println("============");
			System.out.println("1. View Shoes");
			System.out.println("2. Add shoe");
			System.out.println("3. Delete Shoe");
			System.out.println("4. Exit");
			
			
			int choice = 0;
			do {
				System.out.printf(">> ");
				choice = scan.nextInt();
				scan.nextLine();
			}while(choice < 1 || choice >4);
			
			switch(choice) {
			case 1:
				sc.view(shoes);
				break;
			case 2:
				sc.add(shoes);
				break;
			case 3:
				sc.delete(shoes);
				break;
			case 4:
				System.out.println("Thank you for using this application");
				onApp = false;
			}
		}
		scan.close();
	}

	public static void main(String[] args) {
		new ShoeApp(true);
	}

}
