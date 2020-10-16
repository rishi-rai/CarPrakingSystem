package Model;
// model class of the parking system
public class CarParkingModel {
	
	
	private int parkingSlot;
	private String car_registration;
	private int age;
	
	public CarParkingModel(int parkingSlot,String car_registration,int age) {
		
		this.parkingSlot = parkingSlot;
		this.car_registration = car_registration;
		this.age = age;
		
	}

	public int getParkingSlot() {
		return parkingSlot;
	}

	public void setParkingSlot(int parkingSlot) {
		this.parkingSlot = parkingSlot;
	}

	public String getCar_registration() {
		return car_registration;
	}

	public void setCar_registration(String car_registration) {
		this.car_registration = car_registration;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	

}
