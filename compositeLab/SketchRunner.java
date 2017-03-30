package compositeLab;

public class SketchRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SketchedItem house = new Sketch("House", 3);
		SketchedItem path = new Sketch("Path", 6);
		SketchedItem car = new Sketch("Car", 5);

		SketchedItem picture = new Drawing("My Picture");
		//add items to the drawing here
		picture.addItem(house);		
                picture.addItem(path);
                picture.addItem(car);


		//print out single items here
                System.out.println(house);
                System.out.println(path);
                System.out.println(car);
		
		//print out a drawing (composite) here
                System.out.println(picture);
		
		}
}

