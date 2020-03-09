package com.epam.Designpattern;
 
enum CarType 
{ 
	MICRO, MINI
} 

abstract class Car 
{ 
	Car(CarType model, Location location) 
	{ 
		this.model = model; 
		this.location = location; 
	} 

	abstract void construct(); 

	CarType model = null; 
	Location location = null; 

	@Override
	public String toString() 
	{ 
		return "CarModel - "+model + " located in "+location; 
	} 
} 


class MicroCar extends Car 
{ 
	MicroCar(Location location) 
	{ 
		super(CarType.MICRO, location); 
		construct(); 
	} 
	@Override
	protected void construct() 
	{ 
		System.out.println("Locating Micro Car "); 
	} 
} 

class MiniCar extends Car 
{ 
	MiniCar(Location location) 
	{ 
		super(CarType.MINI,location ); 
		construct(); 
	} 
	
	@Override
	void construct() 
	{ 
		System.out.println("Locating Mini car"); 
	} 
} 

enum Location 
{ 
DEFAULT, INDIA 
} 

class INDIACarFactory 
{ 
	static Car buildCar(CarType model) 
	{ 
		Car car = null; 
		switch (model) { 
			case MICRO: 
				car = new MicroCar(Location.INDIA); 
				break; 
			
			case MINI: 
				car = new MiniCar(Location.INDIA); 
				break; 
				
			default: break; 
			
		} 
		return car; 
	} 
} 

class DefaultCarFactory 
{ 
	public static Car buildCar(CarType model) 
	{ 
		Car car = null; 
		switch (model) 
		{ 
			case MICRO: 
				car = new MicroCar(Location.DEFAULT); 
				break; 
			
			case MINI: 
				car = new MiniCar(Location.DEFAULT); 
				break; 
				
				default: break; 
			
		} 
		return car; 
	} 
} 



class CarFactory 
{ 
	private CarFactory() { } 
	
	public static Car buildCar(CarType type) 
	{ 
		Car car = null; 
		
		Location location = Location.INDIA; 
		
		switch(location) 
		{ 
			
			case INDIA: 
				car = INDIACarFactory.buildCar(type); 
				break; 
					
			default: 
				car = DefaultCarFactory.buildCar(type); 

		} 
		
		return car; 

	} 
} 

class abstractFactoryPattern 
{ 
	public static void main(String[] args) 
	{ 
		
		System.out.println(CarFactory.buildCar(CarType.MINI)); 
		System.out.println(CarFactory.buildCar(CarType.MICRO)); 
	} 
} 
