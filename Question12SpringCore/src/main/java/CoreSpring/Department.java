package CoreSpring;

public class Department {
	
	private int Id;
	private String Dept;
	
	
	
	
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getDept() {
		return Dept;
	}
	public void setDept(String dept) {
		Dept = dept;
	}
	public Department(int id, String dept) {
		super();
		Id = id;
		Dept = dept;
	}
	
	@Override
	public String toString() {
		return "Department [Id=" + Id + ", Dept=" + Dept + "]";
	}
	
	
	

}
