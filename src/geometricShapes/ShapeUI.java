/**
 * @authors Eddie Kaleb, Rebeca Galdino and Thayanne Luiza.
 * @date August/2015
 * Main menu of Geometrical Shapes project. 
 */
package geometricShapes;

import java.util.Scanner;

public class ShapeUI {
	
	/**
	 * Menu which directs the user through the sections. 
	 *
	 */
	public static void main(String[] args){
		boolean exit = false;
		while (!exit){

			Scanner s = new Scanner(System.in);
			System.out.println("WELCOME!");
			System.out.println("Choose the shape you want to explore (press 6 to Exit): ");
			System.out. println("1 - Rectangle  2 - Square  3 - Trapezium  4 - Circle  5 - Lozenge");
			String choice = s.nextLine();
			switch(choice){
				case "1" : 
					rectangleOperations();
					break;
				case "2" :
					break;
				case "3" :
					break;
				case "4" :
					break;
				case "5" :
					lozengeOperations();
					break;
				default:
					exit = true;
					break;		
			}
			
		}
		
	}
	
	/**
	 * Lozenge operations' menu, which call the calculation methods
	 */
	public static void lozengeOperations(){
		boolean back = false;
		while (!back){
			Scanner s = new Scanner(System.in);
			System.out.println("What do you want to do? (Press 3 to back to the Menu.)");
			System.out.println("1 - Calculate the Perimeter   2 - Calculate the Area");
			String op = s.nextLine();
			switch(op){
				case "1":
					System.out.println("Type the side's value:");
					Lozenge lozenge = new Lozenge((s.nextDouble()), 0, 0);
					System.out.println(lozenge.perimeter());
					break;
				case "2" : 
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
	}
	
	/**
	 * Lozenge operations' menu, which call the calculation methods
	 */
    public static void rectangleOperations(){
	   boolean back = false;
		while (!back){
			Scanner s = new Scanner(System.in);
			System.out.println("What do you want to do? (Press 3 to back to the Menu.)");
			System.out.println("1 - Calculate the Perimeter   2 - Calculate the Area");
			String op = s.nextLine();
			switch(op){
				case "1":
					System.out.println("Type the base's value:");
					double base = s.nextDouble();
					System.out.println("Type the height's value:");
					double height = s.nextDouble();
					Rectangle rectangle = new Rectangle(base, height);
					System.out.println(rectangle.perimeter());
					break;
				case "2" : 
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
   }
    
    //---------------------------------------------------------------------------------------------------------------
    //													SQUARE
    //---------------------------------------------------------------------------------------------------------------
    
    public void squareOperations(){
    	try{
    		
    	}catch(Exception e){
    		System.err.println(e.getMessage());
    	}
    }
    
    
    
}
