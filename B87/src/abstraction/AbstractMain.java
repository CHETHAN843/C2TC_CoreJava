package abstraction;

public class AbstractMain {

	public static void main(String[] args) {
		
		Shape sOne = new Square(3.5f);
		sOne.calculateArea();
		sOne.display();
		
		Shape sTwo = new Rectangle(10,9.5f);
		sTwo.calculateArea();
		sTwo.display();

	}

}
