package Service;
import java.util.HashMap;

import Model.CarParkingModel;

public class CarParkingService implements CarParkingInterface {

	private HashMap<Integer,CarParkingModel> parking ;
	private int numberOfSlot;
	private int vaccantSlot;
	private boolean[] parkingSlot;
	
	
	//******* code for creating parking system *******
	@Override
	public void createParking(int n) {
		this.numberOfSlot = n;
		this.vaccantSlot = n;
		this.parking = new HashMap<>();
		this.parkingSlot = new boolean[n];
		
		System.out.println("Created parking of "+numberOfSlot+" slots");
		}
	
	//******* code for creating parking system *******
	
	
	
	// ********* code for parking the car ***********
	@Override
	public void parkTheCar(String registration_no, int age) {
			
		int slot = getSlotNearToGate();
		//System.out.println("slot get from getSlotNearToGate() is : "+slot);
		
		if(slot == Integer.MAX_VALUE) {
			System.out.println("Sorry!!... No slot is available!!");
			return;
		}
		
		parking.put(slot, new CarParkingModel(slot,registration_no,age));
		parkingSlot[slot] = true;
		vaccantSlot--;
		slot = slot+1;
		System.out.println("Car with vehicle registration number \""+registration_no+"\" has been parked at slot number " + slot);
		
	}
	
	// ********* code for parking the car ***********

	
	
	// ********* code for leaving the parking slot *********
	@Override
	public void vacantSlot(int slot) {
		slot = slot-1;
		
		vaccantSlot++;
		parkingSlot[slot] = false;
		slot = slot+1;
		System.out.println("Slot number "+slot+" vacated, the car with vehicle registration number \""+parking.get(slot).getCar_registration() +"\" left the space, the driver of the car was of age "+parking.get(slot).getAge());
		slot = slot-1;
		parking.remove(slot);
	}

	// ********* code for leaving the parking slot *********
	
	
	
	//*********** code for getting the car registration number according to age ***********
	@Override
	public void getCarRegistrationForAge(int age) {
			int size = 0;
			
		parking.forEach((key,obj)->{
			
			if(obj.getAge()==age) {
				
				System.out.println("Registration no. for age = "+obj.getCar_registration());
				
			}
			
		});
		
	}
	
	//*********** code for getting the car registration number according to age ***********
	
	
	
	// *********** code for getting the slot which is free near the gate *****************

	@Override
	public int getSlotNearToGate() {
		int slot =0;
		int i=0;
		for( i=0;i<numberOfSlot;i++) {
			if(parkingSlot[i]==false) {
				slot =i;
				break;
			}
		}
		
		
		if(i>=numberOfSlot) {
			return Integer.MAX_VALUE;
		}
		return slot;
	}

	// *********** code for getting the slot which is free near the gate *****************
	
	
	
	// ************* code for getting the slot number according to the car Registration number ***********
	@Override
	public void getSlotForCarRegistrationNo(String registration_no) {
		parking.forEach((key,obj)->{
			if(obj.getCar_registration().equals(registration_no)) {
				int slot1 = obj.getParkingSlot()+1;
				System.out.println("parking slot for registration car = "+slot1);
			}
		});
		
	}

	// ************* code for getting the slot number according to the car Registration number ***********
	
	
	// ************* getting the slot according to age of the driver ****************
	@Override
	public void getSlotForAge(int age) {
		
		parking.forEach((key,obj)->{
			
			if(obj.getAge() == age) {
				int slot1 = obj.getParkingSlot()+1;
				System.out.print(slot1+" ");
			}
			
		});
		System.out.println();
	}

	// ************* getting the slot according to age of the driver ****************
	

	

}
