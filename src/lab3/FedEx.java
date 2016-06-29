package lab3;

public class FedEx extends ACarrier {
	
	public Package pack;

	public FedEx(Package pack) {
		super();
		this.pack = pack;
	}
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		double cost =0;
		switch(pack.getZone()){
			case IA:
			case MT:
			case OR:
			case CA:
				cost = 0.35*pack.getWeight();
				break;
			case TX:
			case UT:
				cost = 0.30*pack.getWeight();
				break;
			case FL:
			case MA:
			case OH:
				cost = 0.55* pack.getWeight();
				break;
			default:
				cost = 0.43* pack.getWeight();
			
		}
		return cost;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "FedEx";
	}

}
