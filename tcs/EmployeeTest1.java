package tcs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> list = Arrays.asList(
				new Employee("ajit", "backend developer", 750000),
				new Employee("vikash", "backend developer", 65000),
				new Employee("akash", "backend developer", 88000),
				new Employee("amit", "security analyst", 44000),
				new Employee("praveen", "security analyst", 34000),
				new Employee("sonu", "security analyst", 44500)
				
				);
		
		Map<String, Optional<Employee>> maxSalaryByDept = list.stream()
			    .collect(Collectors.groupingBy(
			        emp -> emp.getDepartment(),
			        Collectors.maxBy((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()))
			    ));
		
		for (Map.Entry<String, Optional<Employee>> entry : maxSalaryByDept.entrySet()) {
		    System.out.println("Department: " + entry.getKey());
		    if (entry.getValue().isPresent()) {
		        Employee emp = entry.getValue().get();
		        System.out.println(emp.getName() + " " + emp.getDepartment() + " " + emp.getSalary());
		    }
		    System.out.println();
		}



	}
	

}
