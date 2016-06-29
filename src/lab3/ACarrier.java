package lab3;

public abstract class ACarrier implements ICarrier, Comparable<ACarrier> {
	
	public abstract double cost();

	public abstract String getType();

	@Override
	public int compareTo(ACarrier carr) {
		return (this.cost() < carr.cost()) ? -1
				: (this.cost() > carr.cost()) ? 1 : 0;
	}

}
