package worldpc.model;

public class Keyboard extends InputDevice{

	private final int idKeyboard;
	private static int keyboardCounter;
	
	
	public Keyboard(String typeOfInput, String brand) {
		super(typeOfInput, brand);
		idKeyboard = ++keyboardCounter;
		
	}

	public static int getKeyboardCounter() {
		return keyboardCounter;
	}

	public static void setKeyboardCounter(int keyboardCounter) {
		Keyboard.keyboardCounter = keyboardCounter;
	}

	public int getIdKeyboard() {
		return idKeyboard;
	}
	@Override
	public String toString() {
		return "Keyboard [idKeyboard=" + idKeyboard + "] " + super.toString();
	}

}
