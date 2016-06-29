package lab3;

public class UPS extends ACarrier {
	
	public Package pack;

	public UPS(Package pack) {
		super();
		this.pack = pack;
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 0.45*pack.getWeight();
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "UPS";
	}

}
