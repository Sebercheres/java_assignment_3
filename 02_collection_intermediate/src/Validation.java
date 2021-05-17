import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Validation {
	
	boolean shoeName(String name) {
		return name.endsWith("shoe")? true: false;
	}
	
	boolean shoeCategory(String category) {
		if(category.contentEquals("Sneaker") ||
		   category.contentEquals("Running") ||
		   category.contentEquals("Boot")) {
			return true;
		}else {
			return false;
		}
	}
	
	boolean shoeDateFormat(String date) {
		try {
			SimpleDateFormat SDF = new SimpleDateFormat("dd-MM-yyyy");
			SDF.setLenient(false);
			SDF.parse(date);
		} catch (ParseException e) {
			return false;
		}
		
		return true;
	}
	
	boolean shoePrice(int price) {
		return (price >= 5000) ? false : true;
	}
	
}
