package pratice;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class TestLambda {
	
	public static void main(String[] args) {
		List<User> users = getUsers();
		List<Department> departments = getDepartments();
		
		/* 
		 * 1.forEach -- eager方法，循环对每个元素执行相关指令
		 * 2.filter -- lazy方法，用于过滤数据
		 * 3.map -- lazy方法，用于转变Stream
		 * 4.flatMap -- lazy方法，用于将多个Stream转换成一个Stream
		 * 5. reduce -- eager方法，实现从一组值中生成一个值
		 * 6. sum、count、min、max -- eager方法，可以认为是封装reduce后的常用方法
		 * 7. collect -- eager方法，用于将Stream转换成集合或Map
		 */
		
		//1.遍历所有用户
		users.forEach(user->{
			System.out.println(user.getName()+" | "+user.getGender()+" | "+user.getAge()+" | "+user.getSalary());
		});
		
		//2. 过滤数据性别为女的用户
		users.stream()
			.filter(user -> user.getGender().getStr().equals("女"))
			.forEach(user -> {
				System.out.println(user.getName()+" | "+user.getGender()+" | "+user.getAge()+" | "+user.getSalary());
			});
		
		//3.年龄加10  下面使用map改成了int stream，也可以转变成string/long/double 的stream
		users.stream()
			.map(user -> (user.getAge() + 10))
			.forEach(System.out::println);
		
		//4.flatmap 用于将多个Stream转换成一个Stream
		
		//5. reduce
	
		//6. sum、count、min、max
		//6.1 count 统计年龄等于1的用户
		long count = users.stream()
							.filter(user -> user.getAge()==1)
							.count();
		System.out.println("age=1的人数  ："+count);
		//6.2  sum 工资总和
		double sum = 
					users.stream()
						.mapToDouble(user -> user.getSalary().doubleValue())
						.sum();
		System.out.println("工资总和 = "+sum);
		//6.3  min  工资最低
		OptionalDouble min = 
					users.stream()
						.mapToDouble(user -> user.getSalary().doubleValue())
						.min();
		System.out.println("工资最低 = "+min);
		//6.4  max  工资最高
		OptionalDouble max =
						users.stream()
							.mapToDouble(user -> user.getSalary().doubleValue())
							.max();
		System.out.println("工资最高 = "+max);
		
		//7.collect
		List<String> genders = 
				users.stream()
					.map(user -> user.getGender().getStr())
					.distinct()
					.collect(Collectors.toList());
		genders.forEach(gender -> System.out.println(gender));	
				
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
		user3.setName("李四");
		user3.setSalary(BigDecimal.valueOf(38.26));
		
		users.add(user1);
		users.add(user2);
		users.add(user3);
		return users;
	}
	
	private static List<Department> getDepartments(){
		List<Department> departments = new ArrayList<>();
		Department department1 = new Department();
		department1.setDepartmentEN("dwOne");
		department1.setDepartmentName("单位1");
		department1.setDepartmentNO("001");
		
		Department department2 = new Department();
		department2.setDepartmentEN("dwTwo");
		department2.setDepartmentName("单位2");
		department2.setDepartmentNO("002");
		
		Department department3 = new Department();
		department3.setDepartmentEN("dwThree");
		department3.setDepartmentName("单位3");
		department3.setDepartmentNO("003");
		
		departments.add(department1);
		departments.add(department2);
		departments.add(department3);
		return departments;
	}
	
	
}
