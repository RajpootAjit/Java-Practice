package PracticeDeveloperProgram;

public class Employee {
	
	private String name;
	private int age;
	private String city;
	private String department;
	
	Employee(){
		
	}

	public Employee(String name, int age, String city, String department) {
		super();
		this.name = name;
		this.age = age;
		this.city = city;
		this.department = department;
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "name=" + name + ", age=" + age + ", city=" + city + ", department=" + department ;
	}
	
	
	

}
