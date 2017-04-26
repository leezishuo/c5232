package pratice;

import java.util.List;

public class Department {
	
	private String departmentNO;
	private String departmentName;
	private String departmentEN;
	private List<User> users;
	
	public String getDepartmentNO() {
		return departmentNO;
	}
	public void setDepartmentNO(String departmentNO) {
		this.departmentNO = departmentNO;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getDepartmentEN() {
		return departmentEN;
	}
	public void setDepartmentEN(String departmentEN) {
		this.departmentEN = departmentEN;
	}
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	
	
}
