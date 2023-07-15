package vehiclecalculator;

public class HeavyVehicle extends Vehicle {
	public HeavyVehicle() {
		super("Heavy Vehicle", 60, 100);
	}

	@Override
	public int calculateToll(int numberOfPersons) {
		if (numberOfPersons <= 0) {
			System.out.println("Number of person cannot be zero");
		}
		int totalToll = basicToll;
		if (numberOfPersons > 6 && numberOfPersons > 0) {
			int extraCharge = (numberOfPersons - 6) * extraCharges;
			totalToll = totalToll + extraCharge;
		}
		return totalToll;
	}

}
