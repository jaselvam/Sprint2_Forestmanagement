package com.sprint2;


import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.sprint2.repository.AdminRepository;
import com.sprint2.repository.ContractRepository;
import com.sprint2.repository.CustomerRepository;
import com.sprint2.repository.LandRepository;
import com.sprint2.repository.OrderRepository;
import com.sprint2.repository.ProductRepository;
import com.sprint2.repository.SchedulerRepository;
import com.sprint2.repository.UserRepository;





@SpringBootApplication  // single annotation is equivalent to @Configuration,@EnableAutoConfiguration,@ComponentScan
public class Application {
	@Autowired   // to establish relation with admin repository
	AdminRepository adminrepo;
	@Autowired      // to establish relationship with user repository
	UserRepository userrep;
	@Autowired      // to establish relationship with land repository
	LandRepository landrep;
	@Autowired      // to establish relationship with order repository
	ProductRepository productrep; 
	@Autowired      // to establish relationship with product repository
	ContractRepository contractrep;
	@Autowired      // to establish relationship with contract repository
	SchedulerRepository schrep;
	@Autowired      // to establish relationship with product repository
	CustomerRepository customerrep;
	@Autowired      // to establish relationship with contract repository
	OrderRepository orderrep;
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	/*@Bean
	InitializingBean sendDatabase1()
	{
		return ()->
		{
			adminrepo.save(new Admin("janani","karthikA123"));
			adminrepo.save(new Admin("Hamsi","hamSI123"));
			adminrepo.save(new Admin("Vishnu","vishNU123"));
			adminrepo.save(new Admin("atchaya","atchaYA123"));
		};
	}

	/*@Bean
	InitializingBean sendDatabase2() {
		return () -> {
			userrep.save(new User("janani","karthikA123","cutomer"));
			userrep.save(new User("Hamsi","hamSI123","admin"));
			userrep.save(new User("Vishnu","vishNU123","admin"));
			userrep.save(new User("atchaya","atchaYA123","customer"));
		};
	}*/
}
