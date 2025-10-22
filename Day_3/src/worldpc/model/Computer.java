package worldpc.model;

public class Computer {
	
	private int idComputer;
	private String name;
	private DisplayDevice displayDevice;
	private Keyboard keyboard;
	private Mouse mouse;
	private static int computerCount;
	
	private Computer() {
		idComputer = ++computerCount;
	}
	
	public Computer(String name, DisplayDevice displayDevice, Keyboard keyboard, Mouse mouse) {
		this();
		this.name = name;
		this.displayDevice = displayDevice;
		this.keyboard = keyboard;
		this.mouse = mouse;
	}

	@Override
	public String toString() {
		return "Computer [\nidComputer=" + idComputer + ", name=" + name + ", \ndisplayDevice=" + displayDevice
				+ ", \nkeyboard=" + keyboard + ", \nmouse=" + mouse + "\n]";
	}

	
	
}
