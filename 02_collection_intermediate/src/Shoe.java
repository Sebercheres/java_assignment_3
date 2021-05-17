import java.util.concurrent.ThreadLocalRandom;

public class Shoe {
	private String Id;
	private String name;
	private String Category;
	private String releaseDate;
	private int price;
	
	public Shoe(String name, String category, String releaseDate, int price) {
		this.Id = generateId();
		this.name = name;
		this.Category = category;
		this.releaseDate = releaseDate;
		this.price = price;
	}

	@Override
	public String toString() {
		String result = "";
		result += this.name + "-" + this.Id + "\n";
		result += "=====================\n";
		result += "Category: " + this.Category + "\n";
		result += "Release date: " + this.releaseDate + "\n";
		result += "Price: " + String.valueOf(this.price) +"\n"; 
		return result;
	}

	private String generateId() {
		String ID = "SH";
		for(int i=0;i<3;i++) {
			Integer n = ThreadLocalRandom.current().nextInt(0, 10);
			ID += n.toString();
		}
		
		return ID;
	}

	public String getId() {
		return this.Id;
	}

	public void setId(String id) {
		this.Id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return this.Category;
	}

	public void setCategory(String category) {
		this.Category = category;
	}

	public String getReleaseDate() {
		return this.releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public int getPrice() {
		return this.price;
	}

	public void setPrice(int price) {
		this.price = price;
	}	
}
