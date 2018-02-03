package rt.aplikacja.model;

public class CustomerRequest {
	private int id;
	private String name;
	private int age;
	
	public CustomerRequest(){
	}
	
	public CustomerRequest(int id, String name, int age){
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public int getId() {
		return id;
	}
 
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
 
	public void setName(String name) {
		this.name = name;
	}
 
	public int getAge() {
		return age;
	}
 
	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString(){
		String info = String.format("Customer with id = %d, name = %s, age = %d", id, name, age);
		return info;
	}
}