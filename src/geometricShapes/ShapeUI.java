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
			System.out.println("What do you want to do?");
			System.out.println("1 - Calculate the Perimeter   2 - Calculate the Area");
			String op = s.nextLine();
			switch(op){
				case "1":
					System.out.println("Type the side's value:");
					Lozenge lozenge = new Lozenge((s.nextDouble()), 0, 0);
					lozenge.perimeter();
				case "2" : 
					System.out.println("Type the major diagonal: ");
					int D = s.nextInt();
					System.out.println("Type the ");
					
			}
		
	  }
	}
}
