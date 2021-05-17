import java.util.ArrayList;
import java.util.Scanner;

public class ShoeController {
	
	Validation validate = new Validation();
	Scanner scan = new Scanner(System.in);

	public void view(ArrayList<Shoe> shoes) {
		if(shoes.isEmpty()) {
			System.out.println("No shoes available..");
			System.out.println("press enter to continue..");
			scan.nextLine();
		}else {
			for(Shoe shoe: shoes) {
				System.out.println(shoes.indexOf(shoe)+ 1 + ", "+ shoe);
			}
			System.out.println("press enter to continue..");
			scan.nextLine();
		}	
	}

	public void add(ArrayList<Shoe> shoes) {
		String name, category, releaseDate;
		int price;
		
		do {
			System.out.printf("Input shoe's name[name ends with shoe, example: \"Fire shoe\"]: ");
			name = scan.nextLine();
		}while(!validate.shoeName(name));
		
		do {
			System.out.printf("Input shoe's category[Sneaker | Running | Boot] (case sensitive): ");
			category = scan.nextLine();
		} while(!validate.shoeCategory(category));
		
		do {
			System.out.printf("Input shoe's release date[dd-mm-yyy]: ");
			releaseDate = scan.nextLine();
		}while(!validate.shoeDateFormat(releaseDate));
		
		do {
			System.out.printf("Input shoe's price[more than or equals to 5000]: ");
			price = scan.nextInt();
			scan.nextLine();
		}while(validate.shoePrice(price));
		
		shoes.add(new Shoe(name,category,releaseDate, price));
		System.out.println("Shoe added!");
		System.out.println("press enter to continue..");
		scan.nextLine();	
	}

	public void delete(ArrayList<Shoe> shoes) {
		if(shoes.isEmpty()) {
			System.out.println("No shoes available..");
			System.out.println("press enter to continue..");
			scan.nextLine();
		}else {
			view(shoes);
			int choice = -1;
			do {
				System.out.printf("Choose shoe's number to delete[1..%d]: ",shoes.size());
				choice = scan.nextInt();
				scan.nextLine();
			}while(choice <1 || choice > shoes.size());
			
			shoes.remove(choice-1);
			System.out.println("shoe removed");
			System.out.println("press enter to continue..");
			scan.nextLine();
		}
		
	}
	
	
}
