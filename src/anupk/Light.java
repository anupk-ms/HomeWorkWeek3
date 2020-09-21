package anupk;

public class Light {
	final String ON = "On" ;
	final String OFF = "Off" ;
	private boolean on;
	public void switchOn(){
	   on = true;
	}
	public void switchOff(){
	    on = false;
	}
	public void Display(){
		System.out.printf("Switch is %s\n\n", on? ON : OFF);
	}
}
