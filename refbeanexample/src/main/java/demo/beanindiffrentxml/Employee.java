/**
 * 
 */
package demo.beanindiffrentxml;

/**
 * @author PrashantChitte
 *
 */
public class Employee {

	private int empId;
	private String empName;
	private Insurence InsuObj;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Insurence getInsuObj() {
		return InsuObj;
	}

	public void setInsuObj(Insurence insuObj) {
		InsuObj = insuObj;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int empId, String empName, Insurence insuObj) {
		super();
		this.empId = empId;
		this.empName = empName;
		InsuObj = insuObj;
	}

	public void display() {
		System.out.println("EmpID         :" + empId);
		System.out.println("EmpName       :" + empName);
		System.out.println("Insurence ID  :" + getInsuObj().getInsuId());
		System.out.println("Insurence Name:" + getInsuObj().getName());
	}

}
