package vehiclecalculator;

public class TwoWheeler extends Vehicle {
	public TwoWheeler() {
		super("TwoWheeler", 20, 10);
	}

	@Override
	public int calculateToll(int numberOfPersons) {
		if (numberOfPersons <= 0) {
			System.out.println("Number of person cannot be zero");
		}
		int totalToll = basicToll;
		if (numberOfPersons > 2 && numberOfPersons > 0) {
			int extraCharge = (numberOfPersons - 2) * extraCharges;
			totalToll = totalToll + extraCharges;
		}
		return totalToll;
	}
}
