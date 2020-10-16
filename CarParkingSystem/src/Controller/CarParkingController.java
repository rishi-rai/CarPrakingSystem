package Controller;
import java.util.*;

import Service.CarParkingService;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.NumberFormatException;



public class CarParkingController { // controller class the place where data from file is getting and according to command operation happens
	
	
	
	public static void main(String args[]) {
		
		CarParkingService carParkingService = new CarParkingService();
		
		Scanner scan = new Scanner(System.in);
		 String[] command;
		
		System.out.println("write the address of file system");
		String filename = scan.next();// reading the address of file  and storing it inside the variable filename
		
		File file = new File(filename);// getting the file content from the filename
		
		
		if(!file.exists()) {// if file does not exist then print message
			System.out.println("input file does not found!!");
		}
		else {// if file exist 
			RandomAccessFile raf = null;
			try {
				 raf = new RandomAccessFile(file,"rw");// get the permission for reading the file
			
				 boolean found = false;
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			}
			
			try {
				String commandString = null;
				while(raf.getFilePointer()< raf.length()) { // reading the file
					
					 commandString = raf.readLine();
					 command = commandString.split(" ");
					 int len  = command.length;
					 
					 
					 // commands for different operations
					 String createParkingLot = "Create_parking_lot";
					 String park="Park";
					 String leave="Leave";
					 String slotForAge="Slot_numbers_for_driver_of_age";
					 String slotForCarRegistration="Slot_number_for_car_with_number";
					 String carRegistrationNoForAge ="Vehicle_registration_number_for_driver_of_age";
					 
					 if(command[0].equals(createParkingLot)) {// checking the command for creating parking lot
						 int slot = Integer.parseInt(command[1]);
						
						 carParkingService.createParking(slot);
						
						 
						 
						 
						 
						 
						 
					 }
					 if(command[0].equals(park)) {// checking the command for parking the car
						 String carRegistrationNo = command[1];
						 int age = Integer.parseInt(command[3]);
								 
						 carParkingService.parkTheCar(carRegistrationNo, age);
					 
					 }
					 if(command[0].equals(leave)) {// checking the command for leaving the slot
						 int slot = Integer.parseInt(command[1]);
						 
						 carParkingService.vacantSlot(slot);
					 }
					 
					 
					 if(command[0].equals(slotForAge)) { // checking the command for getting the slot according to age
						 int age = Integer.parseInt(command[1]); 
						 carParkingService.getSlotForAge(age);
						 
					 }
					 if(command[0].equals(slotForCarRegistration)) { // checking the command for getting the slot according to car Registration number
						 String carRegistrationNo = command[1]; 
						 carParkingService.getSlotForCarRegistrationNo(carRegistrationNo);
						 
					 }
					 if(command[0].equals(carRegistrationNoForAge)) {// checking the command for car registration number according to age
						 int age = Integer.parseInt(command[1]); 
						 carParkingService.getCarRegistrationForAge(age);
					 
					 }
				
				}} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		
		
		 
		
		
		
	}
}
