package employee;

public class Employee {
	int emplId;
	String empCode;
	String empName;
	float empSal;
	boolean marritalStatus;
	int age;
	String empType;
	public int getEmplId() {
		return emplId;
	}
	public void setEmplId(int emplId) {
		this.emplId = emplId;
	}
	public String getEmpCode() {
		return empCode;
	}
	public void setEmpCode(String empCode) {
		this.empCode = empCode;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public float getEmpSal() {
		return empSal;
	}
	public void setEmpSal(float empSal) {
		this.empSal = empSal;
	}
	public boolean isMarritalStatus() {
		return marritalStatus;
	}
	@Override
	public String toString() {
		return "Employee [emplId=" + emplId + ", empCode=" + empCode + ", empName=" + empName + ", empSal=" + empSal
				+ ", marritalStatus=" + marritalStatus + ", age=" + age + ", empType=" + empType + ", empGender="
				+ empGender + "]";
	}
	public void setMarritalStatus(boolean marritalStatus) {
		this.marritalStatus = marritalStatus;
	}
	public Employee(int emplId, String empCode, String empName, float empSal, boolean marritalStatus, int age,
			String empType, char empGender) {
		super();
		this.emplId = emplId;
		this.empCode = empCode;
		this.empName = empName;
		this.empSal = empSal;
		this.marritalStatus = marritalStatus;
		this.age = age;
		this.empType = empType;
		this.empGender = empGender;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmpType() {
		return empType;
	}
	public void setEmpType(String empType) {
		this.empType = empType;
	}
	public char getEmpGender() {
		return empGender;
	}
	public void setEmpGender(char empGender) {
		this.empGender = empGender;
	}
	char empGender;

}
