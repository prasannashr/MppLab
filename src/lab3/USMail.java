package lab3;

public class USMail extends ACarrier {
	
	public Package pack;

	public USMail(Package pack) {
		super();
		this.pack = pack;
	}
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		double cost =0;
		if(pack.getWeight()<3){
			cost = 1*pack.getWeight();
		} else{
			cost = 0.55*pack.getWeight();
		}
		
		return cost;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "US Mail";
	}
	
	
}
