package lab3;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Package babyStoller = new Package(2, "Baby Stoller", Zone.IA);
		Package computerMonitor = new Package(3, "Computer Monitor", Zone.VA);
		Package modem = new Package(2.5, "Modem", Zone.UT);
		ArrayList<Package> packages = new ArrayList<>(); 
		packages.add(modem);
		packages.add(computerMonitor);
		packages.add(babyStoller);
		HashMap<Package,ACarrier> packageCost = new HashMap<Package,ACarrier>();
		ArrayList<Double> lowestCost = new ArrayList<>();
		
		for(Package pack : packages){
			ACarrier ups = new UPS();
			ups.cost(pack);
			ACarrier usMail = new USMail();
			usMail.cost(pack);
			ACarrier fedEx = new FedEx();
			fedEx.cost(pack);
			
			lowestCost.add(ups.cost(pack));
			lowestCost.add(usMail.cost(pack));
			lowestCost.add(fedEx.cost(pack));
			
			lowestCost.sort(null);
			
			
		}
		

	}

}
