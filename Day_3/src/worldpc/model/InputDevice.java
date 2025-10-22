package worldpc.model;

public class InputDevice {
	
	private String typeOfInput;
	private String brand;
	
	//Constructor
	
	public InputDevice(String typeOfInput, String brand) {
		this.typeOfInput = typeOfInput;
		this.brand = brand;
	}

	public String getTypeOfInput() {
		return typeOfInput;
	}

	public void setTypeOfInput(String typeOfInput) {
		this.typeOfInput = typeOfInput;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "InputDevice [typeOfInput=" + typeOfInput + ", brand=" + brand + "]";
	}

	
}
