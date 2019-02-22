 
package cse360assign2;

public class Calculator {

	private int total;
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	public int getTotal () {
		return 0;
	}
	
	public void add (int value) {
		total += value;
	}
	
	public void subtract (int value) {
		total -= value;
	}
	
	public void multiply (int value) {
		total *= value;
	}
	
	public void divide (int value) {
		try {
			total /= value;			
		}catch(Exception e) {
			total = 0;
		}
	}
	
	public String getHistory () {
		return "";
	}
}
