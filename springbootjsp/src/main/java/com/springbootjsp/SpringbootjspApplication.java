package com.springbootjsp;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.springbootjsp.Entity.User;
import com.springbootjsp.dao.UserRepo;

@SpringBootApplication
public class SpringbootjspApplication {

	public static void main(String[] args) {
	ApplicationContext context = SpringApplication.run(SpringbootjspApplication.class, args);
		
		UserRepo userRepo = context.getBean(UserRepo.class);
		
		/*
		 * User user = new User(); user.setName("sujan");
		 * user.setCity("salt lake sity"); user.setStatus("I am a java developer"); User
		 * user1 = userRepo.save(user); System.out.println(user1);
		 */
		
		// Create user object
		/*
		User user2 = new User();
		user2.setName("Sophia Pradhan");
		user2.setCity("Salt lake City");
		user2.setStatus("Student");
		
		User user1 = new User();
		user1.setName("binita rai");
		user1.setCity("Salt lake City");
		user1.setStatus("GradeStudent");
		
		// single object
		/*
		 * User save = userRepo.save(user); 
		 * System.out.println("User saved"+save);
		 */
		/*
		List<User> users = List.of(user1,user2);
		Iterable<User> result = userRepo.saveAll(users);
		result.forEach(User->{
			System.out.println(User);
		});
		*/
		//Update for single user
		
		/*Optional<User> optional = userRepo.findById(1);
		User user = optional.get();
		user.setCity("city");
		User result = userRepo.save(user);
		System.out.println(result);
		}*/
	
		/*
		 * Iterable<User> iter = userRepo.findAll(); iter.forEach(user->{
		 * System.out.println(user); });
		 */

		/*
		 * Iterator<User> iterator = iter.iterator(); while(iterator.hasNext()) { User
		 * user =iterator.next(); System.out.println(user); }
		 */
		
		// Deleting User
		
		/*
		 * userRepo.deleteById(1); System.out.println("deleted");
		 */
		
		/*
		 * Iterable<User> alluser = userRepo.findAll();
		 * alluser.forEach(user->System.out.println(user)); userRepo.deleteAll(alluser);
		 */
		/*
		 * List<User> users = userRepo.findByName("sujan");
		 * users.forEach(e->System.out.println(e));
		 */
		
		/*List<User> findByNameAndCity = userRepo.findByNameAndCity("SaltlakeCity", "sophia");
		findByNameAndCity.forEach(e->System.out.println(e));
		*/
		
		/*
		 * List<User> user = userRepo.getAllUser();
		 * user.forEach(User->System.out.println(user));
		 */
		
		List<User> byName = userRepo.getUserByName("sujan","city");
		byName.forEach(e->System.out.println(e));
	}
	
		
}
