Car Parking system (Activity 1 - SquadStack)

configuration:

*use STS ide
*have java jdk version 12 or above
*I have used windows 10
*ide used spring tool suit


how to implement :
1 download the zip file
2 extract the zip file
3 open it inside the ide 
4 build the project 
5 go to the controller package 
open CarParkingController.java
run the class 

IF NOT ABLE TO BUILD THE PROJECT SIMPLE SOLUTIO ARE:

1: import file in your ides
2: create another project in ide
3: copy the src folder from imported file into newly created project 
4:go to the controller package 
5: go to the class and run the class



POINT TO NOTE------>
please give the txt file adress inside the input of the project


design implementation:

* created three packages 
1: Controller
2: Model
3: Service

1 Controller : In this package you will find class CarParkingController.java which is the main class of the project for running the project you have to run the 
		CarParkingController.java class
		in this file inputing the address of the file is takken and according to the command services are executed 

2: Model : In this package the structure of the parking system is defined like slot_number, car_registration_number, age_of_driver
		this is defined in the class name CarParkingModel.java

3: Service : In this package the business logic is implemented 
	        there are two files inside this package one is interface (CarParkingIterface.java)where the structure of the service is written 
		and another one is class(CarParkingService) which implement the interface and overwride the methods according to the business logic

	
