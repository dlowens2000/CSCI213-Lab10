public class Car extends Vehicle {
	private int numDoors;
	private int numPassengers;
	
	public Car(String make, String model, String plate, int numDoors, int numPassengers){
		super(make,model, plate);
		this.numDoors = numDoors;
		this.numPassengers = numPassengers;
		}	
	public int getNumberDoors(){
		return numDoors;
	}
	public int getNumberPass(){
		return numPassengers;
	}
	public String toString() {
		
		return numDoors + "-door" + " " + getMake() + " " + getModel() + " " + "with license " 
				+ " " + getPlate();
	}
	public boolean equals(Object other) {
		if (!(other instanceof Car)) {
			return false;
		}
		
		Car otherCar = (Car) other;
		
		if(!(super.equals(otherCar)))
			return false;
		
		if(this.getNumberDoors() != otherCar.getNumberDoors()) {
			return false;
		}
		if(this.getNumberPass() != otherCar.getNumberPass()) {
			return false;
		}
		return true;
	}
	public Car copy(){
		Car copy = new Car(getMake(), getModel(), getPlate(), numDoors, numPassengers);
		return copy;
	}
}
		
			
	
	