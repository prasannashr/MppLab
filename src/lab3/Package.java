package lab3;

public class Package {

	private double weight;
	private String description;
	private Zone zone;

	public Package(double weight, String description, Zone zone) {
		super();
		this.weight = weight;
		this.description = description;
		this.zone = zone;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Zone getZone() {
		return zone;
	}

	public void setZone(Zone zone) {
		this.zone = zone;
	}

	@Override
	public String toString() {
		return "Package [weight=" + weight + ", description=" + description + ", zone=" + zone + "]";
	}
}
