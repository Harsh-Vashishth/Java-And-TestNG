package day3;

public class Employee {
	
	int empId;
	String empName;
	public Employee(int empId, String empName) {//constructor
		this.empId = empId;
		this.empName = empName;
		
	}
	
	void printData() {//method/function
		System.out.println(this.empId+" "+this.empName);
	}
	
	int getEmpId() {//getter
		return this.empId;
	}
	
	void setEmpId(int empId) {//setter
		this.empId = empId;
	}
	
	String getEmpName() {//getter emp name
		return this.empName;
	}
	
	void setEmpName(String empName) {//setter emp name
		this.empName = empName;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee obj = new Employee(101,"Rajat");//this can also be done/called in new class
		obj.printData();

	}
}
