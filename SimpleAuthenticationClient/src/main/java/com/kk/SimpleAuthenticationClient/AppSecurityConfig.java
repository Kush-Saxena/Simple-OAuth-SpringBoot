package com.kk.SimpleAuthenticationClient;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class AppSecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	UserDetailsService userService;

	@Bean
	@Override
	protected UserDetailsService userDetailsService() {
		// TODO Auto-generated method stub

		List<UserDetails> userDetailsList = new ArrayList();
		userDetailsList.add(User.withDefaultPasswordEncoder().username("admin").password("admin").roles("USER").build());
		return new InMemoryUserDetailsManager(userDetailsList);
	}
//	@SuppressWarnings({"deprecation" })
//	public AuthenticationProvider authProvider() {
//		
//		DaoAuthenticationProvider daoAuthProvider = new DaoAuthenticationProvider();
//		daoAuthProvider.setUserDetailsService(userService);
//		daoAuthProvider.setPasswordEncoder(NoOpPasswordEncoder.getInstance());
//		return daoAuthProvider;
//	}

}
