
public class Employee {
	
	private String name;
	private int hours;
	private double rate;
	private Address[] address = new Address[6];
	
	public Employee(String name, int hours, double rate){
		this.name = name;
		this.hours = hours;
		this.rate = rate;
	}
	
	public void addAddress(String street, int number, String postal){
		int i =6;
		while(i<6){
			if(address[i]==null){
				address[i] = new Address(street,number,postal);
				break;
			}
		}
	}
}
