package tcs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	List<Employee> list = Arrays.asList(
			new Employee("ajit", "backend developer", 750000),
			new Employee("vikash", "backend developer", 65000),
			new Employee("akash", "backend developer", 88000),
			new Employee("amit", "security analyst", 44000),
			new Employee("praveen", "security analyst", 34000),
			new Employee("sonu", "security analyst", 44000)
			);
	// here we are getting all the group of employee by department
	Map<String, List<Employee>> departmentByEmployee = list.stream().collect(Collectors.groupingBy(emp->emp.getDepartment()));
	// here we getting department and employee list
	for(Map.Entry<String, List<Employee>> entry: departmentByEmployee.entrySet()) {
		String department = entry.getKey();
		List<Employee> employeelist = entry.getValue();
		System.out.println("Department :"+ department);
		System.out.println("--------------------------------");

		for(Employee employee : employeelist) {
			System.out.println(employee.getName()+" "+employee.getDepartment()+" "+ employee.getSalary());
			System.out.println(" ");
			
		}
	}
	
	

	}

}
