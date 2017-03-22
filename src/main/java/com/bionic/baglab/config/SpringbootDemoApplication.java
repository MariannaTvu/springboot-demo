package com.bionic.baglab.config;

import com.bionic.baglab.controls.PagesController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.bionic.baglab")
//@EntityScan("com.bionic.baglab.entity")
//@EnableJpaRepositories("com.bionic.baglab")
//@ComponentScan(basePackages = { "com.bionic.baglab" })
//@ComponentScan(basePackageClasses = PagesController.class)
public class SpringbootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDemoApplication.class, args);
	}

	/*@Bean
	public SessionFactory sessionFactory(HibernateEntityManagerFactory hemf){
		return hemf.getSessionFactory();
	}*/
}
