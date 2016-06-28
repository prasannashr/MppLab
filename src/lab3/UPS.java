package lab3;

public class UPS extends ACarrier {

	@Override
	public double cost(Package pack) {
		// TODO Auto-generated method stub
		return 0.45*pack.getWeight();
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "UPS";
	}

}
