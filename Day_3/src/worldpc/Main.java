package worldpc;

import worldpc.model.Computer;
import worldpc.model.DisplayDevice;
import worldpc.model.Keyboard;
import worldpc.model.Mouse;
import worldpc.service.Order;

public class Main {

	public static void main(String[] args) {
	
		//Create objects
		
		Mouse mouse1 = new Mouse("Wireless", "Logitech");
		
		Keyboard keyboard1 = new Keyboard("Mechanical", "Corsair");
		
		DisplayDevice display1 = new DisplayDevice("AOC", 32.0);
		
		System.out.println(mouse1.toString());
		System.out.println(keyboard1.toString());
		System.out.println(display1.toString());
		
		Computer computer1 = new Computer("Gaming PC", 
				display1,
				keyboard1,
				mouse1);
		
		System.out.println(computer1.toString());
		
		// create another computer
			Mouse mouse2 = new Mouse("Wired", "Razer");	
			Keyboard keyboard2 = new Keyboard("Membrane", "Logitech");
			DisplayDevice display2 = new DisplayDevice("Dell", 27.0);
			Computer computer2 = new Computer("Office PC", 
					display2,
					keyboard2,
					mouse2);
			
		//create order
			Order order1 = new Order();
			order1.addComputer(computer1);
			order1.addComputer(computer2);
			
			order1.showOrder();
			

	}

}
