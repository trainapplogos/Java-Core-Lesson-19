package trainapplogos;

import java.io.Serializable;

public class Employee2ndVer implements Serializable {
	private String name;
	private int id;
	private transient int salary; //place of changes in class Employee
	
	public String getName() {
		return name;
	}
	
	public Employee2ndVer(String name, int id, int salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}

}
