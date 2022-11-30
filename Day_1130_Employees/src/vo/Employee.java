package vo;

public class Employee {
	private int empid;
	private String ename;
	private String hiredate;
	private double salary;
	private String departmentname;
	
	public Employee() {
		super();
		
	}
	public Employee(int empid, String ename, String hiredate, double salary, String departmentname) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.hiredate = hiredate;
		this.salary = salary;
		this.departmentname = departmentname;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getHiredate() {
		return hiredate;
	}

	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDepartmentname() {
		return departmentname;
	}

	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + ", hiredate=" + hiredate + ", salary=" + salary
				+ ", departmentname=" + departmentname + "]";
	} 
	
}