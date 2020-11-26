package employee;

import java.util.ArrayList;
import java.util.List;

public class Source {
	public static void main(String[] args) {
		ArrayList<Employee> emply=new ArrayList<Employee>();
		Employee emp=new Employee(101425,"Hdfgdf","dffeg",250000,false,20,"fd",'F');
		Employee emp1=new Employee(101425,"Hdfgdf","dffeg",42500,false,20,"fd",'F');
		Employee emp2=new Employee(101425,"Hdfgdf","dffeg",52500,false,20,"fd",'F');
		Employee emp3=new Employee(101425,"Hdfgdf","dffeg",62500,false,20,"fd",'F');
		Employee emp4=new Employee(101425,"Hdfgdf","dffeg",72500,false,20,"fd",'F');
		emply.add(emp);
		emply.add(emp1);
		emply.add(emp2);
		emply.add(emp3);
		emply.add(emp4);
		EmployeeService empS=new EmployeeService();
		String message=empS.validateEmployee(emp);
		System.out.println(message);
		int salary=sumempSalary(emply);
		System.out.println("Total salary"+salary);
		String grade=getEmpGrade(emp);
		System.out.println("Grade"+grade);
		int age=sumOfEmpAge(emply);	
		System.out.println("Age"+age);
		
	}

	private static int sumOfEmpAge(ArrayList<Employee> list) {
		int age=0;
			for(Employee emp:list) {
				age+=emp.getAge();
			}
			return age;
	}

	private static String getEmpGrade(Employee emp) {
				if(emp.getEmpSal()>=50000) {
			return "A";
		}
		else if(emp.getEmpSal()<50000 && emp.getEmpSal()>20000) {
			return "B";
		}
		else {
			return "C";
		}
		
	}

	private static int sumempSalary(ArrayList<Employee> empList) {
		// TODO Auto-generated method stub
		ArrayList<Employee> empy=new ArrayList<Employee>(empList);
		int salary=0;
		for(Employee emp:empy) {
		if(emp.getEmpSal()>40000) {
			salary+=emp.getEmpSal();
		}
		else {
			salary=0;
		}
		}
//		
		return salary;
	}

}
