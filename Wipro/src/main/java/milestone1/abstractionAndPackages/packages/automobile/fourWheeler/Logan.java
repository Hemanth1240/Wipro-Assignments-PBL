package milestone1.abstractionAndPackages.packages.automobile.fourWheeler;
import milestone1.abstractionAndPackages.packages.automobile.Vehicle;
public class Logan extends Vehicle{
	private String modelName;
	private String registrationNumber;
	private String ownerName;
	private int speed;
	public Logan(String modelName, String registrationNumber, String ownerName, int speed) {
		super();
		this.modelName = modelName;
		this.registrationNumber = registrationNumber;
		this.ownerName = ownerName;
		this.speed = speed;
	}
	@Override
	public String getModelName() {
		// TODO Auto-generated method stub
		return modelName;
	}
	@Override
	public String getRegistrationNumber() {
		// TODO Auto-generated method stub
		return registrationNumber;
	}
	@Override
	public String getOwnerName() {
		// TODO Auto-generated method stub
		return ownerName;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void tempControl() {
		System.out.println("Air Conditioner Device is available in the car");
	}
	
	
}
