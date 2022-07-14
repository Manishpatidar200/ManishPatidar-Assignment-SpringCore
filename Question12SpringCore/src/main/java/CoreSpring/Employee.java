package CoreSpring;

public class Employee {
	private double EmpId;
	private String EmpName;
	private String Address;
	private double Salary;

	public Employee(double empId, String empName, String address, double salary) {
		super();
		EmpId = empId;
		EmpName = empName;
		Address = address;
		Salary = salary;
	}

	public String getEmpName() {
		return EmpName;
	}

	public void setEmpName(String empName) {
		EmpName = empName;
	}

	public double getEmpId() {
		return EmpId;
	}

	public void setEmpId(double empId) {
		EmpId = empId;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		Salary = salary;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [EmpName=" + EmpName + ", EmpId=" + EmpId + ", Address=" + Address + ", Salary=" + Salary
				+ "]";
	}

}
