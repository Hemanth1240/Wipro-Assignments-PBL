package milestone1.abstractionAndPackages.packages.automobile.fourWheeler;
import milestone1.abstractionAndPackages.packages.automobile.Vehicle;
public class Ford extends Vehicle{
	private String modelName;
	private String registrationNumber;
	private String ownerName;
	private int speed;
	public Ford(String modelName, String registrationNumber, String ownerName, int speed) {
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
	public void gps() {
		// TODO Auto-generated method stub
		System.out.println("GPA Available");
	}
	
	
}
