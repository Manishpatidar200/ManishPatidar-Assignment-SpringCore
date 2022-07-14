package CoreSpring;

import org.springframework.jdbc.core.JdbcTemplate;

public class DEPT {
	private JdbcTemplate jdbctemplate;

	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}
	 public int saveDepartment(Department object)
	 {
		 String dep ="insert into  employee (Id,dept) values("+object.getId()+","
				+ "'"+object.getDept()+"')";
		return jdbctemplate.update(dep); 
	 }
}
