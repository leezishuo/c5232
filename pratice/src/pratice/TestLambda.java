package pratice;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TestLambda {
	
	public static void main(String[] args) {
		List<User> users = getUsers();
		
		users.forEach(u->{
			System.out.println(u.getAge());
			System.out.println(u.getGender().getStr());
			System.out.println(u.getName());
			System.out.println(u.getSalary());
		});
	}
		
	
	private static List<User> getUsers(){
		List<User> users = new ArrayList<>();
		User user1 = new User();
		user1.setAge(1);
		user1.setGender(Gender.FeMale);
		user1.setName("张三");
		user1.setSalary(BigDecimal.valueOf(52.26));
	
		User user2 = new User();
		user2.setAge(2);
		user2.setGender(Gender.Male);
		user2.setName("张四");
		user2.setSalary(BigDecimal.valueOf(25.26));
		
		User user3 = new User();
		user3.setAge(3);
		user3.setGender(Gender.FeMale);
		user3.setName("张五");
		user3.setSalary(BigDecimal.valueOf(38.26));
		
		users.add(user1);
		users.add(user2);
		users.add(user3);
		return users;
	}
}
