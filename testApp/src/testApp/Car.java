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
	@Override

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((make == null) ? 0 : make.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + ((speed == null) ? 0 : speed.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (make == null) {
			if (other.make != null)
				return false;
		} else if (!make.equals(other.make))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (speed == null) {
			if (other.speed != null)
				return false;
		} else if (!speed.equals(other.speed))
			return false;
		return true;
	}
	
	
	@Override


	public String toString() {
		return "Car [speed=" + speed + ", make=" + make + ", model=" + model
				+ "]";
	}bj == null)
	return false;
if (getClass() != obj.getClass())
	return false;
Car other = (Car) obj;
if (make == null) {
	if (other.make != null)
		return false;
} else if (!make.equals(other.make))
	return false;
if (model == null) {
	if (other.model != null)
		return false;
} else if (!model.equals(other.model))
	return false;
if (speed == null) {
	if (other.speed != null)
		return false;
} else if (!speed.equals(other.speed))
	return false;
return true;
}


@Override


public String toString() {
return "Car [speed=" + speed + ", make=" + make + ", model=" + model
		+ "]";
}bj == null)
return false;
if (getClass() != obj.getClass())
return false;
Car other = (Car) obj;
if (make == null) {
if (other.make != null)
	return false;
} else if (!make.equals(other.make))
return false;
if (model == null) {
if (other.model != null)
	return false;
} else if (!model.equals(other.model))
return false;
if (speed == null) {
if (other.speed != null)
	return false;
} else if (!speed.equals(other.speed))
return false;
return true;
}


@Override


public String toString() {
return "Car [speed=" + speed + ", make=" + make + ", model=" + model
	+ "]";
}bj == null)
return false;
if (getClass() != obj.getClass())
return false;
Car other = (Car) obj;
if (make == null) {
if (other.make != null)
	return false;
} else if (!make.equals(other.make))
return false;
if (model == null) {
if (other.model != null)
	return false;
} else if (!model.equals(other.model))
return false;
if (speed == null) {
if (other.speed != null)
	return false;
} else if (!speed.equals(other.speed))
return false;
return true;
}


@Override


public String toString() {
return "Car [speed=" + speed + ", make=" + make + ", model=" + model
	+ "]";
}bj == null)
return false;
if (getClass() != obj.getClass())
return false;
Car other = (Car) obj;
if (make == null) {
if (other.make != null)
	return false;
} else if (!make.equals(other.make))
return false;
if (model == null) {
if (other.model != null)
	return false;
} else if (!model.equals(other.model))
return false;
if (speed == null) {
if (other.speed != null)
	return false;
} else if (!speed.equals(other.speed))
return false;
return true;
}


@Override


public String toString() {
return "Car [speed=" + speed + ", make=" + make + ", model=" + model
	+ "]";
}bj == null)
return false;
if (getClass() != obj.getClass())
return false;
Car other = (Car) obj;
if (make == null) {
if (other.make != null)
	return false;
} else if (!make.equals(other.make))
return false;
if (model == null) {
if (other.model != null)
	return false;
} else if (!model.equals(other.model))
return false;
if (speed == null) {
if (other.speed != null)
	return false;
} else if (!speed.equals(other.speed))
return false;
return true;
}


@Override


public String toString() {
return "Car [speed=" + speed + ", make=" + make + ", model=" + model
	+ "]";
}bj == null)
return false;
if (getClass() != obj.getClass())
return false;
Car other = (Car) obj;
if (make == null) {
if (other.make != null)
	return false;
} else if (!make.equals(other.make))
return false;
if (model == null) {
if (other.model != null)
	return false;
} else if (!model.equals(other.model))
return false;
if (speed == null) {
if (other.speed != null)
	return false;
} else if (!speed.equals(other.speed))
return false;
return true;
}


@Override


public String toString() {
return "Car [speed=" + speed + ", make=" + make + ", model=" + model
	+ "]";
}bj == null)
return false;
if (getClass() != obj.getClass())
return false;
Car other = (Car) obj;
if (make == null) {
if (other.make != null)
	return false;
} else if (!make.equals(other.make))
return false;
if (model == null) {
if (other.model != null)
	return false;
} else if (!model.equals(other.model))
return false;
if (speed == null) {
if (other.speed != null)
	return false;
} else if (!speed.equals(other.speed))
return false;
return true;
}


@Override


public String toString() {
return "Car [speed=" + speed + ", make=" + make + ", model=" + model
	+ "]";
}bj == null)
return false;
if (getClass() != obj.getClass())
return false;
Car other = (Car) obj;
if (make == null) {
if (other.make != null)
	return false;
} else if (!make.equals(other.make))
return false;
if (model == null) {
if (other.model != null)
	return false;
} else if (!model.equals(other.model))
return false;
if (speed == null) {
if (other.speed != null)
	return false;
} else if (!speed.equals(other.speed))
return false;
return true;
}


@Override


public String toString() {
return "Car [speed=" + speed + ", make=" + make + ", model=" + model
	+ "]";
}bj == null)
return false;
if (getClass() != obj.getClass())
return false;
Car other = (Car) obj;
if (make == null) {
if (other.make != null)
	return false;
} else if (!make.equals(other.make))
return false;
if (model == null) {
if (other.model != null)
	return false;
} else if (!model.equals(other.model))
return false;
if (speed == null) {
if (other.speed != null)
	return false;
} else if (!speed.equals(other.speed))
return false;
return true;
}


@Override


public String toString() {
return "Car [speed=" + speed + ", make=" + make + ", model=" + model
	+ "]";
}
	
	
	
}
