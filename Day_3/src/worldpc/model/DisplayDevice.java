package worldpc.model;

public class DisplayDevice {
	
	private final int IdDisplayDevice;
	private String brand;
	private double sizeInInches;
	private static int displayDeviceCounter;

	
	//Constructor
	
	private DisplayDevice() {
		IdDisplayDevice = ++displayDeviceCounter;
	}
	
	public DisplayDevice(String brand, double sizeInInches) {
		this();
		this.brand = brand;
		this.sizeInInches = sizeInInches;
	}

	@Override
	public String toString() {
		return "DisplayDevice [IdDisplayDevice=" + IdDisplayDevice + ", brand=" + brand + ", sizeInInches="
				+ sizeInInches + "]";
	}
	
	
}
