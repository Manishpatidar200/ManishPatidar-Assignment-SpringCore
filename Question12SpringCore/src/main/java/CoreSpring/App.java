package CoreSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("my Spring core is started............");
		ApplicationContext context = new ClassPathXmlApplicationContext("\\CoreSpring\\config.xml");
		JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);
		// insert query
//		String Query = "insert into Employee(EmpId,EmpName,Address,Salary) values (?,?,?,?)";
//		// fire query
//		int result = template.update(Query,1, "Manish Patidar", "Ujjain", 89090);
//		System.out.println(+result);
//		String dep = "insert into Department(Id,Dept) values (?,?)";
//		int result1 = template.update(dep,5, "designing");
		
		
		
	}
}
