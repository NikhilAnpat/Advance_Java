package pojos;

import java.sql.Date;

public class Employee {
	private int empId;
	private String name;
	private String address;
	private double salary;
	private String deptId;
	private Date joinDate;

	// def ctor : will not be used in JDBC BUT will be mandatory in Hibernate
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	// empid,name,salary,join_date
	public Employee(int empId, String name, double salary, Date joinDate) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.joinDate = joinDate;
	}

	public Employee(String name, String address, double salary, String deptId, Date joinDate) {
		super();
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.deptId = deptId;
		this.joinDate = joinDate;
	}

	// getters n setters
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDeptId() {
		return deptId;
	}

	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", address=" + address + ", salary=" + salary
				+ ", deptId=" + deptId + ", joinDate=" + joinDate + "]";
	}

}
