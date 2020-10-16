package Service;


// interface for the methods which is going to be implemented
public interface CarParkingInterface {

	
	public void createParking(int n);
	public void parkTheCar(String registration_no, int age);
	public void vacantSlot(int slot);
	public int getSlotNearToGate();
	public void getCarRegistrationForAge(int age);
	public void getSlotForCarRegistrationNo(String registration_no);
	public void getSlotForAge(int age);
	
	
	
}
