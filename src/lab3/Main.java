package lab3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*Package babyStoller = new Package(2, "Baby Stoller", Zone.IA);
		Package computerMonitor = new Package(2, "Computer Monitor", Zone.OH);
		Package modem = new Package(3.5, "Modem", Zone.OH);*/
		ArrayList<Package> packages = new ArrayList<>();
		/*packages.add(modem);
		packages.add(computerMonitor);
		packages.add(babyStoller);*/
		ArrayList<ACarrier> lowestCost = new ArrayList<>();
		Map<String,Float> people = new HashMap<>();
		people.put("Student", (float) 10);
		people.put("Senior", (float) 15);
		String peopleCat;
		putText("Are you [Student] or [Senior]: ");
		peopleCat = getString();
		//GET PACKAGE DETAILS FROM USERS
		while (true) {
			putText("Enter Package Description: ");
			String desc = getString();
			putText("Enter Package Weight: ");
			double weight = getDouble();
			putText("Enter Zone: ");
			String zone = getString();
			
			packages.add(new Package(weight, desc, Zone.valueOf(zone)));
			putText("Do you want to add more package or quit : (y/n) ");
			int choice = getChar();
			if(choice=='n'){
				break;
			}

		} // end while
		System.out.println("=========================RESULT====================================");
		System.out.println("PACKAGE\t COST \t AFTER DISCOUNT \t CARRIER");
		for (Package pack : packages) {
			ACarrier ups = new UPS(pack);			
			ACarrier usMail = new USMail(pack);			
			ACarrier fedEx = new FedEx(pack);
					
			lowestCost.add(ups);
			lowestCost.add(usMail);
			lowestCost.add(fedEx);

			Collections.sort(lowestCost);
			//CALCULATE DISCOUNTED PRICE ACCORDING TO PEOPLE CATEGORY
			double discount = people.get(peopleCat);
			double discountAmt = (discount/100)*lowestCost.get(0).cost();
			double finalLowestCost = lowestCost.get(0).cost()-discountAmt;
			
			System.out.println(
					pack.getDescription() + "\t (" + lowestCost.get(0).cost()+")\t "+finalLowestCost + "\t " + lowestCost.get(0).getType());
			lowestCost.removeAll(lowestCost);
		}
		

	}

	public static char getChar() throws IOException // reads a character from
	// the keyboard input
	{
		String s = getString();
		return s.charAt(0);
	}

	public static void putText(String s) // writes string s to the screen
	{
		System.out.println(s);
	}

	// -------------------------------------------------------------
	public static String getString() throws IOException // reads a string from
														// the keyboard input
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;
	}

	public static double getDouble() throws IOException // reads an double from
														// the keyboard input
	{
		String s = getString();
		return (Double.valueOf(s)).doubleValue();
	}

}
