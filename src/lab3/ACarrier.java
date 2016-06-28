package lab3;

public abstract class ACarrier implements ICarrier {
	public abstract double cost(Package packages);
	public abstract String getType();
}
