package testApp;

public class Car {
	private Integer speed;
	private String make;
	private String model;
	
	public Car(){
		this.speed = 180;
		this.make = "Toyota";
		this.model = "LandCruise";
	}
	public Car(Integer speed, String make, String model) {
		super();
		this.speed = speed;
		this.make = make;
		this.model = model;
	}
	public Integer getSpeed() {
		return speed;
	}
	public void setSpeed(Integer speed) {
		this.speed = speed;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	
	
}
