package com.samco;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.samco.model.CompareEmployee;
import com.samco.model.Employee;
import com.samco.model.EmployeeData;
import com.samco.model.EmployeeDetails;
import com.samco.service.CompareService;
import com.samco.service.EmployeeDataService;
import com.samco.service.EmployeeDetailsService;
import com.samco.service.EmployeeService;

@SpringBootApplication
public class MulitpleCollectionInMongoApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(MulitpleCollectionInMongoApplication.class, args);
		System.out.println("Server Created Successfully");
	}

	@Autowired
	EmployeeService employeeService;
	
	@Autowired 
	EmployeeDetailsService detailsService;
	
	@Autowired
	CompareService compareService;
	
	@Autowired
	EmployeeDataService dataService;
	
	@Override
	public void run(String... args) throws Exception {
		
		List<Employee> employee = employeeService.getAllEmployee();
		Map<Integer, Employee> emp = new HashMap<Integer, Employee>();
		for (Employee employees : employee) {
			System.out.println("Fetch data from Collection1 to Collection3:"+""+emp);
			emp.put(employees.getId(), employees);
			CompareEmployee ce = new CompareEmployee();
			ce.setId(employees.getId());
			ce.setName(employees.getName());
			ce.setAge(employees.getAge());
			compareService.add(ce);
			System.out.println("Data fetched from Collection1 to collection3 Created successfully");
		}
		
		List<EmployeeDetails> employeeDetail = detailsService.getAllEmployee();
		Map<Integer, EmployeeDetails> empdet = new HashMap<>();
		for(EmployeeDetails employeedetails: employeeDetail) {
			System.out.println("Fetch Data from Collection2 to Collection3"+""+empdet);
			empdet.put(employeedetails.getId(), employeedetails);
			CompareEmployee ce = new CompareEmployee();
			ce.setId(employeedetails.getId());
			ce.setName(employeedetails.getName());
			ce.setAge(employeedetails.getAge());
			compareService.add(ce);
			System.out.println("Data fetched from Collection2 to collection3 Created successfully");
		}
		
		List<EmployeeData> employeeData = dataService.get();
		Map<Integer, EmployeeData> empdata = new HashMap<>();
		for(EmployeeData employeeDatas: employeeData) {
			System.out.println("Fetch Data from Collection2 to Collection3"+""+empdet);
			empdata.put(employeeDatas.getId(), employeeDatas);
			CompareEmployee ce = new CompareEmployee();
			ce.setId(employeeDatas.getId());
			ce.setName(employeeDatas.getName());
			ce.setAge(employeeDatas.getAge());
			ce.setDomain(employeeDatas.getDomain());
			ce.setAddress(employeeDatas.getAddress());
			ce.setCity(employeeDatas.getCity());
			ce.setPincode(employeeDatas.getPincode());
			compareService.add(ce);
			System.out.println("Data fetched from Collection3 to collection4 Created successfully");
		}
	}
}
