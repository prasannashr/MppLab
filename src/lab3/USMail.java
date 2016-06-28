package lab3;

public class USMail extends ACarrier {
	@Override
	public double cost(Package pack) {
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
