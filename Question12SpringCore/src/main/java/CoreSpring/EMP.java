package CoreSpring;

import org.springframework.jdbc.core.JdbcTemplate;
 

 

public class EMP {
 
	 
	
	private JdbcTemplate jdbctemplate;

	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}
	 public int saveEmployee(Employee obj)
	 {
		 String query ="insert into  employee (EmpId,EmpName,Address,Salary) values("+obj.getEmpId()+","
				+ "'"+obj.getEmpName()+",'"+obj.getAddress()+",'"+obj.getSalary()+"')";
		return jdbctemplate.update(query); 
	 }
}
