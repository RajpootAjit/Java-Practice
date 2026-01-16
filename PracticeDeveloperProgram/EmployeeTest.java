package PracticeDeveloperProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeTest {

	public static void main(String[] args) {
		
//		ArrayList<Employee> list = new ArrayList<Employee>();
		
//		list.add(new Employee("ajit", 28, "bangalore","test engineer"));
		
		List<Employee> employees = Arrays.asList(new Employee("ajit", 29, "bangalore","test engineer"), 
				                                 new Employee("amit", 33, "delhi", "newtwork engineer"),
				                                 new Employee("vikash", 29, "delhi", "test engineer"),
				                                 new Employee("vishnu", 33, "bangalore", "newtwork engineer"),
				                                 new Employee("amit", 33, "delhi", "newtwork engineer"));
//		for(Employee emp: employees) {
//			System.out.println(emp);
//			
//		}
		
//		employees.stream().map(emp-> emp.getName()+ " "+ emp.getAge()+" "+ emp.getCity()+" "+ emp.getDepartment())
//		.forEach(System.out::println);
//		List<String> listOfEmployees = employees.stream().map(emp-> emp.getName()+ " "+ emp.getAge()+" "+
//                                       emp.getCity()+" "+ emp.getDepartment()).collect(Collectors.toList());
		
		// group the employee by department
		List<Employee> testEngineers = employees.stream().filter(emp -> "test engineer".equals(emp.getDepartment()))
				                        .collect(Collectors.toList());
		
		testEngineers.forEach(emp -> System.out.println(emp.getName()+" "+emp.getAge()+" "+emp.getCity()+" "+emp.getDepartment()));
		System.out.println(testEngineers);
		System.out.println(" ");
		System.out.println("-----------------------------");
		
//		listOfEmployees.forEach(System.out::println);
		// group the employee by department
//		Map<String, List<Employee>> employeeByDepartment = employees.stream()
//				                                           .collect(Collectors.groupingBy(Employee::getDepartment));
		Map<String, List<Employee>> employeeByDepartment = employees.stream()
                .collect(Collectors.groupingBy(e->e.getDepartment()));
		System.out.println("printing employeeByDepartment");
		
		System.out.println(employeeByDepartment);
		System.out.println("----------------------------------------------------------------");
		System.out.println("now taking department vise employee from the group");
		employeeByDepartment.forEach((department, emplist)->{
		System.out.println("Department: "+ department);
		emplist.forEach(emp -> System.out.println(emp.getName()+","+emp.getAge()+","+emp.getCity()+","+emp.getDepartment())
				);
		System.out.println();
		
		
		});
		
		System.out.println("-------------------------------");
		
//		employees.stream()
//        .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()))
//        .forEach((key,value)->System.out.println(key +" "+value));
		employees.stream()
	    .collect(Collectors.groupingBy(e -> e.getDepartment(), Collectors.counting()))
	    .forEach((key, value) -> System.out.println(key + " " + value));

		
		//no of employees
		System.out.println("number of employees");
		System.out.println(employees.stream().count());
		

	}

}
