package methods;

public class Book {

	String brand="classmate";
	int pages;
	String size;
	double prize;
	
	Book(){
		brand="classmate";
		pages= 100;
		size="medium";
		prize= 65.00;
	}
	
	Book(String inbrand, int inpages, String insize, double inprize){
		brand = inbrand;
		pages = inpages;
		size = insize;
		prize = inprize;
	}
	
	void writting() {
		System.out.println("used for writting");
	}
	
	void drawing() {
		System.out.println("used for drawing");
	}
}
