package lv.diana.user;

public class Person {
	private String name;
	private String address;
	
	public Person(String name, String address){
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return this.name+ "("+this.address+")";
	} 
	
	
	
	

}
