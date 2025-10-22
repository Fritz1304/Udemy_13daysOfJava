package worldpc.model;

public class Mouse extends InputDevice{

	private final int idMouse;
	private static int mouseCounter;
	
	
	public Mouse(String typeOfInput, String brand) {
		super(typeOfInput, brand);
		idMouse = ++mouseCounter;
		
	}

	public static int getMouseCounter() {
		return mouseCounter;
	}

	public static void setMouseCounter(int mouseCounter) {
		Mouse.mouseCounter = mouseCounter;
	}

	public int getIdMouse() {
		return idMouse;
	}
	@Override
	public String toString() {
		return "Mouse [idMouse=" + idMouse + "] " + super.toString();
	}
}
