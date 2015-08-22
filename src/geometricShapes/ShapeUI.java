/**
 * @authors Eddie Kaleb, Rebeca Galdino and Thayanne Luiza.
 * @date August/2015
 * Main menu of Geometrical Shapes project. 
 */
package geometricShapes;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ShapeUI {

	/**
	 * Menu which directs the user through the sections.
	 *
	 */
	public static void main(String[] args) {
	  try{
		  
			boolean exit = false;
			do {
	
				Scanner sc = new Scanner(System.in);
				System.out.println("WELCOME!");
				System.out.println("Choose the shape you want to explore (press 6 to Exit): ");
				System.out
						.println("1 - Rectangle  2 - Square  3 - Trapezium  4 - Circle  5 - Lozenge");
				String choice = sc.nextLine();
				switch (choice) {
					case "1":
						rectangleOperations();
						break;
					case "2":
						squareOperations();
						break;
					case "3":
						trapeziumOperations();
						break;
					case "4":
						break;
					case "5":
						lozengeOperations();
						break;
					case "6":
		                 System.out.println("Quitting Program...");
		                 exit = true;
		                 break;
		            default:
		                 System.err.println("Sorry, please enter valid Option");

	            }// End of switch statement

	         } while (!exit);
	            // Exiting message when user decides to quit Program
	            System.out.println("Thanks for using this Program...");

	   } catch (Exception ex) {
	       // Error Message
	       System.err.println("Sorry problem occured within Program");
	   }

	}// End of main Method
	
	

	/**
	 * LOZENGE operations' menu, which call the calculation methods
	 */
	public static void lozengeOperations() {
		try {
			boolean back = false;
			while (!back) {
				Scanner s = new Scanner(System.in);
				System.out
						.println("What do you want to do? (Press 3 to back to the Menu.)");
				System.out
						.println("1 - Calculate the Perimeter   2 - Calculate the Area");
				String op = s.nextLine();
				switch (op) {
				case "1":
					System.out.println("Type the side's value:");
					Lozenge lozenge = new Lozenge((s.nextDouble()), 0, 0);
					System.out.println(lozenge.perimeter());
					break;
				case "2":
					System.out.println("Type the major diagonal: ");
					double D = s.nextDouble();
					System.out.println("Type the smaller diagonal: ");
					double d = s.nextDouble();
					Lozenge l = new Lozenge(0, D, d);
					System.out.println(l.area());
					break;
				default:
					back = true;
					break;
				}
		}
		} catch (Exception e){
			System.err.println(e.getMessage());
		}
	}

	/**
	 * RECTANGLE operations' menu, which call the calculation methods
	 */
	public static void rectangleOperations() {
	   try {
		   
		boolean back = false;
		while (!back) {
			Scanner s = new Scanner(System.in);
			System.out
					.println("What do you want to do? (Press 3 to back to the Menu.)");
			System.out
					.println("1 - Calculate the Perimeter   2 - Calculate the Area");
			String op = s.nextLine();
			switch (op) {
			case "1":
				System.out.println("Type the base's value:");
				double base = s.nextDouble();
				System.out.println("Type the height's value:");
				double height = s.nextDouble();
				Rectangle rectangle = new Rectangle(base, height);
				System.out.println(rectangle.perimeter());
				break;
			case "2":
				System.out.println("Type the base's value:");
				double b = s.nextDouble();
				System.out.println("Type the height's value:");
				double h = s.nextDouble();
				Rectangle r = new Rectangle(b, h);
				System.out.println(r.area());
				break;
			default:
				back = true;
				break;
			}
		 } 
	   } catch (Exception e){
		   System.err.println(e.getMessage());
	   }
	}

	// ---------------------------------------------------------------------------------------------------------------
	// SQUARE
	// ---------------------------------------------------------------------------------------------------------------

	public static void squareOperations() {
		try {
			boolean back = false;
			do{
			BufferedReader l = new BufferedReader(new InputStreamReader(
					System.in));
			System.out
					.println("What do you want to do? (Press 3 to back to the Menu.)");
			System.out
					.println("1 - Calculate the Perimeter   2 - Calculate the Area");
			String op = l.readLine();
				switch (op) {
				case "1":
					System.out.println("Type the side's value: ");
					double side = Double.parseDouble(l.readLine());
					double height = side;
					Square s = new Square(side, height);
					System.out.println(s.perimeter());
					break;
				case "2":
					System.out.println("Type the side's value: ");
					side = Double.parseDouble(l.readLine());
					height = side;
					s = new Square(side, height);
					System.out.println(s.area());
					break;
				default:
					back = true;
					break;
				}
			}while(!back);

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}



//--------------------------------------------------------------------------------------------------------------
//TRAPEZIUM 
//--------------------------------------------------------------------------------------------------------------


	public static void trapeziumOperations(){
	try {
		boolean back = false;
		do{
		BufferedReader l = new BufferedReader(new InputStreamReader(
				System.in));
		System.out
				.println("What do you want to do? (Press 3 to back to the Menu.)");
		System.out
				.println("1 - Calculate the Perimeter   2 - Calculate the Area");
		String op = l.readLine();
			switch (op) {
			case "1":
				System.out.println("Type the side's value: ");
				double side   = Double.parseDouble(l.readLine());
				System.out.println("Type the height's value: ");
				double height = Double.parseDouble(l.readLine());
				System.out.println("Type the biggest side's value: ");
				double big = Double.parseDouble(l.readLine());
				System.out.println("Type the smallest side's value: ");
				double small = Double.parseDouble(l.readLine());
				Trapezium t = new Trapezium(side, height, big, small);
				System.out.println(t.perimeter());
				break;
			case "2":
				System.out.println("Type the side's value: ");
				side   = Double.parseDouble(l.readLine());
				System.out.println("Type the height's value: ");
				height = Double.parseDouble(l.readLine());
				System.out.println("Type the biggest side's value: ");
				big = Double.parseDouble(l.readLine());
				System.out.println("Type the smallest side's value: ");
				small = Double.parseDouble(l.readLine());
				t = new Trapezium(side, height, big, small);
				System.out.println(t.perimeter());
				break;
			default:
				back = true;
				break;
			}
		}while(!back);

	} catch (Exception e) {
		System.err.println(e.getMessage());
	}
  }
}