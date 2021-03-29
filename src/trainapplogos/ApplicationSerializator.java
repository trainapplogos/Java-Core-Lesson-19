package trainapplogos;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ApplicationSerializator {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		System.out.println("********************[ Task 1 ]********************");
		System.out.println("> Serialize/Deserialize object:");
		Employee emp = new Employee("John Dalton", 235, 2000);
		File file = new File("Employee_class.txt");
		System.out.println("> Serialize object Employee...");
		Methods.serialize(file, emp);
		
		Employee empCached = (Employee) Methods.deserealize(file);
		System.out.println("> Deserialized object Employee:");
		System.out.println(empCached);
		
		
		Employee2ndVer emp2 = new Employee2ndVer("Ruddy Goodman", 43, 5000);
		File file2nd = new File("Employee2ndVer_with_mod_Transient.txt");
		System.out.println("> Serialize modified object Employee with transient field salary...");
		Methods.serialize(file2nd, emp2);
		Employee2ndVer emp2Cached = (Employee2ndVer) Methods.deserealize(file2nd);
		System.out.println("> Deserialized modified object Employee:");
		System.out.println(emp2Cached);
		
		System.out.println("\n********************[ Task 2 ]********************");
		List<Employee> list = new ArrayList<>();
		list.add(emp); //John Dalton
		list.add(new Employee("Freddy Truemen", 111, 4371));
		list.add(new Employee("Fransis Senatra", 531, 54321));
		list.add(new Employee("Albert Motorolla", 321, 4200));
		list.add(new Employee("Sigmunt Freud", 200, 5000));
		
		File fileList = new File("EmployeeCollection.txt");
		
		ListOfEmployee listEmp = new ListOfEmployee(list);
		System.out.println("> Serialize List of object Employee...");
		Methods.serialize(fileList, listEmp);
		
		
		ListOfEmployee listEmpCached = (ListOfEmployee) Methods.deserealize(fileList);;
		List<Employee> listCached = listEmpCached.getList();
	
		System.out.println("> Deserialized List of Employee:");
		System.out.println(listCached);
	}
}
