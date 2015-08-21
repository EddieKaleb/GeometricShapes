package geometricShapes;

import java.util.Scanner;

public class ShapeUI {
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
					break;
				case "2" :
					break;
				case "3" :
					break;
				case "4" :
					break;
				case "5" :
					lozengeoperations();
					break;
				default:
					exit = true;
					break;		
			}
			
		}
		
	}
	
	public static void lozengeoperations(){
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
}