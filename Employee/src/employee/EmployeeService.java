package employee;

public class EmployeeService {
	String message;
	
	public String validateEmployee(Employee emp) {
		try {
			if(emp.getEmpName()=="" || emp.getEmpName()==null || emp.getEmpName().matches("[^A-Z]") ) {
				throw new UserDefinedException("Emplodee Name Invalid");
			}
			else if(emp.getEmpName().length()<4 ) {
				throw new UserDefinedException("Employee Name Invalid");
			}
			else if(emp.getEmplId()==0 ||emp.getEmplId()<6) {
					throw new UserDefinedException("Emp Id Invalid");
			}
			else if(emp.getAge()<20) {
				throw new UserDefinedException("Invalid Employee Age");
			}
			else {
				emp.setMarritalStatus(true);
				message="Married";
			}
		}catch(UserDefinedException e) {
			message=e.getMessage();
			
		}
		return message;
		
	}
}
